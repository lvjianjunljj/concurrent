package concurrent1.service;

import java.util.concurrent.Semaphore;

public class Service01 {
	private Semaphore semaphore = new Semaphore(1);
	
	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " begin time: " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " end time: " + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
