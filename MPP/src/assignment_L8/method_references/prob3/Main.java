package assignment_L8.method_references.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

        fruits.forEach(System.out::println);
    }
}
