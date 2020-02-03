package lesson_7_review;

public interface MyInterface {
    void joinUs();

    int maxNumber = 10  ;

    static void countIt (){
        System.out.println("Static Count");
    }

    static void staticCountIt (){
        System.out.println("Static Count 2 ");
    }

    default void hello (){
        System.out.println("Hello");
    }
    default void sayHello (){
        System.out.println("Say Hello");
    }
}
