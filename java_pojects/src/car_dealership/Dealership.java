package car_dealership;

public class Dealership {
	/* 
	 * Dealership(차를 파는 프로세스)
	 * 객체 :   직원,  자동차,  손님
	 *  employee(s) , car(s) , customer(s) 
	 * 
	 */
	public static void main(String[] args) {
		Customer cust1 = new Customer("홍길동","부산시 서면", 23000000);
		
		Car car = new Car("현대", "아반떼", 24000000);
		
		Employee emp = new Employee();
	
		cust1.purchaseCar(car, emp, true);
		
	}

}
