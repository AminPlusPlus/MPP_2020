package assignment_l9.prob_7.B;

import assignment_l9.prob_7.A.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TrioFunction<List<Employee> ,Integer ,Character,String> LibraryFunction = (e,salary,charval)
            -> e.stream()
                .filter(s->s.getSalary()>100000)
                .filter(s -> s.getLastName().charAt(0) > 'M')
                .map(n -> n.getFirstName() + " "+n.getLastName())
                .sorted()
                .collect(Collectors.joining(","));

}
