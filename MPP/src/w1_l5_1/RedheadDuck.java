package w1_l5_1;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setupQuackBehavior(new Quack());
		setupFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("displaying");
		
	}
}
