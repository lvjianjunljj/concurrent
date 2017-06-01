package concurrent4.thread;

public class Runnable06 implements Runnable {

	private String username;

	public Runnable06(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " "
					+ username + System.currentTimeMillis());
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " "
					+ username + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
