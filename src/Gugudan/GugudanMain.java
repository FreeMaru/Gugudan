package Gugudan;

import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		
		for (int i=2; i<10; i++) {
			String[] strResult = Gugudan.calculate(i);
			Gugudan.print2(strResult);
			System.out.println("=============");
		}

		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("사용자가 입력한 값 : " + number);
		
		if (number < 2 || number > 9) {
			
			System.out.println("값을 잘못 입력했습니다.");
			
		} else {
			

			String[] strResult = Gugudan.calculate(number);
			Gugudan.print2(strResult);
			

		
		}

	}

}