package bsu.rfe.java.group6.lab1.Kuksa.varA11;

public class Cake extends Food{
    public String icing;
    public String Type1 = "chocolate", Type2 = "cream", Type3 = "caramel";
    public Cake (String icing){
        this.icing = icing;
    }
    public void consume(String icings) {
        if (!isEaten) {
            System.out.println("That " + icings + " cake  is eaten.");
            isEaten = true;
        }
    }
}