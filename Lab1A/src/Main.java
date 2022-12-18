import bsu.rfe.java.group6.lab1.Kuksa.varA11.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of cakes: ");
        Scanner numCakConsume = new Scanner(System.in);
        int NCakes = Integer.parseInt(numCakConsume.nextLine());
        Cake[] CakesRow = new Cake[NCakes];
        String[] icings = new String[NCakes];
        Food.equals(NCakes, icings, CakesRow);

        Scanner choices = new Scanner(System.in);
        for (int i = 0; i < NCakes; i++){
            CakesRow[i].consume(icings[i]);
        }

        System.out.print("Enter the number of cheese pieces: ");
        Scanner numCheConsume = new Scanner(System.in);
        int NCheese = Integer.parseInt(numCheConsume.nextLine());
        Cheese[] CheeseRow = new Cheese[NCheese];
        for (int i = 0; i < NCheese; i++) {
            CheeseRow[i] = new Cheese();
        }

        for (int i = 0; i < NCheese; i++){
            CheeseRow[i].consume();
        }

        System.out.print("Enter the number of apples: ");
        Scanner numAppConsume = new Scanner(System.in);
        int NApple = Integer.parseInt(numCakConsume.nextLine());
        Apple[] AppleRow = new Apple[NApple];
        String[] sizes = new String[NApple];
        System.out.print("Enter the apple size (small, medium, big):\n");
        for (int i = 0; i < NApple; i++) {
            System.out.print("cake " + i + ": ");
            Scanner temp = new Scanner(System.in);
            while (true) {
                sizes[i] = temp.nextLine();
                if (sizes[i].equals("small")) {
                    break;
                } else if (sizes[i].equals("medium")) {
                    break;
                } else if (sizes[i].equals("big")) {
                    break;
                }
            }
            AppleRow[i] = new Apple(sizes[i]);
        }
        for (int i = 0; i < NApple; i++){
            AppleRow[i].consume(sizes[i]);
        }
    }
}