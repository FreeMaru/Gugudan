package Gugudan;

public class GugudanMain2 {
	
	public static void main(String[] args) {
		
		int number;
		String[] result = new String[9];
		
		//구구단 값 입력
		number = GugudanInput.input();
		result = GugudanCal.calculate(number);
		GugudanOutput.print(result);
		
		
		System.out.println("============================");
		
		number = GugudanInput.input();
		result = GugudanCal.calculate2(number);
		GugudanOutput.print(result);
		

		System.out.println("============================");
		
		String strNum;
		String[] splitNum;
		
		strNum = GugudanInput.inputStr();
		
		strNum = strNum.trim();
		strNum = strNum.replaceAll(" ","");
		strNum = strNum.replaceAll("\\p{Z}", "");
		
		splitNum = strNum.split(",");
		
		int first = Integer.parseInt(splitNum[0]);
		int second = Integer.parseInt(splitNum[1]);
		
		String[] result2 = new String[second];
		
		//constructor (생성자)
		InputValue cs = new InputValue(first, second);
		result2 = GugudanCal.calculate3(cs.getFirst(), cs.getSecond());
		GugudanOutput.print(result2);
		
//		System.out.println(constructor.getFirst());
		
	}

}
