package midterm_reviews;

public class Main {
    public static void main(String[] args){
        Person person  = new Person();
        Person anotherPerson = new Teacher();
        Teacher teacher = new Teacher();

        person.teach(); //person teach
        anotherPerson.teach();; //teacher teach
        teacher.teach(); // teacher

    }
}
