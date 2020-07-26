package Pathways;

public class Pathways {

    //************************************************** Data **************************************************//

    Travel travel;


    //************************************************** Main **************************************************//

    public static void main(String[] args) {

        Travel pathways;
        try
        {  pathways= new Travel();
        	pathways.loadPassengers();
        	/* 	pathways.loadTrains();
        	//   pathways.loadMetrocards();
        	pathways.login();
        	pathways.displayMenu();*/
        }//add catch blocks
        finally
        {
        	System.out.println("Thankyou for using the program!");
        }
    }

}

