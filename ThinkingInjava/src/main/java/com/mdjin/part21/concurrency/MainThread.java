/**  
* <p>Title: MainThread.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-19  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

/**  
* <p>Title: MainThread</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-19  
*/
public class MainThread {

	public static void main(String args[]) {
		//实现Runnable接口并不会产生任何内在的线程行为，要实现线程行为，必须显式的将一个任务附着到线程上。
		ListOff lo = new ListOff();
		lo.run();
		System.out.println("123");
	}
	
}
