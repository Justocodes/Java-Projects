package pkgDealership;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Car
{
	String make;
    String model;
	int vin;
	String color;
	Static float price;
	char satradio;
	char backupcam;
	int year;
	static BufferedReader reader;
	
	
	Car () 
	{    reader = new BufferedReader(new InputStreamReader(System.in));
	     make = "";
		 model = "";
		 vin = 0;
		 color = "";
		 price = 0.00f;
		 statradio = 'n';
		 backupcam = 'n';
		 year = 0;
		 
	}	 
		 
		 
		Car(string m, String m2, int v, String c, float p, char s, char b, int y)	
	{   reader = new BufferedReader(new InputStreamReader(System.in));
	    make = m;
	    model = m2;
	    vin = v;
	    color = c;
	    price = p;
	    satradio = s;
	    backupcam =b;
	    year = y;
	    
	}
		 
	 int displayCars(Car [] cars) throws IOException	 
	        {    int choice =0;
	             System.out.println("We have the following cars.");
	             for (int n = 0; n<cars.length; n++)
	             {    System.out.println((n+1) + "." + cars[n].year = " " + cars	 
	             }
	             System.out.print("Enter your choice");
	             choice = Integer.parseInt(reader.readline());
	             if (choice <1 || choice >3)
	             { System.out.println("Invalid choice");}
	             return choice-1;
	        }  
	 static float  features() throws IOException
	        {  String wantsat = "x";   // add $1000
	           String wantbuc = "x"; // add $2000
	           System.out.print("Do you want a satellite radio: (Y/N)?");
	           wantsat = reader.readLine();
	           System.out.print("Do you want a backup camera: (Y/N)?");
	           wantbuc = reader.readLine();
	           
	           
	           if (wantsat.equals("Y"))
	           { 	price += 1000.00f;   }
			    
			    if (wantbuc.equals("Y"))
			    {     price += 2000.00f; }
	       return price;    
	       }
	
}
	
	
	
	
	
	
	
}
