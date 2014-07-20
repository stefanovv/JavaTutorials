package collections_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		printOnRandom(args);
		
		List<String> list = new ArrayList<>();
		list.add("str1   ");
		list.add("  str2  ");
		iterateOverList(list);
	}
	
	/**Write a program that prints its arguments in random order.
	 * @param params
	 */
	public static void printOnRandom(String[] params){
		List<String> listOfArgs = Arrays.asList(params);
		Collections.shuffle(listOfArgs);
		
		listOfArgs.stream()
			.forEach(element -> System.out.print(element + " "));
		
		System.out.println();
		
		for (String arg : listOfArgs) {
			System.out.print(arg + " ");
		}
	}
	
	/**Write a method that takes a List<String> 
	 * and applies String.trim to each element. 
	 * @param list - List of strings
	 */
	public static void iterateOverList(List<String> list){
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			iterator.set(iterator.next().trim());
		}
	}
}
