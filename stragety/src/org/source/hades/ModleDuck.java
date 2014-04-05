/**
 * ModleDuck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class ModleDuck extends Duck {
	public ModleDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a modle duck");
	}

}
