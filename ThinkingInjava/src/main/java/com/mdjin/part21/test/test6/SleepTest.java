/**  
* <p>Title: SleepTest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-22  
* @version 1.0  
*/  
package com.mdjin.part21.test.test6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**  
* <p>Title: SleepTest</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-22  
*/
public class SleepTest {
	
	static int testCount = 17;
	
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		ExecutorService service = Executors.newCachedThreadPool();
		while(testCount>0) {
			service.submit(new SleepTask(testCount--));
		}
		service.shutdown();
	}
	
}


/**  
* <p>Title: SleepTask</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-22  
*/ 
class SleepTask implements Callable<String>{

	final int sleepTime = (int)(Math.random()*10+1);
	
	int id = 0;
	
	/**  
	* <p>Title: </p>  
	* <p>Description: </p>  
	* @param i  
	*/  
	public SleepTask(int i) {
		id = i;
	}

	/* (non-Javadoc)  
	 * <p>Title: call</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception  
	 * @see java.util.concurrent.Callable#call()  
	 */
	@Override
	public String call() throws Exception {
		System.out.println("#"+id+":i will sleep,time is:"+System.currentTimeMillis());
		TimeUnit.SECONDS.sleep(sleepTime);
		System.out.println("#"+id+":i will awake,time is:"+System.currentTimeMillis());
		System.out.println("#"+id+":sleepTime is:"+sleepTime+"s");
		return String.valueOf(sleepTime);
	}
	
}