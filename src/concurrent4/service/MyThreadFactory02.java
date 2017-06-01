package concurrent4.service;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory02 implements ThreadFactory{
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("我的新名称：" + new Date());
		thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("自定义处理异常启用：" + t.getName() + " " + e.getMessage());
				e.printStackTrace();
			}
		});
		return thread;
	}
}
