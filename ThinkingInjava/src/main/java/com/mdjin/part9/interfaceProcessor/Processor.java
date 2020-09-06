/**  
* <p>Title: Processor.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.interfaceProcessor;

/**  
* <p>Title: Processor</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public interface Processor {

	String name();
	
	Object process(Object input);
}
