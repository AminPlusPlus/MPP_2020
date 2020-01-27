package midterm_review_3;

public class SuperClass {
    static int Integer  = 10;

    static  {
        System.out.println("Super Static : " + Integer);
    }

    SuperClass () {
        System.out.println("Super Constructor");
    }

    {
        System.out.println("Super Init");
    }
}
