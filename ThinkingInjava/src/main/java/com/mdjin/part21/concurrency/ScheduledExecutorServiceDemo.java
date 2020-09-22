/**  
* <p>Title: ScheduledExecutorServiceDemo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-21  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**  
* <p>Title: ScheduledExecutorServiceDemo</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-21  
*/
public class ScheduledExecutorServiceDemo {

	public static void main(String args[]) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		for(int i = 0; i < 10; i++) {
//			service.execute(new ListOff());
//			service.schedule(new ListOff(), 3, TimeUnit.SECONDS);
			service.schedule(new ListOffThread(), 3, TimeUnit.SECONDS);
		}
		service.shutdown();
	}
	
}
