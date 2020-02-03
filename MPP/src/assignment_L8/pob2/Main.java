package assignment_L8.pob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listP = Arrays.asList(
                new Product("Apple",3.35,1),
                new Product("Banan",2.05,1),
                new Product("Gum",1.35,2),
                new Product("Meat",10.35,4),
                new Product("Chocolate",5.35,2),
                new Product("Apple",5.35,2)
        );

        // A: ascending sort base on price
        Collections.sort(listP,new ProductPriceComparator());
        System.out.println(listP);

        // B - ascending sort base on title
        Collections.sort(listP,new ProductTitleComparator());
        System.out.println(listP);

        // D - if name equal then model lambda-expresion way
        listP.sort(Comparator.comparing(Product::getTitle)
                .thenComparing(Product::getModel));
        System.out.println(listP);


    }
}
