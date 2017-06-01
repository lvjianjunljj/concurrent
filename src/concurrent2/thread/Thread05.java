package concurrent2.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread05 extends Thread {

	private CyclicBarrier cbRef;

	public Thread05(CyclicBarrier cbRef) {
		this.cbRef = cbRef;
	}

	@Override
	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " 到了！ "
					+ System.currentTimeMillis());
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " 准备好了！ "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
