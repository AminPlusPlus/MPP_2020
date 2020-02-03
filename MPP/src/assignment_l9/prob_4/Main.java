package assignment_l9.prob_4;

import java.util.stream.IntStream;

public class Main {
    public static void printSquares(int num){
        IntStream.iterate(1,f -> f+1)
                .map(f->f*f)
                .limit(num)
                .forEach( result -> System.out.print(" " +result));
    }
    public static void main(String[] args) {
        printSquares(4);
    }
}
