/**  
* <p>Title: MainThread.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-20  
* @version 1.0  
*/  
package com.mdjin.part21.test.test1;

/**  
* <p>Title: MainThread</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-20  
*/
public class MainThread {

	static int count = 5;
	
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		for(int i = 0; i < count; i++) {
			new Thread(new PrintThread(i)).start();
		}
	}
	
}
