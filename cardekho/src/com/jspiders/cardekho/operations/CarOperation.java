package com.jspiders.cardekho.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarOperation {


	private List<Car> cars = new ArrayList<Car>();

	public void addCar(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("How many car details you want to add? ");
		Scanner scanner1 = new Scanner(System.in);
		int choice = scanner1.nextInt();
		for (int i = 1; i <= choice; i++) {
			Car car = new Car();
			System.out.print("Enter car id : ");
			car.setId(scanner1.nextInt());
			System.out.print("Enter car name : ");
			car.setName(scanner1.next());
			System.out.print("Enter car brand : ");
			car.setBrand(scanner1.next());
			System.out.print("Enter car price : ");
			car.setPrice(scanner1.nextDouble());
			cars.add(car);
			System.out.println("\n\n" + car.getName() + " added..!! ");
		}
		getAllCarDetails();
	}
		
	private void getAllCarDetails() {
		// TODO Auto-generated method stub
		
	}

	

	public void removeCar(Scanner scanner) {
		// TODO Auto-generated method stub
		getAllCarDetails();
		if (cars.isEmpty() == false) {
			Car car1 = null;
			System.out.print("\nEnter car id to remove : ");
			Scanner scanner1 = new Scanner(System.in);
			int choice = scanner1.nextInt();
			for (Car car : cars) {
				if (car.getId() == choice) {
					car1 = car;
				}
			}
			if (car1 != null) {
				cars.remove(car1);
				System.out.println(car1.getName() + " removed..!!");
			} else {
				System.out.println("Invalid choice. Try again..!!");
			}
		}
		
	}

	public void updateCar(Scanner scanner) {
		// TODO Auto-generated method stub
		getAllCarDetails();
		if (cars.isEmpty() == false) {
			System.out.print("Enter car id to update : ");
			Scanner scanner1 = new Scanner(System.in);
			int car_id = scanner1.nextInt();
			for (Car car : cars) {
				if (car.getId() == car_id) {
					System.out.print("Enter new car name : ");
					car.setName(scanner1.next());
					System.out.print("Enter new car brand : ");
					car.setBrand(scanner1.next());
					System.out.print("Enter new car price : ");
					car.setPrice(scanner1.nextDouble());
					System.out.println("Car details updated..!!");
				} 
			}
		}
	}
		
	

	public void searchCar(Scanner scanner) {
		// TODO Auto-generated method stub
		if (cars.isEmpty()) {
			System.out.println("No car details found..!!");
		} else {
			System.out.print("Enter car name : ");
			Scanner scanner1 = new Scanner(System.in);
			String name = scanner1.next();
			List<Car> allCars = new ArrayList<Car>();
			for (Car car : cars) {
				if (car.getName().equalsIgnoreCase(name)) {
					allCars.add(car);
				}
			}
			System.out.println("Total car details : " + allCars.size());
			System.out.println("ID\t" + "Name\t" + "Brand\t" + "Price");
			System.out.println("------------------------------------");
			for (Car car : allCars) {
				System.out.println(car.getId() + "\t" + car.getName() + "\t" + car.getBrand() + "\t"
						 + car.getPrice());
			}
		}
		
	}

}
