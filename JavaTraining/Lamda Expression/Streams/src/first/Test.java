package first;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Dish> dishes =Dish.menu;
		
	 	Stream<String> st = dishes.stream()
				                 .filter(d -> d.getCalories() > 400)
				                 .sorted(Comparator.comparing(Dish::getCalories))
				                 .map(Dish::getName);
				                
	 	
	 	st.forEach(System.out::println);
	 	
	 	
		Stream<String> st2 = dishes.stream()
                .filter(d -> d.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName);
	 	List<String> st1= st2.collect(Collectors.toList());
	 	
	  
	 	
	 	
	 	
		 List<String> gf= dishes.stream()
								  .filter(d -> d.getCalories() > 400)
								  .sorted(Comparator.comparing(Dish::getCalories))
								  .map(Dish::getName)
								  .collect(Collectors.toList());
		
		
		
		
		
		
		
		
		
		
	}

}
