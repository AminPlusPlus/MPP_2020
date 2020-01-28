package first_week;

public class Child extends Parent {

    public static void main (String[] args) {
        Parent.myStatic();
        mystatic();
    }

    public static void mystatic(){
        System.out.println("Child Static");
    }
}
