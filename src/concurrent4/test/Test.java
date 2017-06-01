package concurrent4.test;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import concurrent4.service.MyRejectedExecutionHandler;
import concurrent4.service.MyThreadFactory01;
import concurrent4.service.MyThreadFactory02;
import concurrent4.thread.Runnable01;
import concurrent4.thread.Runnable02;
import concurrent4.thread.Runnable03;
import concurrent4.thread.Runnable04;
import concurrent4.thread.Runnable05;
import concurrent4.thread.Runnable06;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		/*
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("Runnable1 begin "
							+ System.currentTimeMillis());
					Thread.sleep(1000);
					System.out.println("A");
					System.out.println("Runnable1   end "
							+ System.currentTimeMillis());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("Runnable2 begin "
							+ System.currentTimeMillis());
					Thread.sleep(1000);
					System.out.println("B");
					System.out.println("Runnable2   end "
							+ System.currentTimeMillis());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		*/
		
		/*
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable01("" + (i + 1)));
		}
		*/
		
		/*
		ThreadFactory threadFactory = new MyThreadFactory01();
		ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("我在运行 " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
			}
		});
		*/
		
		/*
		Runnable thread = new Runnable02();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 999L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(thread);
		pool.execute(thread);
		pool.execute(thread);
		pool.execute(thread);
		Thread.sleep(1000);
		pool.shutdownNow();
		*/
		
		/*
		Runnable03 myRunnable = new Runnable03();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("C=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("D=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("E=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("F=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		System.out.println("G=" + pool.awaitTermination(1, TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis());
		*/
		
		/*
		Runnable04 myRunnable = new Runnable04();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.shutdown();
		pool.awaitTermination(Integer.MAX_VALUE,TimeUnit.SECONDS);
		System.out.println(System.currentTimeMillis() + " 全部任务执行完毕！");
		*/
		
		/*
		Runnable05 thread = new Runnable05();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), new MyThreadFactory02());
		pool.execute(thread);
		*/
		
		/*
		Runnable06 thread1 = new Runnable06("first");
		Runnable06 thread2 = new Runnable06("second");
		Runnable06 thread3 = new Runnable06("third");
		Runnable06 thread4 = new Runnable06("forth");
		ThreadPoolExecutor pool  = new ThreadPoolExecutor(2, 3, 9999L, 
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		pool.execute(thread1);
		pool.execute(thread2);
		pool.execute(thread3);
		pool.execute(thread4);
		*/
		
		Runnable06 thread1 = new Runnable06("first");
		Runnable06 thread2 = new Runnable06("second");
		Runnable06 thread3 = new Runnable06("third");
		Runnable06 thread4 = new Runnable06("forth");
		ThreadPoolExecutor pool  = new ThreadPoolExecutor(2, 3, 9999L, 
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		pool.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
		pool.execute(thread1);
		pool.execute(thread2);
		pool.execute(thread3);
		pool.execute(thread4);
		
		
		
		
		
		
		
		
	}
}
