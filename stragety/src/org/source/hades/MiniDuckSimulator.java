/**
 * MiniDuckSimulator.java
 * @author Hades
 * @date 2014/4/5
 */
package org.source.hades;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubber = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
		
		ModleDuck modle = new ModleDuck();
		
		mallard.performQuack();
		rubber.performQuack();
		decoy.performQuack();
		
		modle.performFly();
		modle.setFlyBehavior(new FlyRocketPowered());
		modle.performFly();
		
		Duck mallard1 = new MallardDuck();
		mallard1.performFly();
		mallard1.performQuack();
		
		Duck modle1 = new ModleDuck();
		modle1.performFly();
		modle1.setFlyBehavior(new FlyRocketPowered());
		modle1.performFly();
		
	}

}
