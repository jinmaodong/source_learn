/**  
* <p>Title: SingleThreadPool.java</p>  
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
* <p>Title: SingleThreadPool</p>  
* <p>Description: 开启唯一工作线程，以单个线程执行任务，多个任务需排队</p>  
* @author JinMaoDong
* @date 2020-9-21  
*/
public class SingleThreadPool {

	public static void main(String args[]) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++) {
//			service.execute(new ListOff());
			service.execute(new ListOffThread());
		}
		service.shutdown();
	}
	
}
