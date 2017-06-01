package concurrent2.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import concurrent2.service.Service01;
import concurrent2.service.Service02;
import concurrent2.service.Service03;
import concurrent2.service.Service04;
import concurrent2.thread.Thread01;
import concurrent2.thread.Thread02;
import concurrent2.thread.Thread03;
import concurrent2.thread.Thread04;
import concurrent2.thread.Thread06;
import concurrent2.thread.Thread07;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		/*
		 Service01 service = new Service01(); Thread01 thread = new
		 Thread01(service); thread.start(); Thread.sleep(3000);
		 service.downMethod();
		 */

		/*
		CountDownLatch maxRunner = new CountDownLatch(10);
		Thread02[] array = new Thread02[(int) maxRunner.getCount()];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Thread02(maxRunner);
			array[i].setName("线程" + (i + 1));
			array[i].start();
		}
		System.out.println(System.currentTimeMillis());
		maxRunner.await();
		System.out.println("都来了");
		System.out.println(System.currentTimeMillis());
		*/
		
		/*
		Service02 service = new Service02();
		Thread03[] array = new Thread03[10];
		for (int i = 0; i < 10; i++) {
			array[i] = new Thread03(service);
			array[i].setName("线程" + (i + 1));
			array[i].start();
		}
		Thread.sleep(2000);
		service.downMethod();
		*/
		
		/*
		try {
			CountDownLatch comingTag = new CountDownLatch(10);
			CountDownLatch waitTag = new CountDownLatch(1);
			CountDownLatch waitRunTag = new CountDownLatch(10);
			CountDownLatch beginTag = new CountDownLatch(1);
			CountDownLatch endTag = new CountDownLatch(10);

			Thread04[] threadArray = new Thread04[10];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new Thread04(comingTag, waitTag, waitRunTag,
						beginTag, endTag);
				threadArray[i].start();
			}
			System.out.println("裁判员在等待选手的到来！");
			comingTag.await();
			System.out.println("裁判看到所有运动员来了，各就各位前“巡视”用时5秒");
			Thread.sleep(5000);
			waitTag.countDown();
			System.out.println("各就各位！");
			waitRunTag.await();
			Thread.sleep(2000);
			System.out.println("发令枪响起！");
			beginTag.countDown();
			endTag.await();
			System.out.println("所有运动员到达，统计比赛名次！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		CyclicBarrier cbRef = new CyclicBarrier(6, new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					System.out.println("全都到了" + System.currentTimeMillis());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread05[] array = new Thread05[12];
		for (int i = 0; i < 10; i++) {
			array[i] = new Thread05(cbRef);
			array[i].setName("线程" + (i + 1));
			array[i].start();
		}
		*/
		
		/*
		CyclicBarrier cbRef = new CyclicBarrier(2);
		Service03 service = new Service03(cbRef);
		Thread06[] array = new Thread06[6];
		for (int i = 0; i < 6; i++) {
			array[i] = new Thread06(service);
			array[i].setName("线程" + (i + 1));
			array[i].start();
		}
		*/
		/*
		int parties = 5;
		CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("都到了！！！");
			}
		});
		Service04 service = new Service04(cbRef);
		Thread07[] array = new Thread07[5];
		for (int i = 0; i < 5; i++) {
			array[i]  = new Thread07(service);
			array[i].start();
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
