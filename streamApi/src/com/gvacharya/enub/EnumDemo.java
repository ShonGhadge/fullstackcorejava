package com.gvacharya.enub;

import java.util.Scanner;

public class EnumDemo {
	
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		for(Menu menu:Menu.values())
			System.out.println(menu.getSerialNO()
					+ "." + menu.name()
					+ "." + menu.getMenuDescription());
		
		return scanner.nextInt();
	}

	
	}
