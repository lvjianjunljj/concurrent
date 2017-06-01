package concurrent1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListPool {
	private List<String> list = new ArrayList<String>();
	private Semaphore semaphore;
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public ListPool(int poolMaxSize, int semaphorePermits) {
		semaphore = new Semaphore(semaphorePermits);
		for (int i = 0; i < poolMaxSize; i++) {
			list.add("test " + (i + 1));
		}
	}

	public String get() {
		String getString = null;
		try {
			semaphore.acquire();
			lock.lock();
			while (list.isEmpty()) {
				condition.await();
			}
			getString = list.remove(0);
			lock.unlock();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		return getString;
	}

	public void put(String stringValue) {
		lock.lock();
		list.add(stringValue);
		condition.signalAll();
		lock.unlock();
		semaphore.release();
	}
}
