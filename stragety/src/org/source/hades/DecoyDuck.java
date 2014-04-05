/**
 * DecoyDuck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class DecoyDuck extends Duck {
	DecoyDuck(){
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a duck decoy");
	}

}
