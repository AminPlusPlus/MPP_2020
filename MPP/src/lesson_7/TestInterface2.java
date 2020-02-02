package lesson_7;

public interface TestInterface2 {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Test Interface 2");
    }

    static void staticMethod(){
        System.out.println("Static method");
    }
}
