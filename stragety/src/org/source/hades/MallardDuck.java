/**
 * MallardDuck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class MallardDuck extends Duck {
	MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a real mallard duck");
	}

}
