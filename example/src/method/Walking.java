package method;

public class Walking {
	  public static void main (String[] args) {
	    /* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
	    /* 3. 결과를 출력하시오. */
		  double myCal = calorieCalculator(5000);
		  System.out.println("소모칼로리: "+myCal+" kcal");
	  }
	  
	  /* 2. 칼로리 계산 메소드를 정의하시오. */
	  public static double calorieCalculator(int walk) {
		  double result = walk * 0.02;
		  return result;
	  }
}
