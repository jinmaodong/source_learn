/**  
* <p>Title: FixedThreadPool.java</p>  
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
* <p>Title: FixedThreadPool</p>  
* <p>Description:开启指定数量线程，任务多则排队 </p>  
* @author JinMaoDong
* @date 2020-9-21  
*/
public class FixedThreadPool {

	public static void main(String args[]) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(int i = 0; i < 10; i++) {
			service.execute(new ListOff());
		}
		service.shutdown();
	}
	
}
