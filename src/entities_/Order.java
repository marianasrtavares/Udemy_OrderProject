package entities_;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date date;
	private OrderStatus os;
	
	private Client client;	
	private List <OrderItem> itens= new ArrayList<>();

	public Order() {
		
	}
		
	public Order(Date date, OrderStatus os, Client client) {
		this.date = date;
		this.os = os;
		this.client = client;
	}



	public List<OrderItem> getItens() {
		return itens;
	}


	public void setItens(List<OrderItem> itens) {
		this.itens = itens;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getOs() {
		return os;
	}

	public void setOs(OrderStatus os) {
		this.os = os;
	}
	
	public void addItem (OrderItem oi) {
		itens.add(oi);
	}
	public void removeItem (OrderItem oi) {
		itens.remove(oi);
	}
	
	public double total() {
		double sum=0;
		for(OrderItem oi: itens)
			sum+=oi.subTotal();
		return sum;
	}
	
	
	

}
