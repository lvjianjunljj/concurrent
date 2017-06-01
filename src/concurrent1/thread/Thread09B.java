package concurrent1.thread;

import java.util.concurrent.Exchanger;

public class Thread09B extends Thread {

	private Exchanger<String> exchanger;

	public Thread09B(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B"));
			System.out.println("B end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
