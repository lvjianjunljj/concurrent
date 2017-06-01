package concurrent2.thread;

import concurrent2.service.Service01;

public class Thread01 extends Thread{
	
	private Service01 service;
	
	public Thread01(Service01 service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
