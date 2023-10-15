package com.jspiders.cardekho.main;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperation;

public class CarMain {
	public static void main(String[] args) {
		 
		Scanner scanner = new  Scanner(System.in);
		CarOperation carOperation =new CarOperation();
		boolean flag= true;
		
		while(flag) {
			
			System.out.println("Enter 1 to add car details.\nEnter 2 to the remove car details.\nEnter 3 to the update car details.\nEnter 4 to the search car details.\nEnter 5 to the Exit.");
			switch(scanner.nextInt()) {
			case 1: carOperation.addCar(scanner);
			break;
			case 2: carOperation.removeCar(scanner);
			break;
			case 3: carOperation.updateCar(scanner);
			break;
			case 4: carOperation.searchCar(scanner);
			break;
			case 5: flag= false;
			break;
			default:
				System.out.println("\nInvalid choice. Try again..!!");
				break;
			}
		}
	}
	

}
