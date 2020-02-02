package lesson_7;

public class Test implements TestInterface,TestInterface2 {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method");
    }

    @Override
    public void defaultMethod() {
        TestInterface.super.defaultMethod();
        TestInterface2.super.defaultMethod();
        System.out.println("TestMethod");

        Types.EnumClass bs = new Types.EnumClass();



    }



    public static void main(String[] args) {
        Test t = new Test();
        t.defaultMethod();
        t.abstractMethod();

        TestInterface.staticMethod();
        TestInterface2.staticMethod();

    }
}
