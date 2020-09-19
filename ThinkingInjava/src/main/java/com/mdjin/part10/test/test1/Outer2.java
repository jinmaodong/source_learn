/**  
* <p>Title: Outer2.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part10.test.test1;


/**  
* <p>Title: Outer2</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class Outer2 {

	public static void main(String args[]) {
		Outer o = new Outer();
		//也可以使用import引入然后直接使用
		//import com.mdjin.part10.test.test1.Outer.Inner;
		//Inner in = o.getInnerObject();
		Outer.Inner in = o.getInnerObject();
		in.sayHello();
//		System.out.println(in.key);
	}
	
}