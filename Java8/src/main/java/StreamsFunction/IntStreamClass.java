package StreamsFunction;

import java.util.*;
import java.util.stream.IntStream;

public class IntStreamClass {

	public static void main(String[] args) {
		
		IntStream.range(0, 10).forEach(n -> {System.out.println(n);});

		//Find even and odd number
		IntStream.range(0, 10).forEach(n -> {if(n%2 == 0) {System.out.println("number is even"+ n);} else {System.out.println("number is odd"+ n);}});
		
	}

}
