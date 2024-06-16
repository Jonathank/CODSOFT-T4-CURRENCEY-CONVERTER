package model.currencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void dispalyMenu() {
		System.out.println();
		System.out.println();
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
		
		System.out.print("SELECT CURRENCY : 	");
		int option = scan.nextInt();
		
		 switch(option){
		 case 1 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double euro = scan.nextDouble();
			 System.out.println();
			 convertEuroAmount(euro);
			 break;
		 case 2 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double pound = scan.nextDouble();
			 System.out.println();
			 convertPoundAmount(pound);
			 break;
		 case 3 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double USD = scan.nextDouble();
			 System.out.println();
			 convertUsdAmount(USD);
			 break;
		 case 4 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double rupee = scan.nextDouble();
			 System.out.println();
			 convertRupeeAmount(rupee);
			 break;
		 case 5 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double cad = scan.nextDouble();
			 System.out.println();
			 convertCadAmount(cad);
			 break;
		 case 6 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double aud = scan.nextDouble();
			 System.out.println();
			 convertAudAmount(aud);
			 break;
		 case 7 :
			 System.out.println();
			 System.out.print("ENTER AMOUNT		");
			 double SGD = scan.nextDouble();
			 System.out.println();
			 convertSgdAmount(SGD);
			 break;
		 
		 case 8 :
			 System.out.println("THANK YOU FOR TRUSTING OUR SERVICES");
			 System.out.println("...........SYSTEM CLOSE............");
			 System.out.println("@Copyright Reserved Jonathan-Tech.");
			 System.exit(0);
			 break;
		 }
		 
		}
	}

	

	private static void convertEuroAmount(double amount) {
		
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
	
	//
	private static void convertUsdAmount(double amount) {
		
			optionMenu(amount);
		System.out.print("ENTER OPTION  :		");
		int opt = scan.nextInt();
		
		if(opt == 1 ) {
			System.out.println("1  USD  =  0.93 EUR");
			double newAmount = amount * 0.93;
			System.out.println();
			System.out.println(amount +" USD  =  "+ newAmount +" EUR");
			
		}
		else if(opt == 2 ) {
			System.out.println("1  USD   =  0.79 GBP");
			double newAmount = amount * 0.79;
			System.out.println();
			System.out.println(amount +" USD   =  "+ newAmount +" GBP");
			
		}
		else if(opt == 3 ) {
			System.out.println();
			System.out.println(amount +" USD  =  "+ amount + " USD ");
		}
		else if(opt == 4 ) {
			System.out.println("1  USD   =  83.55 INR");
			double newAmount = amount * 83.55;
			System.out.println();
			System.out.println(amount +" USD   =  "+ newAmount +" INR");
		}
		else if(opt == 5 ) {
			System.out.println("1  USD   =  1.37 CAD");
			double newAmount = amount * 1.37;
			System.out.println();
			System.out.println(amount +" USD   =  "+ newAmount +" CAD");	
		}
		else if(opt == 6) {
			System.out.println("1  USD   =  1.57 AUD");
			double newAmount = amount * 1.57;
			System.out.println();
			System.out.println(amount +" USD   =  "+ newAmount +" AUD");
		}
		else if(opt == 7) {
			System.out.println("1  USD   =  1.35 SGD");
			double newAmount = amount * 1.35;
			System.out.println();
			System.out.println(amount +" USD   =  "+ newAmount +" SGD");	
		}
		
	}
	
	//
	private static void convertRupeeAmount(double amount) {
		
			optionMenu(amount);
		System.out.print("ENTER OPTION  :		");
		int opt = scan.nextInt();
		
		if(opt == 1 ) {
			System.out.println("1  INR  =  0.01 EUR");
			double newAmount = amount * 0.01;
			System.out.println();
			System.out.println(amount +" INR  =  "+ newAmount +" EUR");
			
		}
		else if(opt == 2 ) {
			System.out.println("1  INR   =  0.01 GBP");
			double newAmount = amount * 0.01;
			System.out.println();
			System.out.println(amount +" INR   =  "+ newAmount +" GBP");
			
		}
		else if(opt == 3 ) {
			System.out.println("1  INR   =  0.01 USD");
			double newAmount = amount * 0.01;
			System.out.println();
			System.out.println(amount +" INR   =  "+ newAmount +" USD");
		}
		else if(opt == 4 ) {
			System.out.println();
			System.out.println(amount +" INR  =  "+ amount + " INR ");
		}
		else if(opt == 5 ) {
			System.out.println("1  INR   =  0.02 CAD");
			double newAmount = amount * 0.02;
			System.out.println();
			System.out.println(amount +" INR   =  "+ newAmount +" CAD");	
		}
		else if(opt == 6) {
			System.out.println("1  INR   =  0.02 AUD");
			double newAmount = amount * 0.02;
			System.out.println();
			System.out.println(amount +" INR   =  "+ newAmount +" AUD");
		}
		else if(opt == 7) {
			System.out.println("1  INR   =  0.02 SGD");
			double newAmount = amount * 0.02;
			System.out.println();
			System.out.println(amount +" INR   =  "+ newAmount +" SGD");	
		}
		
	}
	//
	private static void convertCadAmount(double amount) {
		
		optionMenu(amount);
	System.out.print("ENTER OPTION  :		");
	int opt = scan.nextInt();
	
	if(opt == 1 ) {
		System.out.println("1  CAD  =  0.68 EUR");
		double newAmount = amount * 0.68;
		System.out.println();
		System.out.println(amount +" CAD  =  "+ newAmount +" EUR");
		
	}
	else if(opt == 2 ) {
		System.out.println("1  CAD   =  0.57 GBP");
		double newAmount = amount * 0.57;
		System.out.println();
		System.out.println(amount +" CAD   =  "+ newAmount +" GBP");
		
	}
	else if(opt == 3 ) {
		System.out.println("1  CAD   =  0.73 USD");
		double newAmount = amount * 0.73;
		System.out.println();
		System.out.println(amount +" CAD   =  "+ newAmount +" USD");
	}
	else if(opt == 4 ) {
		System.out.println("1  CAD   =  60.83 INR");
		double newAmount = amount * 60.83;
		System.out.println();
		System.out.println(amount +" CAD   =  "+ newAmount +" INR");
	}
	else if(opt == 5 ) {
		System.out.println();
		System.out.println(amount +" CAD  =  "+ amount + " CAD ");	
	}
	else if(opt == 6) {
		System.out.println("1  CAD   =  1.10 AUD");
		double newAmount = amount * 1.10;
		System.out.println();
		System.out.println(amount +" CAD   =  "+ newAmount +" AUD");
	}
	else if(opt == 7) {
		System.out.println("1  CAD   =  0.99 SGD");
		double newAmount = amount * 0.99;
		System.out.println();
		System.out.println(amount +" CAD   =  "+ newAmount +" SGD");	
	}
	
	}
	//
	private static void convertAudAmount(double amount) {
		
		optionMenu(amount);
	System.out.print("ENTER OPTION  :		");
	int opt = scan.nextInt();
	
	if(opt == 1 ) {
		System.out.println("1  AUD  =  0.62 EUR");
		double newAmount = amount * 0.62;
		System.out.println();
		System.out.println(amount +" AUD  =  "+ newAmount +" EUR");
		
	}
	else if(opt == 2 ) {
		System.out.println("1  AUD   =  0.52 GBP");
		double newAmount = amount * 0.52;
		System.out.println();
		System.out.println(amount +" AUD   =  "+ newAmount +" GBP");
		
	}
	else if(opt == 3 ) {
		System.out.println("1  AUD   =  0.66 USD");
		double newAmount = amount * 0.66;
		System.out.println();
		System.out.println(amount +" AUD   =  "+ newAmount +" USD");
	}
	else if(opt == 4 ) {
		System.out.println("1  AUD   =  55.27 INR");
		double newAmount = amount * 55.27;
		System.out.println();
		System.out.println(amount +" AUD  =  "+ newAmount +" INR");
	}
	else if(opt == 5 ) {
		System.out.println("1  AUD   =  0.91 CAD");
		double newAmount = amount * 0.91;
		System.out.println();
		System.out.println(amount +" AUD   =  "+ newAmount +" CAD");
	}
	else if(opt == 6) {
		System.out.println();
		System.out.println(amount +" AUD  =  "+ amount + " AUD ");
	}
	else if(opt == 7) {
		System.out.println("1  AUD   =  0.90 SGD");
		double newAmount = amount * 0.90;
		System.out.println();
		System.out.println(amount +" AUD   =  "+ newAmount +" SGD");	
	}
	
	}
	
	//
	private static void convertSgdAmount(double amount) {
		
		optionMenu(amount);
	System.out.print("ENTER OPTION  :		");
	int opt = scan.nextInt();
	
	if(opt == 1 ) {
		System.out.println("1  SGD  =  0.69 EUR");
		double newAmount = amount * 0.69;
		System.out.println();
		System.out.println(amount +" SGD  =  "+ newAmount +" EUR");
		
	}
	else if(opt == 2 ) {
		System.out.println("1  SGD   =  0.58 GBP");
		double newAmount = amount * 0.58;
		System.out.println();
		System.out.println(amount +" SGD   =  "+ newAmount +" GBP");
		
	}
	else if(opt == 3 ) {
		System.out.println("1  SGD   =  0.74 USD");
		double newAmount = amount * 0.74;
		System.out.println();
		System.out.println(amount +" SGD   =  "+ newAmount +" USD");
	}
	else if(opt == 4 ) {
		System.out.println("1  SGD   =  61.73 INR");
		double newAmount = amount * 61.73;
		System.out.println();
		System.out.println(amount +" SGD  =  "+ newAmount +" INR");
	}
	else if(opt == 5 ) {
		System.out.println("1  SGD   =  1.01 CAD");
		double newAmount = amount * 1.01;
		System.out.println();
		System.out.println(amount +" SGD   =  "+ newAmount +" CAD");
	}
	else if(opt == 6) {
		System.out.println("1  SGD   =  1.12 AUD");
		double newAmount = amount * 1.12;
		System.out.println();
		System.out.println(amount +" SGD   =  "+ newAmount +" AUD");
	}
	else if(opt == 7) {
		System.out.println();
		System.out.println(amount +" SGD  =  "+ amount + " SGD ");
	}
	
	}
	//
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
