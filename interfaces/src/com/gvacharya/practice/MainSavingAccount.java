package com.gvacharya.practice;

public class MainSavingAccount {

	public static float balance = 10000;
	
	public static void main(String[] args) {
		
		SavingAccount withdraw = (amount) -> MainSavingAccount.balance-=amount;
		System.out.println(withdraw.transaction(50));
		
		SavingAccount deposite = amount -> MainSavingAccount.balance+=amount;
		
		System.out.println(deposite.transaction(50));
		System.out.println(deposite.transaction(50));
		System.out.println(deposite.transaction(50));
		
		System.out.println(SavingAccount.balance);
	}

}
