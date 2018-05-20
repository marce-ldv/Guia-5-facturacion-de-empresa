package app;

import domain.BillDao;
import domain.Client;
import domain.MajorClient;
import domain.MinorClient;
import domain.Product;

public class Main {

	public static void main(String[] args) {
		double startTime = System.nanoTime();
		
		BillDao bd= new BillDao();
		bd.addBill(new MinorClient("Pepe", "Gonzales", "2065847"),
				new Product("Tomato",30));
		bd.addBill(new MajorClient("Franco", "Chiappe", "39658412"),
				new Product("Banana",25));
		
		Client cl = new MajorClient("Jeremias", "Sprindfield", "5684845");
		Product pr = new Product("Pineapple", 12);
		bd.addBill(cl, pr);
		
		//bd.deleteClient("Pepe");
		bd.showBill();
		
		double endtime = System.nanoTime();
		double efficiency=((endtime-startTime)/1000000);
		System.out.println("Efficency: "+efficiency);

	}

}
