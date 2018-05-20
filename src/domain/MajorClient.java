package domain;

public class MajorClient extends Client{
	
	public MajorClient(String name,String surname,String dni) {
		super(name, surname, dni);
		
	}

	@Override
	public void showClient() {
		
		
	}

	@Override
	public double apllyDiscount(int discount,double purchaseValue) {
		//varia
		double dis = ((discount*5)/(double)100);
		return purchaseValue-dis;
	}

}
