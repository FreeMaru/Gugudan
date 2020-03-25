package Gugudan;

import java.util.Scanner;

public class GugudanM2 {

	public static void main(String[] args) {
		
		System.out.println("구구단 값을 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		
		inputStr = inputStr.trim();
		inputStr = inputStr.replaceAll(" ", "");
		inputStr = inputStr.replaceAll("\\p{Z}", "");
		
		String[] SplitStr = inputStr.split(",");
		
		int number = Integer.parseInt(SplitStr[0]);
		int steps = Integer.parseInt(SplitStr[1]);
		
		for (int i=2; i<(number+1); i++) {
			
//			String[] strResult = Gugudan.calculate3(i, number, steps);
			String[] strResult = Gugudan.calculate2(i, steps);
			Gugudan.print2(strResult);
			System.out.println("=============");
			
		}
		
	}
}
