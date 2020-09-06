/**  
* <p>Title: Apply.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.classprocessor;

import java.util.Arrays;
import static com.mdjin.util.Print.*;

/**  
* <p>Title: Apply</p>  
* <p>Description: 使用了策略模式.</p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Apply {
	public static void process(Processor p,Object o) {
		print("Using Porcessor "+p.name());
		print(p.process(o));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String args[]) {
		process(new UpCase(), s);
		process(new DownCase(), s);
		process(new Splitter(), s);
	}
}

class Processor{
	/**  
	 * <p>Title: name</p>  
	 * <p>Description: 获取类名</p>  
	 * @return  
	 */  
	public String name() {
		return getClass().getSimpleName();
	}
	
	/**  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 */  
	Object process(Object obj) {
		return obj;
	}
}

/**  
* <p>Title: Upcase</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class UpCase extends Processor{
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	String process(Object obj) {
		return ((String)obj).toUpperCase();
	}
}

/**  
* <p>Title: DownCase</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class DownCase extends Processor{
	
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	String process(Object obj) {
		return ((String)obj).toLowerCase();
	}
}

/**  
* <p>Title: Splitter</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Splitter extends Processor{
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	String process(Object obj) {
		return Arrays.toString(((String)obj).split(" "));
	}
}