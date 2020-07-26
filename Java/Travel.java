package Pathways;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.io.*;
import java.text.*;
import java.util.*;



/**
 * Creates and manages the trip of passengers on trains
 */
public class Travel {                                                                                                                          

    //************************************************** Data **************************************************//

    public static String companyName;                       //Should be static
    Passenger[] passengers;             //10 passengers
    Train[] trains;                                         //xx trains (Depends on your #s)
    Metrocard [] cards;
    int cardCounter;                                        //represents # of cards sold
    float totalsales;                                              //represents total sales
    int pindex;
    int tindex;
    int cindex;
    

    //************************************************** Constructors **************************************************//

    public Travel() {
        passengers = new Passenger[10];
        trains = new Train[4];
        cards = new Metrocard[10];
        cardCounter = 0;
        totalsales = 0f;
        pindex= -1;
        tindex =1;
        cindex= -1;
    }

    //************************************************** Functions **************************************************//


   
 

    // Methods

    void loadPassengers() {
        List<Passenger> PassengersList = Passenger.readPassengers();
        for (int i = 0; i < passengers.length && !PassengersList.isEmpty(); i++)
        {
            passengers[i] = PassengersList.remove(0);
        }
    }

    void loadTrains() {
        List<Train> trainsList = Train.readTrains();
        trains = new Train[trainsList.size()];
        for (int i = 0; !trainsList.isEmpty(); i++)
        {
            trains[i] = trainsList.remove(0);
        }
    }

    int login() {
        int passengerIndex = 0;
        System.out.println("Welcome to the " + getCompanyName() + " system!");
        System.out.println(new Date());
        for(int i=0;i<3;i++){
            int id = CommonUtil.readInt("Please enter your Passenger ID:");
            int tin = CommonUtil.readInt("Please enter your TIN code:");
            //Implementing...
        }
        //Loop through the Passenger array to find a match (3x maximum)
        //If a match is not found, exit the program
        //If a match is found, remember the index and welcome the passenger by name Return the index number of the matched passenger
        return passengerIndex;
    }

    int displayMenu() {
        System.out.println("");
        int choice = -1;
        System.out.println("1) Process a travel planner");
        System.out.println("2) Purchase a Metrocard");
        System.out.println("Exit the program");
        
        return CommonUtil.readInt("Choice: ");
    }

    void processTravel() {
        System.out.println("");
        //Show a list of pickup station and let the user choose
        //Validate the choice (3x maximum)
        //Repeat above 2 steps for the arrival station
        // Call the displayTravelPlan method
    }

    void displayTravelPlan() {
        System.out.println("");
        //Display the current date and time, customer name, train letters, departure Station, departure time, arrival station, arrival time and connecting train (if applicable)
        // Ask the user do they want to purchase a Metrocard?
        //If yes, call the purchase method for the Metrocard passing the Passenger to it
    }

   
        
        
        //update the sales based the latest metrocard purchase
        // update the card counter
        
         void purchaseMC()
        { BufferedWriter outputFile = new BufferedWriter(new FileWriter("sales.txt", true));
        //A Date format to capture the date and time sold.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
         cardCounter+= numsold;
        totalsales += price;
        outputFile.write(bars[salesindex].metrocode+"," + numsold+ "," + price +”,”+ dateFormat.format(date) );
        outputFile.flush(); //clear out the computer memory
        outputFile.close(); //close the file
        } 
    }

    void writeSales() throws FileNotFoundException, IOException
        { BufferedWriter outputFile = new BufferedWriter(new FileWriter("sales.txt", true));
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        
        //get current date time with Date()
        Date date = new Date();
        outputFile.write( cardCounter+"," + totalsales + "," + dateFormat.format(date) );
        outputFile.flush();
        outputFile.close();
        }
    }


