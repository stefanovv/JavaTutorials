package generics;

import java.util.*;
import java.util.function.Predicate;

public class Main {
	
	// Counting number of numbers that match on predicate 
	public static <T> int countOn(Collection<T> coll, Predicate<T> checker){
		int counter = 0;
		
		for(T el: coll){
			if(checker.test(el)){
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		Collection<Integer> collection = Arrays.asList(1, 5, 4, 6);
		
		int primeNumbers = countOn(collection, 
				i -> i % 2 == 0);
		
		System.out.println("Number of primes: " + primeNumbers);

	}
	
	
}
