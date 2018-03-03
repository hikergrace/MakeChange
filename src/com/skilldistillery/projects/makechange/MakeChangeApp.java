package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//asking the customer the cost of the item
		System.out.print("How much does your item cost? (example: if it is $5, type 5.00)");
		double itemCost = keyboard.nextDouble();
		
		//The user is then prompted asking how much money was tendered by the customer.
		System.out.print("How much money are you giving me? ");
		double custPay = keyboard.nextDouble();
		
		keyboard.close();
		
		//calculates the change to give back to the customer
		double changeToCust = custPay - itemCost;
		
		if(custPay < itemCost) {
			System.out.println("Uh, oh! You still owe me $" + (itemCost - custPay));
		} else if (custPay > itemCost ){
		
		//call a makeChange method
		makeChange(changeToCust);
		} else {
			System.out.println("Thank you for exact payment!");
		}
	}

		//makeChange method goes here, use division and modulus, to get remainder and figure out how much change the user gets back in dollars and cents
	public static void makeChange(double changeToCust) {
		// convert itemCost and custPay to int to account for rounding and the decimal places for change
		// the integers for the denominations are as pennies so that everything is in the same scale
		int twenty = 2000, ten = 1000, five = 500, one = 100, quarter = 25, dime = 10, nickel = 5, penny = 1;
		int change = (int)(changeToCust * 100);
		
		int changeFromTwenty = change / twenty;
		change = change % twenty;
		System.out.println("Thanks! Your change is: $" + changeToCust + "!\nYou get " + changeFromTwenty + " twenty dollar bill");
		
		int changeFromTen = change / ten;
		change = change % ten;
		System.out.println("You get " + changeFromTen + " ten dollar bills.");
		
		int changeFromFive = change / five;
		change = change % five;
		System.out.println("You get " + changeFromFive + " five dollar bills.");
		
		int changeFromOne = change / one;
		change = change % one;
		System.out.println("You get " + changeFromOne + " one dollar bills.");
		
		int changeFromQuarter = change / quarter;
		change = change % quarter;
		System.out.println("You get " + changeFromQuarter + " quarters.");
		
		int changeFromDime = change / dime;
		change = change % dime;
		System.out.println("You get " + changeFromDime + " dimes.");
		
		int changeFromNickel = change / nickel;
		change = change % nickel;
		System.out.println("You get " + changeFromNickel  + " nickels.");
		
		int changeFromPenny = change / penny;
		change = change % penny;
		System.out.println("You get " + changeFromPenny + " pennies.");
		
	}
}
