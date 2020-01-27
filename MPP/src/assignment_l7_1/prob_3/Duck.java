package assignment_l7_1.prob_3;

public abstract class Duck implements DuckBehavior  {

    abstract public void display();

    public void swim() {
        System.out.println("  swimming");
    }

}
