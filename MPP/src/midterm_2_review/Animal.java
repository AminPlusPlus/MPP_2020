package midterm_2_review;

import java.util.Stack;
abstract class Animal implements ISubInterface {
    transient  String b = "dasda";
    private String name;
    private int age;
    Stack<String> myData;



//    Animal () {
//
//    }
//
//    Animal(String name) {
//        this.name = name;
//        System.out.println("Animal Constructor Executed");
//    }


    public final String getName() {
        return name;
    }
}
