package w1_l5_1;

public class MallardDuck extends Duck {
	public MallardDuck() {
		
		setupQuackBehavior(new Quack());
		setupFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("display");
		
	}

}
