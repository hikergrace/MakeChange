package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//asking the customer the cost of the item
		System.out.print("How much is the item? (example: if it is $5, type 5.00)");
		double itemCost = keyboard.nextDouble();
		
		//The user is then prompted asking how much money was tendered by the customer.
		System.out.print("How much money are you giving me? ex. 6.00 ");
		double custPay = keyboard.nextDouble();
		
		//calculates the change to give back to the customer
		double changeToCust = custPay - itemCost;
		
		if(custPay < itemCost) {
			System.out.println("You still owe me $" + (itemCost - custPay));
		} else if (custPay > itemCost ){
			//call a makeChange method
			makeChange(changeToCust);
		System.out.print("Change: " + changeToCust);
		} else {
			System.out.println("Thank you for exact payment.");
		}
	}

		//makeChange method goes here, need to use division and modulus
	public static void makeChange(double changeToCust) {
		// convert itemCost and custPay to int: 
		int twenty = 2000, ten = 1000, five = 500, one = 100, quarter = 25, dime = 10, nickel = 5;
		int itemCostInt = (int)(changeToCust * 100);
		
		
	}
}
