package concurrent1.thread;

import concurrent1.service.ListPool;

public class Thread06 extends Thread{
	private ListPool listPool;
	public Thread06(ListPool listPool) {
		this.listPool = listPool;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String getString = listPool.get();
			System.out.println(Thread.currentThread().getName() + " 取得值：" + getString);
			listPool.put(getString);
		}
	}
}
