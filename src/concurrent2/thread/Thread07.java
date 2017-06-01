package concurrent2.thread;

import concurrent2.service.Service04;

public class Thread07  extends Thread {

	private Service04 service;

	public Thread07(Service04 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testA();
	}

}
