/**  
* <p>Title: Demo6_2.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-6  
* @version 1.0  
*/
package com.mdjin.part9.test.test6;

import java.lang.reflect.Method;

/**
 * <p>
 * Title: Demo6
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author JinMaoDong
 * @date 2020-9-6
 * 证明接口类得方法默认都是public得
 */
public class Demo6  {
	
	public static void main(String args[]) {
		try {
			Class<?> cla = Class.forName("com.mdjin.part9.test.test6.Interface_");
			Method[] list = cla.getDeclaredMethods();
			for(Method m : list) {
				System.out.println(m.getName());
				System.out.println(m.toString());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/**  
* <p>Title: Interface_</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
* 证明接口得所有方法和属性都是公共得
*/
interface Interface_ {

	static Integer i = new Integer(0);
	
	void method1();
}

