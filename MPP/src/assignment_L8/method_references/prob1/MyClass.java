package assignment_L8.method_references.prob1;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyClass {

    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    //Functional Interface
    Predicate<MyClass> predicate = this::equals;
    Function<MyClass,Boolean> myClassBooleanFunction = this::equals;

    public MyClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    boolean myMethod(MyClass cl){
        return predicate.test(cl);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof MyClass)) return false;
        MyClass myClass = (MyClass)obj;
        return this.getA().equals(myClass.getA()) && this.getB().equals(myClass.getB());
    }

    public static void main(String[] args) {

        MyClass m1 = new MyClass("Amin","Abdullo");
        MyClass m2 = new MyClass("Jack","Blue");
        MyClass m3 = new MyClass("Amin","Abdullo");

        System.out.println(m1.myMethod(m2));
        System.out.println(m1.myMethod(m3));
    }

}
