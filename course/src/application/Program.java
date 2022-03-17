package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		
		OrderStatus ost1 = OrderStatus.PENDING_PAYMENT;
		OrderStatus ost2 = OrderStatus.valueOf("PENDING_PAYMENT");
			
		System.out.println(ost1);
		System.out.println(ost2);

	}

}
