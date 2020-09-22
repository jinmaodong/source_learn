/**  
* <p>Title: ListOffThread.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-21  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

/**  
* <p>Title: ListOffThread</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-21  
*/
public class ListOffThread extends Thread{


	/** countDown*/  
	protected int countDown = 10;
	
	/** taskCount*/  
	private static int taskCount = 0;
	
	/** id*/  
	private final int id = taskCount++;
	
	/**  
	* <p>Title: </p>  
	* <p>Description: </p>    
	*/  
	public ListOffThread() {};
	
	/**  
	* <p>Title: </p>  
	* <p>Description: </p>  
	* @param _countDown  
	*/  
	public ListOffThread(int _countDown){
		this.countDown = _countDown;
	}
	
	/**  
	 * <p>Title: status</p>  
	 * <p>Description: </p>  
	 * @return  
	 */  
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "ListOff!") + ").";
	}
	
	/* (non-Javadoc)  
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see java.lang.Runnable#run()  
	 */
	public void run() {
		// TODO Auto-generated method stub
		while(countDown -- > 0) {
			System.out.println(status());
			Thread.yield();
		}
//		System.out.println();
	}




}
