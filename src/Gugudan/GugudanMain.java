package Gugudan;

import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		
		for (int i=2; i<10; i++) {
			String[] strResult = Gugudan.calculate(i);
			Gugudan.print2(strResult);
			System.out.println("=============");
		}

		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("����ڰ� �Է��� �� : " + number);
		
		if (number < 2 || number > 9) {
			
			System.out.println("���� �߸� �Է��߽��ϴ�.");
			
		} else {
			

			String[] strResult = Gugudan.calculate(number);
			Gugudan.print2(strResult);
			

		
		}

	}

}