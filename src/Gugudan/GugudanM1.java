package Gugudan;

import java.util.Scanner; 

public class GugudanM1 {

		public static void main(String[] args) {
			
			System.out.println("������ ���� �Է��ϼ���. : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			for (int i=2; i<(number+1); i++) {
				
				String[] strResult = Gugudan.calculate2(i, number);
				Gugudan.print2(strResult);
				System.out.println("=============");
				
			}
		}
}
