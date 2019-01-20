package mypractice.basicexamples.classandobject;

public class Account {
	public static void main( String args[] )
//	throws InstantiationException
	   {
	      Account account1 = new Account( 50.00 ); // create Account object
	      Account account2 = new Account( 98.53 ); // create Account object
	      Account account3 = new Account(account2);
	      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
	      System.out.printf( "account3 balance: $%.2f\n\n", account3.getBalance() );
	      
	      double depositAmount; // deposit amount read from user

	      depositAmount = 10.10;
	      account1.credit( depositAmount ); // add to account1 balance

	      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

	      depositAmount = 12.12; 
	      account2.credit( depositAmount ); // add to account2 balance

	      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
	   }
	   private double balance; // instance variable that stores the balance

	   // argumented constructor  
	   public Account( double initialBalance ) 
	//   throws InstantiationException
	   {
	      if ( initialBalance > 0.0 ) 
	         balance = initialBalance; 
	  /*    else
	    	  throw
	   // 	 new RuntimeException("Testing Exception");
	   new InstantiationException("Invalid Balance Amount");*/
	   }
	   // default constructor
	   public Account() 
	   {
		   balance = 0.0;
	   }
	   // copy constructor
	   public Account(Account c)
	   {
		   balance = c.balance;
	   }
	   

	   public void credit( double amount )
	   {      
	      balance = balance + amount;
	   }

	   public double getBalance()
	   {
	      return balance;
	   }

	}