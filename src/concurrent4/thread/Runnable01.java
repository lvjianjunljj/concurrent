package concurrent4.thread;

public class Runnable01 implements Runnable {

	String username;

	public Runnable01(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " username="
				+ username + " begin " + System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName() + " username="
				+ username + "   end " + System.currentTimeMillis());
	}
}
