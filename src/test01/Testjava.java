package test01;

public class Testjava {

	public static void main(String[] args) { //main 메소드
		// TODO Auto-generated method stub
		// a = 10
		// print(a) <- 파이선
		int a = 10; // 정수형 변수 a를 선언하고 정수 10을 저장
		double b = 10.5; // 실수형 변수 b를 선언하고 실수 10.5를 저장
		int c; //정수형 변수 c를 선언만!
		c = 100; // 정소형 변수 c에 100을 저장
		
// result = a + c
// print(result)
		int result = a + c; // 정수형 변수 result를 선언과 동시에 a와 c합을 저장함
		System.out.println(result); // result 변수가 출력됨
		// int; 예약됨 명령어를 변수이름으로 쓸 수 없다.
		
		int value; // 초기화가 되어 있지 않음
		//int res = value + 10; value값이 초기화되어 있지 않으므로 에러
		
		System.out.println(c); // c의 값은 100 입니다. f"c의 값은 {c}입니다"
		System.out.println("c의 값은 " + c + "입니다.");
			
	}

}
