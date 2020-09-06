/**  
* <p>Title: StringProcessor.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.interfaceProcessor;

import java.util.Arrays;


/**  
* <p>Title: StringProcessor</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public abstract class StringProcessor implements Processor {

	/* (non-Javadoc)  
	 * <p>Title: name</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.mdjin.part9.interfaceProcessor.Processor#name()  
	 */
	public String name() {
		return getClass().getSimpleName();
	}

	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param input
	 * @return  
	 * @see com.mdjin.part9.interfaceProcessor.Processor#process(java.lang.Object)  
	 */
	public abstract String process(Object input) ;
	
	public static String s = "If she weighs the same as a duck, she's made of wood.";

	public static void main(String args[]) {
		Apply.process(new UpCase(), s);
		Apply.process(new DownCase(), s);
		Apply.process(new Splitter(), s);
		Apply.process(new Replacer(), s);
	}
}


/**  
* <p>Title: UpCase</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class UpCase extends StringProcessor{
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	public String process(Object obj) {
		return ((String)obj).toUpperCase();
	}
}

/**  
* <p>Title: DownCase</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class DownCase extends StringProcessor{
	
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	public String process(Object obj) {
		return ((String)obj).toLowerCase();
	}
}

/**  
* <p>Title: Splitter</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Splitter extends StringProcessor{
	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param obj
	 * @return  
	 * @see com.mdjin.part9.Processor#process(java.lang.Object)  
	 */
	public String process(Object obj) {
		return Arrays.toString(((String)obj).split(" "));
	}
}


/**  
* <p>Title: replacer</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
* 原题为：创建一个类，将参数中每一对字符进行互换。理解为：按前后顺序匹配为一对，如第一位与最后一位。
*/ 
class Replacer extends StringProcessor{

	/* (non-Javadoc)  
	 * <p>Title: process</p>  
	 * <p>Description: </p>  
	 * @param input
	 * @return  
	 * @see com.mdjin.part9.interfaceProcessor.StringProcessor#process(java.lang.Object)  
	 */
	@Override
	public String process(Object input) {
		String result = input.toString();
		char[] arr = result.toCharArray();
		char tmp = ' ';
		for(int i = 0; i <= arr.length/2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
		//此处注意Arrays.toString()和String.copyValueOf()得区别；
		//前者是返回逗号分隔得字符串，后者是直接将数组拼接成字符串
//		return Arrays.toString(arr);
		return String.copyValueOf(arr);
	}
	
}