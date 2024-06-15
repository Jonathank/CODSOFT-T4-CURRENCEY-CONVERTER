package model.currencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
	
	
	
	public static void dispalyMenu() {
		System.out.println("WELCOME TO JONATHAN CURRENCY CONVERTER");
		System.out.println();
		System.out.println("1	:	(EUR) EURO");
		System.out.println("2	:	(GBP) BRITISH POUND ");
		System.out.println("3	:	(USD) US DOLLAR ");
		System.out.println("4	:	(INR) INDIAN RUPEE ");
		System.out.println("5	:	(CAD) CANADIAN DOLLAR ");
		System.out.println("6	:	(AUD) AUSTRALIAN DOLLAR ");
		System.out.println("7	:	(SGD) SINGAPORE DOLLAR ");
		System.out.println("8	:	EXIT");
		
		System.out.println();
	}
	
	public static void start() {
		while(true) {
		dispalyMenu();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("SELECT CURRENCY : 	");
		int option = scan.nextInt();
		
		 switch(option){
		 case 1 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double euro = scan.nextInt();
			 System.out.println();
			 convertEuroAmount(euro);
			 break;
		 case 2 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double pound = scan.nextInt();
			 System.out.println();
			 convertPoundAmount(pound);
			 break;
		 case 3 :
			 
			 break;
		 case 4 :
			 
			 break;
		 case 5 :
			 
			 break;
		 case 6 :
			 
			 break;
		 case 7 :
			 
			 break;
			 
		 }
		}
	}

	private static void convertEuroAmount(double amount) {
		Scanner scan = new Scanner(System.in);
			optionMenu(amount);
		System.out.print("ENTER OPTION  :		");
		int opt = scan.nextInt();
		
		if(opt == 1 ) {
			System.out.println();
			System.out.println(amount +" EUR  =  "+ amount + " EUR");
		}
		else if(opt == 2 ) {
			System.out.println("1  EUR  =  0.84 GBP");
			double newAmount = amount * 0.84;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" GBP");
		}
		else if(opt == 3 ) {
			System.out.println("1  EUR  =  1.07 USD");
			double newAmount = amount * 1.07;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" USD");
		}
		else if(opt == 4 ) {
			System.out.println("1  EUR  =  89.42 INR");
			double newAmount = amount * 89.42;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" INR");
		}
		else if(opt == 5 ) {
			System.out.println("1  EUR  =  1.47 CAD");
			double newAmount = amount * 1.47;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" CAD");	
		}
		else if(opt == 6) {
			System.out.println("1  EUR  =  1.62 AUD");
			double newAmount = amount * 1.62;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" AUD");
		}
		else if(opt == 7) {
			System.out.println("1  EUR  =  1.448 SGD");
			double newAmount = amount * 1.448;
			System.out.println();
			System.out.println(amount +" EUR  =  "+ newAmount +" SGD");	
		}
	}
	//
	private static void convertPoundAmount(double amount) {
		Scanner scan = new Scanner(System.in);
			optionMenu(amount);
		System.out.print("ENTER OPTION  :		");
		int opt = scan.nextInt();
		
		if(opt == 1 ) {
			System.out.println("1  GBP  =  1.19 EUR");
			double newAmount = amount * 1.19;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" EUR");
			
		}
		else if(opt == 2 ) {
			System.out.println();
			System.out.println(amount +" GBP  =  "+ amount + " GBP");
		}
		else if(opt == 3 ) {
			System.out.println("1  GBP  =  1.27 USD");
			double newAmount = amount * 1.27;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" USD");
		}
		else if(opt == 4 ) {
			System.out.println("1  GBP  =  105.99 INR");
			double newAmount = amount * 105.99;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" INR");
		}
		else if(opt == 5 ) {
			System.out.println("1  GBP  =  1.74 CAD");
			double newAmount = amount * 1.74;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" CAD");	
		}
		else if(opt == 6) {
			System.out.println("1  GBP  =  1.92 AUD");
			double newAmount = amount * 1.92;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" AUD");
		}
		else if(opt == 7) {
			System.out.println("1  GBP  =  1.72 SGD");
			double newAmount = amount * 1.72;
			System.out.println();
			System.out.println(amount +" GBP  =  "+ newAmount +" SGD");	
		}
	}
	
	public static void optionMenu(double amount) {
		System.out.println("  CONVERT  "+amount + "  TO  ");
		System.out.println();
		System.out.println("1	:	(EUR) EURO");
		System.out.println("2	:	(GBP) BRITISH POUND ");
		System.out.println("3	:	(USD) US DOLLAR ");
		System.out.println("4	:	(INR) INDIAN RUPEE ");
		System.out.println("5	:	(CAD) CANADIAN DOLLAR ");
		System.out.println("6	:	(AUD) AUSTRALIAN DOLLAR ");
		System.out.println("7	:	(SGD) SINGAPORE DOLLAR ");
		System.out.println();
	}

}
