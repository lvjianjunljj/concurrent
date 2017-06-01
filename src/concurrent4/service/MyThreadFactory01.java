package concurrent4.service;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory01 implements ThreadFactory{
	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("定制池中线程对象的名称：" + Math.random());
		return thread;
	}
}
