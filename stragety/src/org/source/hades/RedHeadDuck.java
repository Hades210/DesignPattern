/**
 * RedHeadDuck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class RedHeadDuck extends Duck {
	RedHeadDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a real redhead duck");
	}

}
