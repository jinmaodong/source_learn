/**  
* <p>Title: LowPass.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.filter;

/**  
* <p>Title: HighPass</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class HighPass extends Filter {

	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public WaveForm process(WaveForm input) {
		return input;
	}
}
