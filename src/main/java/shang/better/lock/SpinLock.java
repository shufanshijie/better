package shang.better.lock;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {
	
	private AtomicReference<Thread> owner = new AtomicReference<Thread>();//持有自旋锁的线程对象
	
	private int count;//用一个计数器 来做 重入锁获取次数的计数
	
	public void lock(){
		Thread currentThread = Thread.currentThread();
		if(currentThread == owner.get()){
			count ++;
			System.out.println("count ++ "+count);
			return;
		}
		while(!owner.compareAndSet(null, currentThread)){//循环获取锁
			
		}
	}
	
	public void unlock(){
		Thread currentThread = Thread.currentThread();
		if(currentThread == owner.get()){
			if(count >0 ){
				count --;
				System.out.println("count -- "+count);
			}else{
				owner.compareAndSet(currentThread, null);
			}
		}
	}
	
}
