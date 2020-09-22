/**  
* <p>Title: Fibonacci.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-22  
* @version 1.0  
*/  
package com.mdjin.part21.test.test5;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibonacciTest2{
	
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[])
	{
		ExecutorService service = Executors.newCachedThreadPool();
		for(int i = 0; i < 20; i++) {
//			result.add(service.submit(new Fibonacci2(i)));
			service.submit(new Fibonacci2(i));
		}
	}
	
}

/**  
* <p>Title: 斐波那契数列</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-22  
*/
class Fibonacci2 implements  Runnable/*, Callable<String>*/{

	/** 返回数列长度*/  
	private int n = 0;
	
	/**  
	* <p>Title: </p>  
	* <p>Description: </p>  
	* @param _n  
	*/  
	public Fibonacci2(int _n) {
		n = _n;
	}

	/* (non-Javadoc)  
	 * <p>Title: call</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception  
	 * @see java.util.concurrent.Callable#call()  
	 */
//	@Override
//	public String call() throws Exception {
//		return calcNums(n).toString();
//	}

	/* (non-Javadoc)  
	 * <p>Title: run</p>  
	 * <p>Description: </p>    
	 * @see java.lang.Runnable#run()  
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(calcNums(n).toString());
	}
	
	/**  
	 * <p>Title: calcNums</p>  
	 * <p>Description: </p>  
	 * @param n
	 * @return  
	 */  
	private ArrayList<Integer> calcNums(int n) {
		int count = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(count < n) {
//			System.out.println("当前线程ID："+this.toString()+"——"+count);
			if(0 == count || 1 == count) {
				nums.add(1);
			}else {
				nums.add(nums.get(count - 1) + nums.get(count - 2));
			}
			count++;
		}
		return nums;
	}
	
	
}
