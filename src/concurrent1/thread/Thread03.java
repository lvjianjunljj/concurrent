package concurrent1.thread;

import concurrent1.service.Service03;

public class Thread03 extends Thread {
	private Service03 service;

	public Thread03(Service03 service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
