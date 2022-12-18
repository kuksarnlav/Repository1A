package bsu.rfe.java.group6.lab1.Kuksa.varA11;

public class Apple extends Food {
    public String size;
    public String Type1 = "small", Type2 = "medium", Type3 = "big";
    public Apple (String size) {
        this.size = size;
    }
    public void consume(String sizes) {
        if (!isEaten) {
            System.out.println("That apple "  + sizes + " is eaten.");
            isEaten = true;
        }
    }
}