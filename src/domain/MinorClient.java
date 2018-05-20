package domain;

public class MinorClient extends Client{
	//10% discount
	public MinorClient(String name,String surname,String dni) {
		super(name, surname, dni);
	}

	@Override
	public void showClient() {
		
	}

	@Override
	public double apllyDiscount(int discount,double purchaseValue) {
		//descuento fijo
		double dis = ((discount*10)/(double)100);
		return purchaseValue-dis;
	}
	
	
	
}
