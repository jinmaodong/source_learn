/**  
* <p>Title: CachedThreadPool.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-21  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
* <p>Title: CachedThreadPool</p>  
* <p>Description:同时启动多个线程执行任务，线程数量不限制，并且过程中会回收可回收线程以重用 </p>  
* @author JinMaoDong
* @date 2020-9-21  
*/
public class CachedThreadPool {

	public static void main(String args[]) {
		ExecutorService service = Executors.newCachedThreadPool();
		for(int i = 0; i < 50; i++) {
			service.execute(new ListOff());
		}
		service.shutdown();
	}
	
}
