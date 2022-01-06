package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		price = (double) 0;
		price += (double) product.getPrice() * quantity;
		return price;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduct().getName());
		sb.append(", ");
		sb.append("Quantity: ");
		sb.append(getQuantity());
		sb.append(", ");
		sb.append("Subtotal: $ ");
		sb.append(subTotal());
		sb.append("\n");
		
		return sb.toString();
	}
	
	
}
