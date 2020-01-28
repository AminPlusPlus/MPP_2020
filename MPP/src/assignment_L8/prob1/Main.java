package assignment_L8.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        BiFunction<Double,Double, List<Double>> items = (x,y) -> {
            List<Double> ls = new ArrayList<>();
            ls.add(Math.pow(x,y));
            ls.add(x*y);
            return ls;
        };


        System.out.println(items.apply(2.0,3.0));

    }




}
