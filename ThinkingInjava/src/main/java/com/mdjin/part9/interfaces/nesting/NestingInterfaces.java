/**  
* <p>Title: NestingInterfaces.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-8  
* @version 1.0  
*/  
package com.mdjin.part9.interfaces.nesting;

/**  
* <p>Title: NestingInterfaces</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/
public class NestingInterfaces {

	/**  
	* <p>Title: BImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	public class BImp implements A.B{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.B#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	
	/**  
	* <p>Title: CImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	class CImp implements A.C{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.C#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//The type A.D is not visible
//	class DImp implements A.D{
//
//		/* (non-Javadoc)  
//		 * <p>Title: f</p>  
//		 * <p>Description: </p>    
//		 * @see com.mdjin.part9.interfaces.nesting.A.D#f()  
//		 */
//		public void f() {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	
	/**  
	* <p>Title: EImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	class EImp implements E{

		/* (non-Javadoc)  
		 * <p>Title: g</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.E#g()  
		 */
		public void g() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args  
	 */  
	public static void main(String args[]) {
		A a = new A();
		//The type A.D is not visible
//		A.D ad = a.getD();
		//Type mismatch: cannot convert from A.D to A.DImp2
//		A.DImp2 ad2 = a.getD();
		//The type A.D is not visible
//		a.getD().f();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}

/**  
* <p>Title: A</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/ 
class A{
	
	/**  
	* <p>Title: B</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	interface B{
		void f();
	}
	
	/**  
	* <p>Title: BImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	public class BImp implements B{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.B#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	* <p>Title: BImp2</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	private class BImp2 implements B{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.B#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	* <p>Title: C</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	public interface C{
		/**  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 */  
		void f();
	}
	
	/**  
	* <p>Title: CImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	class CImp implements C{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.C#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	* <p>Title: CImp2</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	private class CImp2 implements C{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.C#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	* <p>Title: D</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	private interface D{
		/**  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 */  
		void f();
	}
	
	/**  
	* <p>Title: DImp</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	private class DImp implements D{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.D#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**  
	* <p>Title: DImp2</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	public class DImp2 implements D{

		/* (non-Javadoc)  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 * @see com.mdjin.part9.interfaces.nesting.A.D#f()  
		 */
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public D getD() {
		return new DImp2();
	}
	
	private D dRef;
	
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
	
}

/**  
* <p>Title: E</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-8  
*/ 
interface E{
	/**  
	* <p>Title: G</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	interface G{
		/**  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 */  
		void f();
	}
	
	/**  
	* <p>Title: H</p>  
	* <p>Description: </p>  
	* @author JinMaoDong
	* @date 2020-9-8  
	*/ 
	public interface H{
		/**  
		 * <p>Title: f</p>  
		 * <p>Description: </p>    
		 */  
		void f();
	}
	
	void g();
}