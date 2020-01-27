package w1_l5_1;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setupQuackBehavior(new MuteQuack());
		setupFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("displaying");
		
	}
}
