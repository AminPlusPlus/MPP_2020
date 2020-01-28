package lesson_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.LongFunction;

public class Main {

    public static  void main (String[] args) {
      /*
        BiFunction<Integer,Float, Float> exp = (x,y)->2*x-y;
        Float res = exp.apply(10,15.6f);
        System.out.println(res);


        //Miles to Km
        LongFunction<Float> s = (a) -> 1.6f * a;

        Float responce = s.apply(100);
        System.out.println(responce);


        MyTriFunction<Integer> srs = (x,y,z) -> 2*x-y+z;
        System.out.println(srs);
*/

        MyIFace<Double> random = () -> new Random().nextDouble();
        System.out.println(random.apply());

        int[] myInt = {1,2,3,4,5,6};





    }

}
