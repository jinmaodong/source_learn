/**  
* <p>Title: Apply.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.interfaceProcessor;
import static com.mdjin.util.Print.*;
/**  
* <p>Title: Apply</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Apply {

	/**  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param p
	 * @param o  
	 */  
	public static void process(Processor p,Object o) {
		print("Using Processor "+p.name());
		print(p.process(o));
	}
	
}
