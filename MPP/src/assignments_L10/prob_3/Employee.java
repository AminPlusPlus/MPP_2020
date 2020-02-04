package assignments_L10.prob_3;

import java.util.Objects;

public class Employee {
    String firstName, lastName;
    int salary;

    public Employee(String f, String l, int s) {
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("first name: ");
        sb.append(firstName);
        sb.append(" last name: ");
        sb.append(lastName);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Employee)) return false;
        Employee employee = (Employee)obj;

        return firstName.equals(employee.getFirstName()) && lastName.equals(employee.getLastName())
                && salary == employee.getSalary();
    }
}
