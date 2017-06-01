package concurrent1.thread;

import concurrent1.service.Service05;

public class Thread05 extends Thread {
	private Service05 service;

	public Thread05(Service05 service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
