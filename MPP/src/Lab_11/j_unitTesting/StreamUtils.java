package Lab_11.j_unitTesting;

import java.util.Comparator;

public class StreamUtils {

    public static Comparator<Employee> employeeComparator =
            Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed();

    public  static  int compareEmployee(Employee emp1,Employee emp2) {
        return employeeComparator.compare(emp1,emp2);
    }
}
