package midterm_review_3;

import java.util.ArrayList;

public class SubClass extends  SuperClass {

    static  {
        System.out.println("Sub Static Init " + SuperClass.Integer);

    }

    SubClass(){
        System.out.println("Sub Constructor Init " + this.Integer);
    }

    {
        System.out.println("Sub Initilization" + super.Integer);
    }

    public static  void main (String[] args) {
        new SubClass();
    }

}
