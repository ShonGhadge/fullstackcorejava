package com.gvacharya.enub;

public class MainMenu {
	
	public static void main(String[] args) {
		EnumDemo helper = new EnumDemo();
		int choice = helper.printMenu();
		System.out.println(choice);
		
		switch (choice) {
		case 1->System.out.println("Add Data");
		case 2->System.out.println("UPDATE Data");
		case 3->System.out.println("DELETE Data");
		case 4->System.out.println("SELECT Data");
		case 5->System.out.println("SELECT_ALL Data");
		case 0->System.out.println("Bye");
		default->System.out.println("Invalid input");
			
		}
	}

}
