package seriliazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public  static void main (String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        Item newItem = new Item();
        oos.writeObject(newItem);
        oos.flush();
        oos.close();
    }
}
