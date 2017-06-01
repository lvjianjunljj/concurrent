package concurrent1.thread;

import concurrent1.service.Service04;

public class Thread04 extends Thread {
	private Service04 service;

	public Thread04(Service04 service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
