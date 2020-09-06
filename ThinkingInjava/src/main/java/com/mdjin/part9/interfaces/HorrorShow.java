/**  
* <p>Title: HorrorShow.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-9-6  
* @version 1.0  
*/  
package com.mdjin.part9.interfaces;

/**  
* <p>Title: HorrorShow</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/
public class HorrorShow {

	/**  
	 * <p>Title: u</p>  
	 * <p>Description: </p>  
	 * @param b  
	 */  
	static void u(Monster b) {
		b.menace();
	}
	
	/**  
	 * <p>Title: v</p>  
	 * <p>Description: </p>  
	 * @param d  
	 */  
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	
	static void w(Lethal l) {
		l.kill();
	}
	
	public static void main(String args[]) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}

/**  
* <p>Title: Monster</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
interface Monster{
	/**  
	 * <p>Title: menace</p>  
	 * <p>Description: </p>    
	 */  
	void menace();
}

/**  
* <p>Title: DangerousMonster</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
interface DangerousMonster extends Monster{
	/**  
	 * <p>Title: destroy</p>  
	 * <p>Description: </p>    
	 */  
	void destroy();
}

/**  
* <p>Title: Lethal</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
interface Lethal{
	/**  
	 * <p>Title: kill</p>  
	 * <p>Description: </p>    
	 */  
	void kill();
}

/**  
* <p>Title: DragonZilla</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
class DragonZilla implements DangerousMonster{

	/* (non-Javadoc)  
	 * <p>Title: menace</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.Monster#menace()  
	 */
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: destroy</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.DangerousMonster#destroy()  
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}

/**  
* <p>Title: Vampire</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
interface Vampire extends DangerousMonster,Lethal{
	/**  
	 * <p>Title: drinkBlood</p>  
	 * <p>Description: </p>    
	 */  
	void drinkBlood();
}

/**  
* <p>Title: VeryBadVampire</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-9-6  
*/ 
class VeryBadVampire implements Vampire{

	/* (non-Javadoc)  
	 * <p>Title: destroy</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.DangerousMonster#destroy()  
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: menace</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.Monster#menace()  
	 */
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: kill</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.Lethal#kill()  
	 */
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)  
	 * <p>Title: drinkBlood</p>  
	 * <p>Description: </p>    
	 * @see com.mdjin.part9.interfaces.Vampire#drinkBlood()  
	 */
	public void drinkBlood() {
		// TODO Auto-generated method stub
		
	}
}