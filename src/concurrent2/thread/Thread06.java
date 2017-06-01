package concurrent2.thread;

import concurrent2.service.Service03;

public class Thread06 extends Thread{
	private Service03 service;

	public Thread06(Service03 service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.beginRun();
	}
}
