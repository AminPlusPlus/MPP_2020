package lesson_7;

public interface TestInterface {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Test Interface");
    }

    static void staticMethod(){
        System.out.println("Static method");
    }


    enum Types implements TestInterface {
        Instance;

         public static class EnumClass implements TestInterface {

             private int hello;

            @Override
            public void abstractMethod() {

            }

            @Override
            public void defaultMethod() {

            }
        }

         @Override
         public void abstractMethod() {

         }

         @Override
         public void defaultMethod() {

         }
     }
}
