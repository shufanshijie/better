package shang.better.lock;

public class TestSpinLock implements Runnable{
	
	private static int sum;
	
	private SpinLock lock;
	
	public TestSpinLock(SpinLock lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {
		this.lock.lock();
		this.lock.lock();
		sum ++;
		this.lock.unlock();
		this.lock.unlock();
	}

	public static void main(String[] args) throws InterruptedException {
		SpinLock lock = new SpinLock();
		for(int i=0;i<100;i++){
			TestSpinLock test = new TestSpinLock(lock);
			Thread thread = new Thread(test);
			thread.start();
		}
		Thread.currentThread().sleep(1000);
		System.out.println(sum);
	}
}
