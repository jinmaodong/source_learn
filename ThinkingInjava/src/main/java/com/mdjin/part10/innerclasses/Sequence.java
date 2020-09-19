/**  
* <p>Title: Sequence.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part10.innerclasses;

/**  
* <p>Title: Sequence</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
* 通过内部类实现一个迭代器
*/
public class Sequence {
	
	/** items*/  
	private Object[] items;
	
	/** next*/  
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	/**  
	 * <p>Title: add</p>  
	 * <p>Description: </p>  
	 * @param x  
	 */  
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}
	
	/**  
	* <p>Title: SequenceSelector</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	private class SequenceSelector implements Selector{
		
		private int i = 0;

		/* (non-Javadoc)  
		 * <p>Title: end</p>  
		 * <p>Description: </p>  
		 * @return  
		 * @see com.mdjin.part10.innerclasses.Selector#end()  
		 */
		public boolean end() {
			return i == items.length;
		}

		/* (non-Javadoc)  
		 * <p>Title: current</p>  
		 * <p>Description: </p>  
		 * @return  
		 * @see com.mdjin.part10.innerclasses.Selector#current()  
		 */
		public Object current() {
			return items[i];
		}

		/* (non-Javadoc)  
		 * <p>Title: next</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part10.innerclasses.Selector#next()  
		 */
		public void next() {
			if(i < items.length) i++;
		}
	}
	
	/**  
	 * <p>Title: selector</p>  
	 * <p>Description: </p>  
	 * @return  
	 */  
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String args[]) {
		Sequence sequence = new Sequence (10);
		for(int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}

/**  
* <p>Title: Selector</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/ 
interface Selector{
	/**  
	 * <p>Title: end</p>  
	 * <p>Description: </p>  
	 * @return  
	 */  
	boolean end();
	
	/**  
	 * <p>Title: current</p>  
	 * <p>Description: </p>  
	 * @return  
	 */  
	Object current();
	
	/**  
	 * <p>Title: next</p>  
	 * <p>Description: </p>    
	 */  
	void next();
}