package bsu.rfe.java.group6.lab1.Kuksa.varA11;

public class Cheese extends Food{
    public void consume() {
        if (!isEaten) {
            System.out.println("That piece of cheese is eaten.");
            isEaten = true;
        }
    }
}