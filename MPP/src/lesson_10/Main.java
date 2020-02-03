package lesson_10;

import java.util.*;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
//        Pair<String,Double> p1 = new Pair("hello",12);
//        var a1 = new Pair<String,Integer>();
//        System.out.println(a1.getX());

        Integer[] ars = new Integer[] {1,2,3,3,3};

        System.out.println(resultCount(ars,3));

        //System.out.println(countOccurences(ars,3));

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        //List<Number> nums = ints;
       // nums.add(3.14);
        System.out.println(ints);

        Integer[] integers= new Integer[5];

        Number[] numbers = new Number[5];

       Float[] floats = new Float[5];

        List[] a = new List[50];

        int[] aw = new int[5];

       //2+3+2+3+2+3+5


        System.out.println(resultCount(new Integer[]{1,2,3,4,1, null,null},1));


        max(new String[] {"was","jack","jim","Amn","Amin"}).ifPresent(System.out::println);





    }


    public  static <E>  int countOccurences(E[] arr , E target) {
         int count = 0;
         if (target == null) {
             for (E item : arr ) {
                 if (item == null)
                     count++;
             }
         } else  {
             for (E item : arr ) {
                 if (target.equals(item))
                     count++;
             }
         }
         return  count;
    }

    //functional way
    public  static <T> int resultCount(T[] array, T target) {
        return (int) Stream.of(array)
                .filter((target!= null) ? target::equals : Objects::isNull)
                .count();
    }

    public static  <T extends Comparable> Optional<T> max (T[]array) {
        return  Stream.of(array)
                .sorted().
                        reduce((a,b) -> b);
    }


}


