/**  
* <p>Title: Adventure.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.hero;

/**  
* <p>Title: Adventure</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Adventure {

	public static void main(String args[]) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		m(h);
		a(h);
	}
	
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanFly x) {
		x.fly();
	}
	public static void v(CanSwim x) {
		x.swim();
	}
	public static void m(CanClimb x) {
		x.climb();
	}
	public static void a(ActionCharacter x) {
		x.fight();
	}
}
