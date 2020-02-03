package assignment_l9.prob_10;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;



class Human
{
	String name;
	int age;
	String gender;

	public Human(String name){
		this.name = name;
	}

	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	Arrays.stream(list)
			.filter(f->f.getGender() == "Female")
			.map(n->n.getName())
			.forEach(System.out::println);



    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using
	// fouth type of Method Reference ClassName::new. Then print the object status
	Function<String, Human> fun = Human::new;
	Human person = fun.apply("Person");
	System.out.println(person);

	BiFunction<String,Integer,Human> biFunction = Human::new;
	Human personOne = biFunction.apply("Amin",20);
	System.out.println(personOne);

	TrioFunction<String,Integer,String,Human> trioFunction = Human::new;
	Human person3 = trioFunction.apply("Amin",12,"Male");
	System.out.println(person3);




	// Query 3 : Count the male candidates whose age is more than 30
	System.out.println(Arrays.stream(list)
			.filter(m->m.getAge()>30)
			.count()
	);
    

    
   }



}
