package a_static_ref;

  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
 
public class StaticMethodReference {
	
	public static void main(String[] args) { 

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Amit",40));
		people.add(new Person("Manoj",30));
		people.add(new Person("Joy",62));
		people.add(new Person("herry",67));
	

		// 1st
	//	Collections.sort(people,(p1,p2) -> p1.getAge() - p2.getAge()); 		
        Collections.sort(people,(p1,p2) -> p1.getName().compareTo(p2.getName()));
		
		
		// 2nd
	//	Collections.sort(people,(p1,p2) -> Comp.compareAges(p1, p2));
      //  Collections.sort(people,(p1,p2) -> Comp.compareNames(p1, p2)); 
		
    
		// Method reference	 
	//	Collections.sort(people, Comp::compareAges);   // using method ref
		//Collections.sort(people, Comp::compareNames);  // using method ref
		
		
		 people.forEach(System.out::println);
 
	}
}
	class  Comp{	
		public  static int compareAges(Person p1,Person p2){
			Integer age1 = p1.getAge();
			return  age1.compareTo(p2.getAge());
		}
		public static int compareNames(Person p1,Person p2){
				String age1 = p1.getName();
				return age1.compareTo(p2.getName());
		}
	 

}
