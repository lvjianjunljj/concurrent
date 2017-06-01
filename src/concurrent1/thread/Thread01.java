package concurrent1.thread;

import concurrent1.service.Service01;

public class Thread01 extends Thread {
	private Service01 service;

	public Thread01(Service01 service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
