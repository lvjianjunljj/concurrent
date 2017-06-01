package concurrent1.thread;

import java.util.concurrent.Exchanger;

public class Thread08 extends Thread {

	private Exchanger<String> exchanger;

	public Thread08(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("中国人A"));
			System.out.println("A end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
