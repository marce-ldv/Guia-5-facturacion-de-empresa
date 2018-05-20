package domain;

public abstract class Client {
	private String name,surname,dni;
	private int discount;
	
	public Client(String name,String surname,String dni) {
		this.name=name;
		this.surname=surname;
		this.dni=dni;
		discount=0;
	}
	
	public abstract void showClient();
	public abstract double apllyDiscount(int discount,double purchaseValue);

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getDni() {
		return dni;
	}

	public int getDiscount() {
		return discount;
	}
	
	
}
