package Pathways;

import java.util.LinkedList;
import java.util.List;

/**
 * Stores data of the passenger and reads the passenger's data from file
 */
public class Passenger {

    //************************************************** Data **************************************************//

    int PassengerID;                //3 digits
    String PassengerName;
    String creditCardNumber;           //10 digits
    int Tin;                        //4 digits

    //************************************************** Constructors **************************************************//


    public Passenger() {
    }

    public Passenger(int passengerID, String passengerName, String creditCardNumber, int tin) {
        PassengerID = passengerID;
        PassengerName = passengerName;
        this.creditCardNumber = creditCardNumber;
        Tin = tin;
    }

    //************************************************** Functions **************************************************//


    // Getters


    public int getPassengerID() {
        return PassengerID;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getTin() {
        return Tin;
    }


    // Setters


    public void setPassengerID(int passengerID) {
        PassengerID = passengerID;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setTin(int tin) {
        Tin = tin;
    }


    //Helper functions

    /**
     * Reads the passenger data file and creates a Passenger list of them
     *
     * @return List containing the passengers
     */
  


}

