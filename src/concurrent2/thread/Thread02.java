package concurrent2.thread;

import java.util.concurrent.CountDownLatch;

public class Thread02 extends Thread {
	private CountDownLatch maxRunner;
	
	public Thread02(CountDownLatch maxRunner) {
		this.maxRunner = maxRunner;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			maxRunner.countDown();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
