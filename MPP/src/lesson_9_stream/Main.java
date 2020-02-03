package lesson_9_stream;

import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listItems = Arrays.asList("Aminjoni", "James", "Hello", "Aj", "Aw");

        /*
        //2s 943
        listItems.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);



        listItems.parallelStream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

*/

/*

        for (String s : listItems){
            if (s.startsWith("A"))
            {

                s.toUpperCase();
                System.out.println(s);
            }
        }


        Stream<String> echose = Stream
                .generate(()->"Echo")
                .limit(10);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);


      Stream.iterate(0,x->x+1)
                 .skip(5)
                .limit(10)
            //  .skip(5)
              .forEach(System.out::println);

        //System.out.println(echose.toString());



        Stream.iterate(1,x->x+2)
                .skip(4)
                .limit(4)
                .forEach(System.out::println);


        Item l1 = new Item("Chocolate", "Tasty");

        BiFunction<String,String,Item> biFunction = (n,p)-> new Item(n,p);

        BiFunction<String,String,Item> biFunction2 =  Item::new;

        String name = "Aminjoni" ;


        Stream.generate(Item::new)
                .map(item -> new Item(name, "Hi"))
                .limit(10)
                .forEach(System.out::println);




        List<Integer> ints = Arrays.asList(3,5,6,7,8);
        List<int[]> intArrs = ints.stream()
                .map(int[]::new)
                .collect(Collectors.toList());

        List<String> intArrStr = intArrs.stream()
                .map(Arrays::toString)
                .collect(Collectors.toList());

        System.out.println();

*/
        Optional<String> string = Stream.of("I", "am", "Hello")
                .reduce((x,y)->x+" "+y);


        System.out.println(string.orElse("dsa"));



    }
}
