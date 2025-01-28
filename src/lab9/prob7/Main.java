package lab9.prob7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		list.sort(
				(right, left) -> {
					int absValue = Math.abs(right) - Math.abs(left);
					if (absValue == 0) return right - left;
					return absValue;
				}
		);
		System.out.println(list);
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		words.sort(
                Comparator.comparing(Main::reverse)
		);
		System.out.println(words);
	}

	public static String reverse(String str) {
		if (str.isEmpty()) return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
