package concurrent1.test;

import java.util.concurrent.Exchanger;

import concurrent1.service.ListPool;
import concurrent1.service.Service01;
import concurrent1.service.Service02;
import concurrent1.service.Service03;
import concurrent1.service.Service04;
import concurrent1.service.Service05;
import concurrent1.service.Service06;
import concurrent1.thread.Thread01;
import concurrent1.thread.Thread02;
import concurrent1.thread.Thread03;
import concurrent1.thread.Thread04;
import concurrent1.thread.Thread05;
import concurrent1.thread.Thread06;
import concurrent1.thread.Thread07C;
import concurrent1.thread.Thread07P;
import concurrent1.thread.Thread08;
import concurrent1.thread.Thread09A;
import concurrent1.thread.Thread09B;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		/*
		Service01 service = new Service01();
		Thread01 a = new Thread01(service);
		Thread01 b = new Thread01(service);
		Thread01 c = new Thread01(service);
		a.setName("A");
		b.setName("B");
		c.setName("C");
		a.start();
		b.start();
		c.start();
		*/
		
		/*
		Service02 service = new Service02();
		Thread02 a = new Thread02(service);
		Thread02 b = new Thread02(service);
		Thread02 c = new Thread02(service);
		a.setName("A");
		b.setName("B");
		c.setName("C");
		a.start();
		b.start();
		c.start();
		*/
		
		/*
		Service03 service = new Service03();
		Thread03[] threads = new Thread03[10]; 
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread03(service);
			threads[i].start();
		}
		*/
		
		/*
		Service04 service = new Service04();
		Thread04[] threads = new Thread04[10]; 
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread04(service);
			threads[i].start();
		}
		*/
		
		/*
		Service05 service = new Service05();
		Thread05[] threads = new Thread05[10]; 
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread05(service);
			threads[i].start();
		}
		*/
		
		/*把取出和放入都写在一个Thread中，这没有任何意义
		ListPool listPool = new ListPool(1, 5);
		Thread06 thread = new Thread06(listPool);
		thread.setName("A");
		thread.start();
		*/
		
		/*
		Service06 service = new Service06();
		Thread07P[] pArray = new Thread07P[60];
		Thread07C[] cArray = new Thread07C[60];
		for (int i = 0; i < 60; i++) {
			pArray[i] = new Thread07P(service);
			cArray[i] = new Thread07C(service);
		}
		for (int i = 0; i < 60; i++) {
			pArray[i].start();
			cArray[i].start();
		}
		*/
		
		/*
		Exchanger<String> exchanger = new Exchanger<String>();
		Thread08 thread = new Thread08(exchanger);
		thread.start();
		System.out.println("main end");
		*/
		
		
		Exchanger<String> exchanger = new Exchanger<String>();
		Thread09A threadA = new Thread09A(exchanger);
		Thread09B threadB = new Thread09B(exchanger);
		threadA.start();
		threadB.start();
		
		
		
		
		
		
		
		
		
		
	}
}
