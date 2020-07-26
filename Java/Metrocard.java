package Pathways;

 
public class Metrocard {

    //************************************************** Data **************************************************//

    int MetrocardNumber;                //4 digits
    float Price;

    //************************************************** Constructors **************************************************//

    public Metrocard() {
    }

    public Metrocard(int metrocardNumber, float price) {
        MetrocardNumber = metrocardNumber;
        Price = price;
    }

    //************************************************** Functions **************************************************//


    // Getters


    public int getMetrocardNumber() {
        return MetrocardNumber;
    }

    public float getPrice() {
        return Price;
    }


    // Setters


    public void setMetrocardNumber(int metrocardNumber) {
        MetrocardNumber = metrocardNumber;
    }

    public void setPrice(float price) {
        Price = price;
    }



}


