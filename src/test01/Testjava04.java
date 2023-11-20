package test01;

public class Testjava04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20, b = 2;
		int result1, result2;
		double result3;
		
		result1 = a + b;
		result2 = a / b;
		result3 = a / b;
		
		System.out.println(result2);
		System.out.println(result3);
		
		// 10 / 2 -> 5를 실수타입변수에 저장하면 5.0 
		double result4;
		
		result4 = 10 / 3.0; // 3.0
		System.out.println(result4);
		// 10 + 3.0 = 13.7
		
		String str1 = "1120";
		int intStr = Integer.parseInt(str1); //문자 -> 정수
		System.out.println(intStr);
		
		int intStr2 = 1000;
		String str3 = String.valueOf(intStr2); //숫자 -> 문자
		System.out.println(str3);
		
	}
}
