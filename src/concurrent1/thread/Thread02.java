package concurrent1.thread;

import concurrent1.service.Service02;

public class Thread02 extends Thread {
	private Service02 service;

	public Thread02(Service02 service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
