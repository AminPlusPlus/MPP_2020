package assignment_L8.method_references.prob2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;

        Supplier<Double> supplier1 = () -> Math.random();

        Supplier<Double> supplier2 = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };



        //I
        System.out.println(supplier.get());
        //II
        System.out.println(supplier.get());
        //III
        System.out.println(supplier2.get());

    }
}
