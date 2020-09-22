/**  
* <p>Title: PrintThread.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-20  
* @version 1.0  
*/  
package com.mdjin.part21.test.test1;

/**  
* <p>Title: PrintThread</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-20  
*/
public class PrintThread implements Runnable{

	/** printCount*/  
	final static int printCount = 3;
	
	/** threadId*/  
	static int threadId = 0;
	
	/* (non-Javadoc)  
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see java.lang.Runnable#run()  
	 */
	public void run() {
		int count = printCount;
		while(count -- > 0) {
			System.out.println("printCount:"+printCount);
		}
		System.out.println("end Thread.");
	}

	public PrintThread(int _threadId) {
		threadId = _threadId;
		System.out.println("start Thread,its id is:"+threadId);
	}
	
}
