package assignment_L8.pob2;

import java.util.*;

class Product {
    final String title;
    final double price;
    final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    //C- solution
    static void sort (List<Product> emps) {
        class ProductPriceComparator implements Comparator<Product> {
            @Override
            public int compare(Product product, Product t1) {
                return Double.compare(product.price,t1.price);
            }
        }

        Collections.sort(emps,new ProductPriceComparator());
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

}