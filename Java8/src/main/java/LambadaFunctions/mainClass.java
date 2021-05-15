package LambadaFunctions;

import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();         // Lambada Functions are allowed only at the source level 1.8 and above

		for(var i=0; i<6; i++) {
			l.add(i);
		}
		
		l.forEach(n -> System.out.println(n));
		l.forEach(n -> {if(n%2==0) {System.out.println("even");} else{ System.out.println("odd");}});
		
		
	}

}
