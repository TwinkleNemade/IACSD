//6:create BankAccount   aaplication for operations like withdraw ,deposite  and moneyTransfer.
//Create menu drive program for bank operations..,balance,email…
package com.assignmentsday3;
import java.util.Scanner;
public class BankApp {
	private int accno;
	private double balance;
	private long mobNo; 
	private String address;
	
	public BankApp() {
		accno = 00000000001;
		balance = 0000.000;
		mobNo = 0000000000;
		address = "601 Rama Appartment, wavalkar nagar, pune satara highway, pune";
	}
	public BankApp(int accno,double balance,long mobNo,String address) {
		this.accno = accno;
		this.balance = balance;
		this.mobNo = mobNo;
		this.address = address;
	}
	public void withDraw(int amount) {
		this.balance = balance - amount;
	}
	public void depoSit(int amount) {
		this.balance = balance + amount;
	}
	public void transferMoney(int amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance:");
		}else {
			this.balance = balance - amount;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accno,balance,mobileno,address");
		BankApp bk = new BankApp(sc.nextInt(),sc.nextDouble(),sc.nextLong(),sc.next());
		do {
		System.out.println("Press 1.Withdraw 2.Deposit 3.Transfer 4.Exit");
		ch = sc.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("Enter the amount you want to withdraw:");
			bk.withDraw(sc.nextInt());
			System.out.println("Withdrawl Successfull, remaining balance is: " + bk.balance);
			break;
			
		case 2:
			System.out.println("Enter the amount you want to deposit:");
			bk.depoSit(sc.nextInt());
			System.out.println("Deposit Successfull, new balance is: " + bk.balance);
			break;
			
		case 3:
			System.out.println("Enter the amount you want to transfer:");
			bk.transferMoney(sc.nextInt());
			System.out.println("Transfer Successfull, remaining balance is: " + bk.balance);
			break;
			
		case 4:
			System.out.println("Exited Successfully");
			break;
			
		default:
			break;
		}
		}while(ch!=4);

	}

}
