package w1_l5_1;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setupQuackBehavior(new Squeak());
		setupFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("displaying");
		
	}
}
