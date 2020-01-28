package assignment_L8.pob2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        return Double.compare(product.getPrice(),t1.getPrice());
    }
}
