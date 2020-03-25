package Gugudan;

import java.util.Scanner;

public class Gugudan {
	
	public static String[] calculate(int times) {
		int[] result = new int[9];
		String[] strResult = new String[9];
		for (int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
			strResult[i] = times + " * " + (i+1) + " = " + result[i];
		}
		return strResult;
	}
	
	public static String[] calculate2(int times, int number) {
		int[] result = new int[number];
		String[] strResult = new String[number];
		for (int i=0; i<number; i++) {
			result[i] = times * (i+1);
			strResult[i] = times + " * " + (i+1) + " = " + result[i];
		}
		return strResult;
	}
	
	public static String[] calculate3(int times, int number, int steps) {
		int[] result = new int[steps];
		String[] strResult = new String[steps];
		for (int i=0; i<steps; i++) {
			result[i] = times * (i+1);
			strResult[i] = times + " * " + (i+1) + " = " + result[i];
		}
		return strResult;
	}
	
	public static void print(int[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void print2(String[] result) {
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=2; i<10; i++) {
//			int[] result = calculate(i);
//			print(result);
			String[] strResult = calculate(i);
			print2(strResult);
			System.out.println("=============");
		}

		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("사용자가 입력한 값 : " + number);
		
		if (number < 2 || number > 9) {
			
			System.out.println("값을 잘못 입력했습니다.");
			
		} else {
			
//			int[] result = calculate(number);
//			print(result);
			
			String[] strResult = calculate(number);
			print2(strResult);
			
//			for (int j=0; j<result.length; j++) {
////				System.out.println(number * j);
//				result[j] = number * (j+1);
//			}
			
//			for (int j=0; j<result.length; j++) {
//				System.out.println(result[j]);
//			}
		}
	
//		int i = 1;
//		while (i < 10) {
//			
//			System.out.println(number * i);
//			
//			i++;
//		}
		
//		for (int j=1; j<10; j++) {
//			System.out.println(number * j);
//		}
		
	}
}
