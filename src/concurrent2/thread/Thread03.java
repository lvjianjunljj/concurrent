package concurrent2.thread;

import concurrent2.service.Service02;


public class Thread03 extends Thread {
	private Service02 service;

	public Thread03(Service02 service) {
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
