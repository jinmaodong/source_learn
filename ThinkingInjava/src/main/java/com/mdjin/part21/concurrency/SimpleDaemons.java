/**  
* <p>Title: SimpleDaemons.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-10-3  
* @version 1.0  
*/
package com.mdjin.part21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static com.mdjin.util.Print.*;

/**
 * <p>
 * Title: SimpleDaemons
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author JinMaoDong
 * @date 2020-10-3
 */
public class SimpleDaemons implements Runnable {

	/*
	 * (non-Javadoc) <p>Title: run</p> <p>Description: </p>
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// print(Thread.currentThread() + " " + this);
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(1);
				print(Thread.currentThread() + " " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws InterruptedException {
		DaemonThreadFactory factory = new DaemonThreadFactory();
		//3.使用线程池创建
		ExecutorService service = Executors.newCachedThreadPool(factory);
		for (int i = 0; i < 10; i++) {
			//1.直接创建
//			Thread daemonThread = new Thread(new SimpleDaemons());
//			daemonThread.setDaemon(true);
//			daemonThread.start();
			//2.调用工厂方法创建
//			Thread daemonThread = factory.newThread(new SimpleDaemons());
//			daemonThread.start();

			service.execute(new SimpleDaemons());
		}
		print("All Thread started.");
		TimeUnit.MICROSECONDS.sleep(1000);
	}
}
