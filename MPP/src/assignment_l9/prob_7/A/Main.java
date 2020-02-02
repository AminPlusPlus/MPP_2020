package assignment_l9.prob_7.A;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        //your stream pipeline


     list.stream()
                .filter(s->s.salary>100000)
                .filter(s -> s.lastName.contains("m"))
                .filter(s-> s.lastName.contains("n") || s.lastName.contains("z"))
                .map(e -> e.firstName + " "+e.lastName+", ")
                .sorted()
                .forEach(System.out::print);

    }

}