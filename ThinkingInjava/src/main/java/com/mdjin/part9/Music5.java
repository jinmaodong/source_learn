/**  
* <p>Title Music5.java</p>  
* <p>Description </p>  
* <p>Copyright Copyright (c) 2017</p>  
* <p>Company www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-7-26  
* @version 1.0  
*/  
package com.mdjin.part9;
import static com.mdjin.util.Print.*;
/**  
* <p>Title Music5</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/
public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String args[]) {
		Instrument[] orchesttra = {
				new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWind()
		};
		
		tuneAll(orchesttra);
	}
}

/**
* <p>Title Instrument</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26
* 	特别需要记住的是，接口的所有方法、属性的作用范围自动为：public
 */
interface Instrument{
	int VALUE = 5;
	
	/**  
	 * <p>Title play</p>  
	 * <p>Description </p>  
	 * @param n  
	 */  
	void play(Note n);
	
	/**  
	 * <p>Title adjust</p>  
	 * <p>Description </p>    
	 */  
	void adjust();
}

/**  
* <p>Title Wind</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Wind implements Instrument{

	/* (non-Javadoc)  
	 * <p>Title play</p>  
	 * <p>Description </p>  
	 * @param n  
	 * @see com.mdjin.part9.Instrument#play(com.mdjin.part9.Note)  
	 */
	public void play(Note n) {
		print(this + ".play()" + n);
	}

	/* (non-Javadoc)  
	 * <p>Title adjust</p>  
	 * <p>Description </p>    
	 * @see com.mdjin.part9.Instrument#adjust()  
	 */
	public void adjust() {
		// TODO Auto-generated method stub
		print(this + ".adjust()");
	}

	public String toString() {
		return "Wind";
	}
}

/**  
* <p>Title Percussion</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Percussion implements Instrument{

	/* (non-Javadoc)  
	 * <p>Title play</p>  
	 * <p>Description </p>  
	 * @param n  
	 * @see com.mdjin.part9.Instrument#play(com.mdjin.part9.Note)  
	 */
	public void play(Note n) {
		print(this + ".play()" + n);
	}

	/* (non-Javadoc)  
	 * <p>Title adjust</p>  
	 * <p>Description </p>    
	 * @see com.mdjin.part9.Instrument#adjust()  
	 */
	public void adjust() {
		// TODO Auto-generated method stub
		print(this + ".adjust()");
	}

	public String toString() {
		return "Percussion";
	}
}

/**  
* <p>Title Stringed</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Stringed implements Instrument{

	/* (non-Javadoc)  
	 * <p>Title play</p>  
	 * <p>Description </p>  
	 * @param n  
	 * @see com.mdjin.part9.Instrument#play(com.mdjin.part9.Note)  
	 */
	public void play(Note n) {
		print(this + ".play()" + n);
	}

	/* (non-Javadoc)  
	 * <p>Title adjust</p>  
	 * <p>Description </p>    
	 * @see com.mdjin.part9.Instrument#adjust()  
	 */
	public void adjust() {
		// TODO Auto-generated method stub
		print(this + ".adjust()");
	}

	public String toString() {
		return "Stringed";
	}
}

/**  
* <p>Title Brass</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

/**  
* <p>Title WoodWind</p>  
* <p>Description </p>  
* @author JinMaoDong
* @date 2020-7-26  
*/ 
class WoodWind extends Wind {
	public String toString() {
		return "WoodWind";
	}
}