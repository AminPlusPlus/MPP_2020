package midterm_reviews;

public class Teacher extends Person {

    @Override
    protected void protect() {
        super.protect();
        super.hello();
    }

    @Override
    public void hello() {
        super.hello();
    }

    public void teach(){
        System.out.println("Teacher can teach");
    }
}
