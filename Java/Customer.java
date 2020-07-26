package pkgDealership;

import java.io.*;

public class Customer {
	int custid;
	String custname;
	int carvin;
	BufferedReader reader;
	
	Customer()
	{    reader = new BufferedReader(new InputStreamReader(System.in));
	     custid = 0;
	     custname = "";
	     carvin = 0;
	}
	
	Customer(int c, String c2, int c3)
	{  reader = new BufferedReader(new InputStreamReader(System.in));
	   custid = c;
	   custname = c2;
	   carvin = c3;
	}
	void calcPayments(float carprice) throws IOException
	{    float monthly = 0.00f;
	     float intrate = .07f;
	     int term = 60;
	     String finance = "Y";
	     
	     System.out.printLn ("Do you want to finance? ");
	     finance = reader.readLine();
	     
	     if (finance.equals("Y"))
	     {   carprice += carprice * intrate;
	         monthly = carprice / term;
	         System.out.println ("Your monthly payment is $" = monthly);
	     }
	     else
	     {   System.out.printLn ("The payment due is $" + carprice); }
	}
	
}
