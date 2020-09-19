/**  
* <p>Title: MoreBasicThreads.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-19  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

/**  
* <p>Title: MoreBasicThreads</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-19  
*/
public class MoreBasicThreads {

	public static void main(String args[]) {
		
		for(int i = 0; i < 10; i++) {
			new Thread(new ListOff()).start();
		}
		System.out.println("main off.");
	}
	
}
