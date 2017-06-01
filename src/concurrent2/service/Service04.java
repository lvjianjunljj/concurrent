package concurrent2.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Service04 {

	private CyclicBarrier cbRef;

	public Service04(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	private void beginRun(int count) {
		try {
			System.out.println(Thread.currentThread().getName()
					+ " 到了 在等待其它人都到了开始起跑");
			if (Thread.currentThread().getName().equals("Thread-2")) {
				System.out.println("thread-2进来了");
				Thread.sleep(2000);
				Thread.currentThread().interrupt();
//				Integer.parseInt("a");
			}
			if (Thread.currentThread().getName().equals("Thread-3")) {
				System.out.println("thread-3进来了。。。稍等");
				Thread.sleep(3000);
			}
			cbRef.await();
			System.out.println("都到了，开始跑!");
			System.out.println(Thread.currentThread().getName() + " 到达终点，并结束第"
					+ count + "赛段");
		} catch (InterruptedException e) {
			System.out.println("进入了InterruptedException e " + cbRef.isBroken());
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("进入了BrokenBarrierException e "
					+ cbRef.isBroken());
			e.printStackTrace();
		}

	}

	public void testA() {
		// 比赛1个赛段
		for (int i = 0; i < 1; i++) {
			beginRun(i + 1);
		}
	}
}
