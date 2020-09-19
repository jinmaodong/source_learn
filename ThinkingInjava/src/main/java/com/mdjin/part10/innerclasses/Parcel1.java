/**  
* <p>Title: Parcel1.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part10.innerclasses;

/**  
* <p>Title: Parcel1</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class Parcel1 {
	
	/**  
	* <p>Title: Contents</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	class Contents{
		private int i = 11;
		
		/**  
		 * <p>Title: value</p>  
		 * <p>Description: </p>  
		 * @return  
		 */  
		public int value() {
			return i;
		}
	}
	
	/**  
	* <p>Title: Destination</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	class Destination{
		/** label*/  
		private String label;
		
		/**  
		* <p>Title: </p>  
		* <p>Description: </p>  
		* @param whereTo  
		*/  
		Destination(String whereTo){
			label = whereTo;
		}
		
		/**  
		 * <p>Title: readLabel</p>  
		 * <p>Description: </p>  
		 * @return  
		 */  
		String readLabel() {
			return label;
		}
	}

	/**  
	 * <p>Title: ship</p>  
	 * <p>Description: </p>  
	 * @param dest  
	 */  
	public void ship(String dest) {
		Contents cs = new Contents();
		System.out.println(cs.value());
		
		Destination ds = new Destination(dest);
		System.out.println(ds.readLabel());
	}

	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		Parcel1 pc = new Parcel1();
		pc.ship("Tasmania");
	}
}
