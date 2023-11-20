package test01;

public class Testjava03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chr = 'A'; // 한글자만 저장 가능한 타입 char
		int chint = chr;
		char a = 10;
		
		String str = "Korea\n한국"; // 문자열 저장은 String
		System.out.println(chint);
		
		float c = 3.14f;
		long d = 10000000000L;
		
		double k = 3.141592;
		
		boolean jj = true; // or false
		
		int intValue = 10;
		byte byteValue = (byte)intValue;
		
		double doubleValue = 10.123;
		int intValue2 = (int)doubleValue;// 강제타입변환(임시 형변환)
	
		System.out.println(intValue2);// 소수점 이하자리는 버림
		// 실수 double 타입을 정수 int 타입으로 강제형변환 시 소수점 자리 버림됨
		
	}
}
