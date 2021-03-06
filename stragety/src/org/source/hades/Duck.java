/**
 * Duck.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	Duck(){		
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior=qb;
	}
	
	abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float , even decoys!");
	}	
}

