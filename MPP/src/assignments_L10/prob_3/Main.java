package assignments_L10.prob_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> boolean contains1(List<T> list , T target){
        return list.stream()
                .anyMatch(s -> s.equals(target));
    }

    public static void test1(){
        List<String> lists = Arrays.asList("Bob","Joe", "Tom");
        System.out.println(Main.contains1(lists,"Amin"));
    }
    public static void test2(){
        List<Integer> lists = Arrays.asList(1,2, 3);
        System.out.println(Main.contains1(lists,2));
    }
    public static void test3(){
        List<Employee> lists = Arrays.asList(new Employee("Aminjoni","Abdullozoda",150000),
                new Employee("Bob","Tabor",250000),
                new Employee("Hicham","Dandon",1500000));

        System.out.println(Main.contains1(lists,new Employee("Hicham","Dandon",1500000)));
    }
    public static void test4(){
        List<String> lists = Arrays.asList("Bob","Joe", "Tom");
        System.out.println(Main.contains1(lists,"Amin"));
    }

    public static void main(String[] args) {
        //string
        test1();
        //integer
        test2();
        //employee
        test3();
    }
}
