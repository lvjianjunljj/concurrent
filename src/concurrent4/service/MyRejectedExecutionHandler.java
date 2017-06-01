package concurrent4.service;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import concurrent4.thread.Runnable06;

public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((Runnable06) r).getUsername() + " 被拒绝执行");
	}
}
