package concurrent4.thread;

public class Runnable05 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + System.currentTimeMillis());
		String abc = null;
		abc.indexOf(0);
		System.out.println(Thread.currentThread().getName() + ":" + System.currentTimeMillis());
	}
}
