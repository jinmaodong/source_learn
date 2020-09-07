/**  
* <p>Title: UnicycleFactory.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part9.test.test18.interfaces;

import com.mdjin.part9.test.test18.impl.Unicycle;

/**  
* <p>Title: UnicycleFactory</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class UnicycleFactory implements CycleFactory {

	/* (non-Javadoc)  
	 * <p>Title: getCycle</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.mdjin.part9.test.test18.interfaces.CycleFactory#getCycle()  
	 */
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}

}
