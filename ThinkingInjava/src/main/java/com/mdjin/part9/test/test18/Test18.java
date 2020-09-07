/**  
* <p>Title: Test18.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part9.test.test18;

import com.mdjin.part9.test.test18.interfaces.BicycleFactory;
import com.mdjin.part9.test.test18.interfaces.Cycle;
import com.mdjin.part9.test.test18.interfaces.CycleFactory;
import com.mdjin.part9.test.test18.interfaces.TricycleFactory;
import com.mdjin.part9.test.test18.interfaces.UnicycleFactory;

/**  
* <p>Title: Test18</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class Test18 {

	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		getCycle(new BicycleFactory());
		getCycle(new TricycleFactory());
		getCycle(new UnicycleFactory());
	}
	
	/**  
	 * <p>Title: getCycle</p>  
	 * <p>Description: </p>  
	 * @param factory
	 * @return  
	 */  
	public static void getCycle(CycleFactory factory) {
		Cycle cycle = factory.getCycle();
		cycle.f();
	}
}
