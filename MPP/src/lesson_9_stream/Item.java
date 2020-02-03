package lesson_9_stream;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Item {

    private String name;
    private  String descriptin;
    BiFunction<String,String,Item> function;


    public Item() {
        System.out.println("Default");
    }

    public Item(String name, String descriptin) {
        this.name = name;
        this.descriptin =  descriptin;
        System.out.println(""+name + " : " + descriptin);
    }

    public Item(BiFunction<String,String,Item> function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", descriptin='" + descriptin + '\'' +
                '}';
    }


}
