package car_dealership;

public class Customer {
	private String name;
	private String address;
	private int cash;
	
    public Customer(String name, String address, int cash) {
		super();
		this.name = name;
		this.address = address;
		this.cash = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	//행동1 :자동차를 산다. 자동차,직원,대출가능이 매개변수
	public void purchaseCar(Car car, Employee emp, boolean finance) {
		//직원클래스에 있는 메소드를 실행
		emp.handelCustomer(this, car, finance);
	}

}
