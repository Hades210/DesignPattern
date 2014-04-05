/**
 * RubberDuck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class RubberDuck extends Duck {
	
	RubberDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a rubber duck");
	}

}
