package assignment_l7_1.prob_3;

public class RubberDuck extends Duck {

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("squaking");
    }

    @Override
    public void display() {
        System.out.println("  displaying");

    }
}
