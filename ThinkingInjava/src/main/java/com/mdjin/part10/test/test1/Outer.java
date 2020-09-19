/**  
* <p>Title: Outer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part10.test.test1;

/**  
* <p>Title: Outer</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class Outer {

	/** key*/  
	private String key = "key";
	
	/**  
	* <p>Title: Inner</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8
	* 内部类
	*/ 
	class Inner{
		
		/**  
		 * <p>Title: sayHello</p>  
		 * <p>Description: </p>    
		 */  
		void sayHello() {
			System.out.println("Hello World.");
		}
		
	}
	
	/**  
	 * <p>Title: getInnerObject</p>  
	 * <p>Description: </p>  
	 * @return  
	 */  
	Inner getInnerObject() {
		return new Inner();
	}
	
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		Outer o = new Outer();
		Inner in = o.getInnerObject();
		in.sayHello();
		Outer.Inner in2 = o.getInnerObject();
		in2.sayHello();
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
}
