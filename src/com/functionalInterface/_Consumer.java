package com.functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		Customer customer = new Customer("Chandu", "0123456789");
		greetCustomer(customer);
		customerConsumer.accept(customer);
		
	}
//	https://youtu.be/rPSL1alFIjI?t=2920
	
	static Consumer<Customer> customerConsumer = customer -> System.out.println("Hello "+customer.customerName + ", your number is :"+customer.customerPhone);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello "+customer.customerName + ", your number is :"+customer.customerPhone);
	}
	
	static class Customer{
		
		private final String customerName;
		private final String customerPhone;
		
		public String getCustomerName() {
			return customerName;
		}
		public String getCustomerPhone() {
			return customerPhone;
		}
		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerPhone=" + customerPhone + "]";
		}
		public Customer(String customerName, String customerPhone) {
			super();
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}
		
	}

}
