package assignment_l7_1.prob_3;

 interface DuckBehavior {

    default void fly () {
        System.out.println("fly with wings");
    }
    default void quack(){
        System.out.println("quacking");
    }
}
