package bsu.rfe.java.group6.lab1.Kuksa.varA11;

import java.util.Scanner;

public class Food {
    boolean isEaten = false;
        public static void equals(int N, String[] icings, Cake Row[]) {
            int numType1 = 0, numType2 = 0, numType3 = 0;
            System.out.print("Enter the cake types (chocolate, cream, caramel):\n");
            for (int i = 0; i < N; i++){
                System.out.print("cake " + i + ": ");
                Scanner temp = new Scanner(System.in);
                while (true){
                    icings[i] = temp.nextLine();
                    if (icings[i].equals("chocolate")){
                        numType1++;
                        break;
                    } else if (icings[i].equals("cream")){
                        numType2++;
                        break;
                    } else if (icings[i].equals("caramel")){
                        numType3++;
                        break;
                    }
                }
                Row[i] = new Cake(icings[i]);
            }
            System.out.print("Enter one of the available cake icing types (chocolate, cream, caramel): ");
            Scanner stroke = new Scanner(System.in);
            String icingType = stroke.nextLine();
            if (icingType.equals("chocolate")){
                System.out.print("The number of chocolate cakes: " + numType1 + "\n");
            } else if (icingType.equals("cream")){
                System.out.print("The number of cream cakes: " + numType2 + "\n");
            } else if (icingType.equals("caramel")){
                System.out.print("The number of caramel cakes: " + numType3 + "\n");
            }
        }
    }