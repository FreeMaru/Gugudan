package Gugudan;

public class GugudanCal {
	
	public static String[] calculate(int times) {
		
		String[] result = new String[9];
		
		for (int i=0; i<9; i++) {
			
			result[i] = times + " * " + (i+1) + " = " + times * (i+1);
			
		}
		
		return result;
		
	}
	
	public static String[] calculate2(int times) {
		
		String[] result = new String[times];
		
		for (int i=0; i<times; i++) {
			
			result[i] = times + " * " + (i+1) + " = " + times * (i+1);
			
		}
		
		return result;
		
	}
	
	public static String[] calculate3(int times, int limits) {
		
		String[] result2 = new String[limits];
		
		for (int i=0; i<limits; i++) {
			
			result2[i] = times + " * " + (i+1) + " = " + times * (i+1);
			
		}
		
		return result2;
		
	}

}
