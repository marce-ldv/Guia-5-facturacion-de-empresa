package domain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import domain.Client;

public class BillDao {
	
	ArrayList<Client> clientList;
	Map<Client,Product> billMap;
	private static Integer countBills;
	private Integer countB=0;
	
	public BillDao() {
		clientList=new ArrayList<>();
		billMap=new HashMap<>();
		countBills=countB;
	}
	
	/*public void addClient(Client c) {
		clientList.add(c);
	}
	
	public String showClientsList() {
		StringBuilder builder=new StringBuilder();
		for(Client c: clientList) {
			builder.append(" "+c.getName());
		}
		return builder.toString();
	}*/
	
	public void addBill(Client e,Product p) {
		billMap.put(e,p);
		countBills++;
	}
	
	public void showBill() {
		Iterator iter = billMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Client,Product> me = (Map.Entry<Client,Product>) iter.next();
			Client c = me.getKey();
			Product p = me.getValue();
			
			System.out.println("Bill number: "+countBills);
			System.out.println("Client name: "+c.getName()+" "+
			c.getSurname());
			
			System.out.println("Product: "+p.getProductName()+"\n"+
			"unit price without discount: $"+p.getProductPrice()+"\n");
			Date today = getTimeZone();
			System.out.println("Date bill: "+today);
			
			
		}
	}
	
	public void deleteClient(String clientName) {
		if(billMap.containsKey(clientName)) {
			billMap.remove(clientName);
		}else {
			System.out.println("Warning, the client doesn't exist");
		}
	}
	
	public Date getTimeZone() {
		Calendar calendar=new GregorianCalendar();
		Date date = calendar.getTime();
		return date;
	}
	/*
	public void countValueinJavaUsingJava8() {
		Map<Client,Product> billMapStart = billMap.entrySet().stream()
				.filter(p -> p.getValue())
				.collect(Collectors.toMap(p -> p.getKey(),p -> p.getValue() ));
		
		assertEquals(1,billMapStart);
	}*/
	/*
	public void mapCount() {
		Map<Client,Product> billMapCount = clientList.stream()
				.collect(groupingBy(Client c: c.getName()));
		System.out.println(billMapCount);
	}*/

}
