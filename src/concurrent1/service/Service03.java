package concurrent1.service;

import java.util.concurrent.Semaphore;

public class Service03 {
	private Semaphore semaphore = new Semaphore(10);
	
	public void testMethod() {
		try {
			//acquire()方法其实就是acquire(1)
			semaphore.acquire(2);
			System.out.println(Thread.currentThread().getName() + " begin time: " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " end time: " + System.currentTimeMillis());
			semaphore.release(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
