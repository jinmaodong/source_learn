/**  
* <p>Title: BasicThreads.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-19  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

/**  
* <p>Title: BasicThreads</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-19  
*/
public class BasicThreads {

	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		
		Thread t = new Thread(new ListOff());
		t.start();
		System.out.println("main off");
		
	}
	
}
