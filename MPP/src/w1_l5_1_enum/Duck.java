package w1_l5_1_enum;

public final class Duck {

	private DuckType type;
	
	Duck (DuckType duckType){
		this.type = duckType;
	}
	
	public void display() {
		System.out.println("Displaying");
	}
	
	public void fly() {
		System.out.println(type.fly());
	}
	public void quack() {
		System.out.println(type.quack());
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public DuckType getType() {
		return type;
	}
	
}
