package samplePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindRepeatedWords {

	 public static void main(String[] args) {  
	        List<String> list = new ArrayList<String>();
	        list.add("java");
	        list.add("java");
	        list.add("java");
	        list.add("python");
	        list.add("python");
	        list.add("python");
	        list.add("python");
	        list.add("ui");
	        list.add("java");
	        list.add("java");
	        list.add("API");
	        list.add("java");
	        
	        list.add("java");
	        list.add("Angular");
	        list.add("java");
	        
	        
//	       list.stream().filter(s -> s.length() > 5).skip(2).forEach(System.out::println);
//	       System.out.println();
//	       
//	       list.stream().map(String::toUpperCase).forEach(System.out::println);
//	       System.out.println(); 
//	       list.forEach(System.out::println);
	       System.out.println();
	       list.stream().sorted((s1, s2) -> s1.length() - s2.length()).skip(2).forEach(System.out::println);
	       
	       list.stream().map(String::length).forEach(System.out::println);
	    }  
}
