package assignment_l9.prob_1;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String stringStream = Stream.of("Bill", "Thomas", "Mary")
                .map(String::new)
                .collect(Collectors.joining(","));
        System.out.println(stringStream);

    }
}
