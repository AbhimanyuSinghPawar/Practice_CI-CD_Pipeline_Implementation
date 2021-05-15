package JRE10_varType;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		var address = sc.nextLine();
		var age = sc.nextInt();
		//var address = sc.nextLine();           // Alaways use nextLine above nextInt() otherwise it will not work
		
		var a = "Abhimanyu Singh";
		var b = 2;
		var c = 5.2;
		var d = b*c;
		System.out.println("Name is:  "+a);
		System.out.println("Multiplication of 2 number is:  "+d);
		
		System.out.println("age of student is:  "+age);
		System.out.println("address of student is:  "+address);

	}

}
