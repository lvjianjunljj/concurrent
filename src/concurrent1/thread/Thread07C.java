package concurrent1.thread;

import concurrent1.service.Service06;

public class Thread07C extends Thread{
	private Service06 service;
	public Thread07C(Service06 service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.get();
	}
}
