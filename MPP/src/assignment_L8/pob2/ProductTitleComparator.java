package assignment_L8.pob2;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {

    @Override
    public int compare(Product product, Product t1) {
        return product.getTitle().compareTo(t1.getTitle());
    }
}
