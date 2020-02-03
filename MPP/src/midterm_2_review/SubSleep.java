package midterm_2_review;

//4
//5
//10
//12
//13



public class SubSleep implements A,B {

    @Override
    public void sleep() {

        System.out.println(" SUB : Sleep");
    }


    public static void main(String[] args) {
        SubSleep bc = new SubSleep();
        bc.sleep();

        A a = new SubSleep();
        a.sleep();

        B b = new SubSleep();
        b.sleep();
    }
}
