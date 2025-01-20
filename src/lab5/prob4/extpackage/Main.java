package lab5.prob4.extpackage;

import lab5.prob4.CustOrderFactory;
import lab5.prob4.Customer;
import lab5.prob4.Order;

import java.time.LocalDate;



public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println("Customer:" + cust.getName() + "\nOrder List: " + cust.getOrders());
	}
}

		
