package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//asking the customer the cost of the item
		System.out.print("How much is the item? ");
		double itemCost = keyboard.nextDouble();
		
		//The user is then prompted asking how much money was tendered by the customer.
		System.out.print("How much money are you giving me? ");
		double custPay = keyboard.nextDouble();
		
		//calculates the change to give back to the customer
		double changeToCust = custPay - itemCost;
		
		if(custPay < itemCost) {
			System.out.println("you owe me");
		} else {
		System.out.print("Change: " + changeToCust);
		}
		
	}
}
