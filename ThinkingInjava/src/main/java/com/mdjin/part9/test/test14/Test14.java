/**  
* <p>Title: Test15.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-7  
* @version 1.0  
*/  
package com.mdjin.part9.test.test14;

/**  
* <p>Title: Test15</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-7  
*/
public class Test14 {
	
	/**  
	 * <p>Title: t_method1</p>  
	 * <p>Description: </p>  
	 * @param i1  
	 */  
	void t_method1(I1 i1) {
		
	}
	/**  
	 * <p>Title: t_method2</p>  
	 * <p>Description: </p>  
	 * @param i2  
	 */  
	void t_method2(I2 i2) {
		
	}
	/**  
	 * <p>Title: t_method3</p>  
	 * <p>Description: </p>  
	 * @param i3  
	 */  
	void t_method3(I3 i3) {
		
	}
	/**  
	 * <p>Title: t_method4</p>  
	 * <p>Description: </p>  
	 * @param i4  
	 */  
	void t_method4(I4 i4) {
		
	}

	public static void main(String args[]) {
		Demo d = new Demo();
		Test14 t14 = new Test14();
		t14.t_method1(d);
		t14.t_method2(d);
		t14.t_method3(d);
		t14.t_method4(d);
	}
	
	
}

/**  
* <p>Title: I1</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-7  
*/ 
interface I1{
	
	/**  
	 * <p>Title: method1_1</p>  
	 * <p>Description: </p>    
	 */  
	void method1_1();
	
	void method1_2();
	
}

/**  
* <p>Title: I2</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-7  
*/ 
interface I2{
	
	/**  
	 * <p>Title: method2_1</p>  
	 * <p>Description: </p>    
	 */  
	void method2_1();
	
	/**  
	 * <p>Title: method2_2</p>  
	 * <p>Description: </p>    
	 */  
	void method2_2();
	
}

/**  
* <p>Title: I3</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-7  
*/ 
interface I3{
	
	/**  
	 * <p>Title: method3_1</p>  
	 * <p>Description: </p>    
	 */  
	void method3_1();
	
	
	/**  
	 * <p>Title: method3_2</p>  
	 * <p>Description: </p>    
	 */  
	void method3_2();

}

//The return types are incompatible for the inherited methods I2.method2_2(), I3.method2_2()
interface I4 extends I1,I2,I3{
	
	/**  
	 * <p>Title: method4_1</p>  
	 * <p>Description: </p>    
	 */  
	void method4_1();
	
}

class Parent{
	
}

/**  
* <p>Title: Demo</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-7  
*/ 
class Demo extends Parent implements I4{

	/* (non-Javadoc)  
	 * <p>Title: method1_1</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I1#method1_1()  
	 */
	public void method1_1() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method1_2</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I1#method1_2()  
	 */
	public void method1_2() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method2_1</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I2#method2_1()  
	 */
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method2_2</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I2#method2_2()  
	 */
	public void method2_2() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method3_1</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I3#method3_1()  
	 */
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method3_2</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I3#method3_2()  
	 */
	public void method3_2() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: method4_1</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.test.test15.I4#method4_1()  
	 */
	public void method4_1() {
		// TODO Auto-generated method stub
		
	}
	
}