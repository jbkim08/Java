package start;

public class Ex1 {
	public static void main(String[] args) {
		/* 1. 입력 값을 변수로 저장 */
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		/* 2. 결과 출력 */
		System.out.printf("곱하기: %d X %d = %d\n", x, y, x*y);
		System.out.printf("나누기 몫: %d / %d = %d\n", x, y, x/y);
		System.out.printf("나누기 나머지: %d / %d = %d\n", x, y, x%y);
	}
}
