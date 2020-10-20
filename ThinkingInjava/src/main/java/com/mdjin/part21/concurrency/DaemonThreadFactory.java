/**  
* <p>Title: DaemonThreadFactory.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-10-3  
* @version 1.0  
*/  
package com.mdjin.part21.concurrency;

import java.util.concurrent.ThreadFactory;

/**  
* <p>Title: DaemonThreadFactory</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-10-3  
*/
public class DaemonThreadFactory implements ThreadFactory {

	static long count = 1;
	
	/* (non-Javadoc)  
	 * <p>Title: newThread</p>  
	 * <p>Description: </p>  
	 * @param r
	 * @return  
	 * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable)  
	 */
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r);
		//设置为后台线程
		t.setDaemon(true);
		t.setName("daemonThread-"+count++);
		return t;
	}

}
