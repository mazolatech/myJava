package bancoMazola;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class principal {

	public static void main(String[] args) {
		System.out.println("Glória a Jesus!!!!!!!!");
		
		Locale.setDefault(Locale.US);
		Account account;
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();	
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();	
		
		System.out.print("Is there an inicial deposit (y/n)? ");
		char status=sc.next().charAt(0);
		if(status=='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit=sc.nextDouble();
			account = new Account(number, holder,initialDeposit);			
		}else {
			account = new Account(number,holder);
		}
	   System.out.println();
	   System.out.println("Account data:");
	   System.out.println(account);
	    
	   System.out.println();
	   System.out.println("Enter a deposit value:");
	   double depositValue= sc.nextDouble();
	   account.deposit(depositValue);
	  
	   System.out.println("Update account data:");
	   System.out.println(account);
	   
	   
	   System.out.println();
	   System.out.println("Enter a withdraw value:");
	   double depositwithdraw= sc.nextDouble();
	   account.withdraw(depositwithdraw);
	  
	   System.out.println("Update account data:");
	   System.out.println(account);
	   
	    sc.close();

	}

}
