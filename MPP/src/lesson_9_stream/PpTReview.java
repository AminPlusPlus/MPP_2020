package lesson_9_stream;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PpTReview {
    public static void main(String[] args) {
        ints(1,2,3,4,5,6);
    }
    public static void ints(int ... a) {
        /*
        Stream<int[]> strOfInt = Stream.of(a);
        strOfInt
                        .forEach(x -> IntStream.of(x)
                        .forEach(System.out::println));

        //generate
        Stream<String> s = Stream.generate(()-> "hello").limit(10);
        s.forEach(System.out::println);

        //Iterate
        Stream<Integer> stream2 = Stream.iterate(1, n -> n + 1).limit(10).skip(5);
        stream2.forEach(System.out::println);

        //CONTACT
        Stream<Character> streamConcat = Stream.concat(Stream.of('A','B'),Stream.of('A','B'));
        streamConcat
                .filter(j->j.equals('B'))
                .map(t->t='W')
                .forEach(System.out::println);



        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<int[]> ints = integerList.stream()
                .map(int[]::new)
                .collect(Collectors.toList());

        System.out.println(ints.size());

        for (int[] sz : ints) {
            System.out.print(" ");
            for (int zx : sz)
                System.out.print(zx);
        }
       // System.out.println(strOfInt.collect(Collectors.toList()));;
*/


        System.out.println( Stream.of(1,2,3,4)
                .map(PpTReview::doubleIt)
                .reduce(5,PpTReview::sumTwo)



        );






    }

    public static int[] twoSum(int[] nums, int target) {
        return IntStream.of(nums)
                .reduce((x,y)-> x+y)
                .stream().filter(x-> x==9)
                .toArray();
    }

    public static int sumTwo (int a,int b) {
        System.out.println(a +  " _ " + b);
        return a+b;
    }
    public static int doubleIt (int a) {
        System.out.println("MAP: _ "+a);
        return a*2;
    }
}
