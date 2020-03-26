package Gugudan;

import java.util.Scanner;

public class GugudanInput {

	public static int input() {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Input Number : ");
		
		int number;
		
		number = sc.nextInt();
		
		return number;
		
	}
	
	
	public static String inputStr() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number String : ");
		
		String numStr;
		
		numStr = sc.nextLine();
		
		return numStr;
		
	}
}
