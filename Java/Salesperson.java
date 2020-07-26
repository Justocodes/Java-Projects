package pkgDealership;

public class Salesperson {
	int salesid;
	String salesname;
	float salescomm;
	
	
	Salesperson()
	{ salesid = 0;
    salesname = "";
    salescomm = 0.00f;
	}
	
	Salesperson(int s, String s2, float s3)
	{  salesid = s;
       salesname = s2;
       salescomm = s3;
	}   
	void calComm(float Carprice)
	{    float earnings;
	     earnings = carprice * salescomm;
	     System.out.println("You earned $" + earnings);
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
