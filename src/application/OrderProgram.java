package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities_.Client;
import entities_.Order;
import entities_.OrderItem;
import entities_.Product;

public class OrderProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
    Scanner board= new Scanner (System.in);
    System.out.println("Client data:");
    System.out.print("Name:");
    String name= board.nextLine();
    System.out.print("Email:");
    String email= board.nextLine();
    System.out.print("Birthday:");
    Date birthday= sdf1.parse(board.nextLine());
    Client c1= new Client(name, email, birthday);
    
    
    
    System.out.println("Order data:");
    System.out.print("Status:");
    OrderStatus os= OrderStatus.valueOf(board.nextLine());
    Order o=new Order(new Date(), os, c1);
    System.out.print("How many itens:");
    int nItens= board.nextInt();
    for(int i=1; i<=nItens;i++) {
    	 System.out.print("Product Name:");
    	 board.nextLine();
    	 String productName=board.nextLine();
    	 System.out.print("Product Price:");
    	 double productPrice=board.nextDouble();
    	 System.out.print("Product Quantity:");
    	 int productQ=board.nextInt();
    	 OrderItem oi= new OrderItem(productQ, productPrice, new Product(productName, productPrice));
         o.addItem(oi);   	
    }
       
    System.out.println("Order Summary:");
    System.out.print("Order moment:"+ sdf1.format(o.getDate())+ "\n");
    System.out.print("Order status:"+ o.getOs()+ "\n");
    System.out.print("Client:"+ c1.toString());
    System.out.println("Order Itens:");
    for(OrderItem oi: o.getItens()) {
    	System.out.println(oi.toString());
    }
    System.out.println("Total:"+o.total());
    	
    
    
    
	}

}
