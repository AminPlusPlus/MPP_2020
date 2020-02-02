package lesson_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Pair<String,Double> p1 = new Pair("hello",12);
//        var a1 = new Pair<String,Integer>();
//        System.out.println(a1.getX());

        Integer[] ars = new Integer[] {1,2,3,3,3};

        System.out.println(resultCount(ars,3));

        //System.out.println(countOccurences(ars,3));
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
                .filter(target::equals)
                .count();
    }
}
