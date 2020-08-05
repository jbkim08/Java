package car_dealership;

public class Employee {
	
	//손님을 처리하는 메소드 handleCustomer 작성
	public void handelCustomer(Customer cust, Car car, boolean finance) {
		if(finance == true) {
			//대출금 ? 자동차의 가격 - 손님이 가진 현금
			int loan = car.getPrice() - cust.getCash();
			if(loan > 0) 
				runCredit(cust, loan);
			payCash(cust, car);

		}
		else if(car.getPrice() <= cust.getCash()) {
            //고객의 현금으로 자동차를 구매한다.			
			payCash(cust, car);
		}
		else {
			System.out.println("고객이 자동차 : "+car
						    +"를 구매하려면 현금이 더 필요합니다.");
		}
	}
	//행동 : 고객이 현금이 충분할때 차를 구매한다.
	private void payCash(Customer cust, Car car) {
		System.out.println("고객이 구매한 차는 "+car+"이고, 가격은 "
								+car.getPrice()+ "입니다.");		
	}
	//행동 : 고객의 돈이 부족할때 대출을 해준다.
	private void runCredit(Customer cust, int loan) {		
		System.out.println("부족한 현금만큼 대출을 합니다.");
		System.out.println("손님은 이제 원하는 자동차를 구매할 수 있습니다.");
	}
	
	
}
