/**  
* <p>Title: ListOff.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-19  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

/**  
* <p>Title: ListOff</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-19  
*/
public class ListOff implements Runnable{

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
	public ListOff() {};
	
	/**  
	* <p>Title: </p>  
	* <p>Description: </p>  
	* @param _countDown  
	*/  
	public ListOff(int _countDown){
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
			System.out.print(status());
			Thread.yield();
		}
//		System.out.println();
	}

}

