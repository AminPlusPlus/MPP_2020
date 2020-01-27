package w1_l5_1;

abstract public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	abstract public void display();
	public void fly() {
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
	protected void setupFlyBehavior(FlyBehavior b) {
		flyBehavior = b;
	}
	protected void setupQuackBehavior(QuackBehavior b) {
		quackBehavior = b;
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
}
