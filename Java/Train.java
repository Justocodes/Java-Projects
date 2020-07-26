package Pathways;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Stores data of the trains and reads the train data from file
 */
public class Train {

    //************************************************** Data **************************************************//

    char TrainNumber;               //single character
    String DepartureStation;
    String ArrivalStation;
    int BoroughCode;                //single digit
    Date DepartureTime;
    Date ArrivalTime;

    int Frequency;

    // Constants

    private static final int defaultFrequency = 15;

    //************************************************** Constructors **************************************************//

    public Train(char trainNumber, String departureStation, String arrivalStation, int boroughCode, Date departureTime, Date arrivalTime) {
        TrainNumber = trainNumber;
        DepartureStation = departureStation;
        ArrivalStation = arrivalStation;
        BoroughCode = boroughCode;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        Frequency = defaultFrequency;
    }

    public Train(char trainNumber, String departureStation, String arrivalStation, int boroughCode, Date departureTime, Date arrivalTime, int frequency) {
        TrainNumber = trainNumber;
        DepartureStation = departureStation;
        ArrivalStation = arrivalStation;
        BoroughCode = boroughCode;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        Frequency = frequency;
    }

    //************************************************** Functions **************************************************//


    // Getters


    public char getTrainNumber() {
        return TrainNumber;
    }

    public String getDepartureStation() {
        return DepartureStation;
    }

    public String getArrivalStation() {
        return ArrivalStation;
    }

    public int getBoroughCode() {
        return BoroughCode;
    }

    public Date getDepartureTime() {
        return DepartureTime;
    }

    public Date getArrivalTime() {
        return ArrivalTime;
    }

    public int getFrequency() {
        return Frequency;
    }


    // Setters


    public void setTrainNumber(char trainNumber) {
        TrainNumber = trainNumber;
    }

    public void setDepartureStation(String departureStation) {
        DepartureStation = departureStation;
    }

    public void setArrivalStation(String arrivalStation) {
        ArrivalStation = arrivalStation;
    }

    public void setBoroughCode(int boroughCode) {
        BoroughCode = boroughCode;
    }

    public void setDepartureTime(Date departureTime) {
        DepartureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setFrequency(int frequency) {
        this.Frequency = frequency;
    }


  
  
}

