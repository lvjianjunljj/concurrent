package concurrent1.thread;

import concurrent1.service.Service06;

public class Thread07P extends Thread{
	private Service06 service;
	public Thread07P(Service06 service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.set();
	}
}
