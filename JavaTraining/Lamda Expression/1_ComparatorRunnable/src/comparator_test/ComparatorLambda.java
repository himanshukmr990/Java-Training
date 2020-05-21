package comparator_test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
		
	public static void main(String[] args) {		
		
		List<String> list = new ArrayList<>();
		list.add("******");
		list.add("**");
		list.add("*****");
		list.add("***");
		list.add("*"); 
		list.add("****");
		list.add("***********");
		
		for(String s:list){
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
/** 1st : using anonymous inner class **/ 
		/*
		  Comparator<String> comp = new Comparator<String>() {
		  
		  @Override public int compare(String s1, String s2) {
		  
		  return Integer.compare(s1.length(), s2.length()); } }; 
		  
		  Collections.sort(list,comp);
		   
		  for(String s:list){ System.out.println(s); }*/
		
/** 2nd - Using anonymous inner as an argument **/
		
		/*
		 * Collections.sort(list, new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) {
		 * 
		 * return Integer.compare(s1.length(), s2.length()); } }); for(String s:list){
		 * System.out.println(s); }
		 */	
		
/** 3rd - Using Lambda **/
	  //Comparator<String> comp4 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

/** 4th - Using Lambda - type inference **/
		
	  //Comparator<String> comp = (s1,s2) -> Integer.compare(s1.length(), s2.length()); // type infer
		
/** 5th - Using Lambda - with mutiple lines {} and 'return' required **/ 				
        
		
		  Comparator<String> comp = (s1,s2) -> {
		  
		  System.out.println("Hello"); 
		  return Integer.compare(s1.length(), s2.length());
		  };
		  
		  Collections.sort(list, comp); for(String s:list){ System.out.println(s); }
		 
		     				 
		   
/** 6th - Using Lambda as an argument **/		
		
		 /* Collections.sort(list,(s1,s2) ->{
		                                  System.out.println("welcome");
					          	          return  Integer.compare(s1.length(), s2.length());
					          		     }
					      );
		     for(String s:list){
			      System.out.println(s);
		    }*/
		  		            				 
		
		
	}

}
