/**  
* <p>Title: CallableDemo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-21  
* @version 1.0  
*/
package com.mdjin.part21.concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p>
 * Title: CallableDemo
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author JinMaoDong
 * @date 2020-9-21
 */
public class CallableDemo {

	/**
	 * <p>
	 * Title: main
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ExecutorService service = Executors.newCachedThreadPool();
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		for (int i = 0; i < 5; i++) {
			list.add(service.submit(new TaskWithResult(i)));
		}
		list.forEach(item -> {
			try {
				System.out.println(item.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}finally {
				service.shutdown();
			}
		});
	}

}

/**
 * <p>
 * Title: TaskWithResult
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author JinMaoDong
 * @date 2020-9-22
 */
class TaskWithResult implements Callable<String> {

	/** id */
	private int id;

	public TaskWithResult(int _id) {
		id = _id;
	}

	/*
	 * (non-Javadoc) <p>Title: call</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see java.util.concurrent.Callable#call()
	 */
	public String call() throws Exception {
		return "result of TaskWithResult is : " + id;
	}

}