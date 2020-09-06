/**  
* <p>Title: Demo5_2.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.test.test5_2;

import com.mdjin.part9.test.test5_1.Demo5_1;
import static com.mdjin.util.Print.*;

/**  
* <p>Title: Demo5_2</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Demo5_2 implements Demo5_1 {

	/* (non-Javadoc)  
	 * <p>Title: method1</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test5_1.Demo5_1#method1()  
	 */
	public void method1() {
		// TODO Auto-generated method stub
		print(this + ".method1()");
	}

	/* (non-Javadoc)  
	 * <p>Title: method2</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test5_1.Demo5_1#method2()  
	 */
	public void method2() {
		// TODO Auto-generated method stub
		print(this + ".method2()");
	}

	/* (non-Javadoc)  
	 * <p>Title: method3</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test5_1.Demo5_1#method3()  
	 */
	public void method3() {
		// TODO Auto-generated method stub
		print(this + ".method3()");
	}

	public String toString() {
		return "Demo5_2";
	}
	
	public static void main(String args[]) {
		Demo5_1 d = new Demo5_2();
		d.method1();
		d.method2();
		d.method3();
	}
}
