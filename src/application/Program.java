package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Enter birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(OrderStatus.valueOf(status), client);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i ++) {
			sc.nextLine();
			System.out.println("\nEnter #" + i + " item data: ");
			System.out.print("Product Name: ");
			String productX = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(productX, price);
			OrderItem orders = new OrderItem(quantity, product);
			order.addItem(orders);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();	
	}
}
