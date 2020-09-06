/**  
* <p>Title: Hero.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9.hero;

import static com.mdjin.util.Print.print;

/**  
* <p>Title: Hero</p>  
* <p>Description: 主要要注意的是对于CanFilght接口并没有提供方法实现，因为在基类中已存在实现，可以选择不实现</p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim {

	/* (non-Javadoc)  
	 * <p>Title: swim</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.hero.CanSwim#swim()  
	 */
	public void swim() {
		print(getClass().getSimpleName()+".swim()");

	}

	/* (non-Javadoc)  
	 * <p>Title: fly</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.hero.CanFly#fly()  
	 */
	public void fly() {
		print(getClass().getSimpleName()+".fly()");

	}

	/* (non-Javadoc)  
	 * <p>Title: climb</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.hero.CanClimb#climb()  
	 */
	public void climb() {
		print(getClass().getSimpleName()+".climb()");

	}
	/* (non-Javadoc)  
	 * <p>Title: fight</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.hero.ActionCharacter#fight()  
	 */
//	public void fight() {
//		print(getClass().getSimpleName()+".fight2()");
//	}
}
