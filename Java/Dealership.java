package pkgDealership;
import java.io.*;
import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer20010315;

public class Dealership {

	Car cars[];
	Salesperson crew[];
	customer clients[];
	int carindex;
	int salesindex;
	int custindex;
	int paytype;
	float carprice;
	BufferedReader reader;
	
	Dealership()
	    {    cars = new Car[5];
	         crew = new Salesperson[3];
	         clients = new Customer[3];
	         
	         carindex = 1;
	         custindex = 1;
	         salesindex= 1;
	         
	         paytype = 0; //1 - finance, 2 - Cash/Credit, 3 - Lease
	         carprice = 0.00f;
	         reader = new BufferedReader(new InputStreamReader(System.in));
	    }
	
	
	Car cars []= new Car[3];
	cars[1] = new Car ("Honda", "Accord", 1111, "Black" , 5000.00f, 'N', 'N' 2018);
	cars[2] = new Car ("Dodge", "Charger", 2114, "Red" , 4000.00f, 'N', 'N' 2018);
	cars[3] = new Car ("Nissan", "Altima", 1100, "Black" , 3500.00f, 'N', 'N' 2017);
	
	crew[1]= new Salesperson(123, "John Wick", .30f);
	crew[2]= new Salesperson(124, "Kyrie Irving", .20f);
	crew[3]= new Salesperson(125, "Steve Nash", .20f);
    
	
	clients[0]= new Customer(1000, "Stan Smith", 0);
	clients[1]= new Customer(1000, "Stan Walker", 0);
	clients[2]= new Customer(1000, "Stan Adams", 0);
	
   void calcPayments() throws IOException
   {  float monthly = 0.00f;
   float intrate = .07f;
   int term = 60;
   string finance = "Y";
   }

	
	//Show welcome and Display Cars
	choice = cars[0].dosplayCars(cars);
	
	//Get Features
	carprice = cars[choice].features();
	
	//Display Comission
	S.calcComm(carprice);
	
	
	//This program is for selling car.
			int choice = 0;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Car c;                //declaration
			c = new Car();        //grab memory
			Car=c2=new Car();
			Car=c3=new Car();
			
			Salesperson s= new Salesperson();
			s.salesid = 123;
			s.salesname = "Michelle Obama";
			s.salescomm = .30f;
			
			Customer cust = new Customer();
			cust.custid = 1000;
			cust.custname ="Barack Obama";
			cust.carvin = 0;
			
			int paytype = 0; //1 -Finance, 2 - cash /credit, 3 - Lease
			String wantsat = 'x'; // add $1000
			string wantbuc = 'x'; // add $200
			float carprice = 0;
			
			String cash = "x";
			String credit = "x";
			String lease ="x";
			String finance = "x";
			
			
			
			// give attributes for c2 and c3
			//System.out.println("We have the following car.");
			System.out.println("welcome to JF dealership, I am" + s.salesname);
			System.out.println("We have the following car.");
			System.out.println(c.year + " " + c.color + " "+ c.make + " " + c.model );
			System.out.println(c2.year + " " + c2.color + " "+ c2.make + " " + c2.model );
			System.out.println(c3.year + " " + c3.color + " "+ c3.make + " " + c3.model );
			
			//process sales
			System.out.println("Enter a number 1 through 3");
			System.out.println("Enter your chocie:");
			
			choice= Integer.parseInt(reader.readLine());
			System.out.println("The number you have enter is wrong, please re-enter: ");
			choice= Integer.parseInt(reader.readLine());
			
			System.out.println("Do you want a satellite radio: (Y/N)?");
			wantsat = reader.readLine();
			System.out.println("Do you want a backup: (Y/N)?");
			wantbuc = reader.readLine();
			
			//assign the chosen car price to working carprice
			switch (choice)  
			{   case 1:
			    {   selcar = c;
			        cust.carvin = C.vin;   ///register the car
			        break;
			    }
				case 2:
				{    selcar = c2;
				     cust.carvin = C2.vin;
				    break;
				}
			    case 3:
			    {    selcar = c3;
			         cust.carvin = C3.vin;
			        break;
			    }
			    default:
			    {   System.out.println("Invalid choice");}	
			    
			   
			//The price of the car will go here
			System.out.println("Thank you "+ cust.custname + " for purchasing a " + selcar.make + " " + selcar.model);
			System.out.println("How will you be paying Cash,Cedit,Lease,Finance");
			//System.out.println("Thank you " + cust.custname + "for your purchase");
	
				
}
