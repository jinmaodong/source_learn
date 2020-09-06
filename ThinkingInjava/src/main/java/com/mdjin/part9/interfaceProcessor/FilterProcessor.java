/**  
* <p>Title: FilterProcessor.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.interfaceProcessor;

import com.mdjin.part9.filter.BandPass;
import com.mdjin.part9.filter.Filter;
import com.mdjin.part9.filter.HighPass;
import com.mdjin.part9.filter.LowPass;
import com.mdjin.part9.filter.WaveForm;

/**  
* <p>Title: FilterProcessor</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class FilterProcessor {

	public static void main(String args[]) {
		WaveForm w = new WaveForm();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
	}
}


/**  
* <p>Title: FilterAdapter</p>  
* <p>Description: 此处使用适配器模式，接受已有接口并转换成所需接口</p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class FilterAdapter implements Processor{
	/** filter：适配对象*/  
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}
	
	public WaveForm process(Object input) {
		return filter.process((WaveForm)input);
	}
}

