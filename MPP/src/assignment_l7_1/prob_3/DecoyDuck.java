package assignment_l7_1.prob_3;

public class DecoyDuck extends Duck {


    @Override
    public void fly() {
        System.out.println("cannot fly");
    }

    @Override
    public void display() {
        System.out.println("  displaying");

    }
}
