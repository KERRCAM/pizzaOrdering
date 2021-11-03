package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	double bill = 0;
    String pizzaSize = "";
    boolean size = false;

    while (size == false) {
        System.out.println("would you like a small medium or large pizza?");
        pizzaSize = input.next();
        if (pizzaSize.equals("large")) {
            bill = bill + 13.99;
            size = true;
        }if (pizzaSize.equals("medium")) {
            bill = bill + 10.99;
            size = true;
        }if (pizzaSize.equals("small")) {
            bill = bill + 7.99;
            size = true;
        }else {
                System.out.println("must enter small, medium or large");
            }
    }
    System.out.println(bill);




    /*
    boolean numOfToppings = false;
    while(numOfToppings == false) {
        try {
            System.out.println("how many toppings would you like?");
            int toppingsCount = input.nextInt();
            numOfToppings = true;
        } catch (InputMismatchException e) {
            System.out.println("must enter an integer");
        } catch (Exception e) {
            System.out.println("exception occurred " + e);
        }





    if (toppingsCount > 2) {
        bill = (bill + ((toppingsCount - 2) * 1.25));
    }

    String toppings[] = new String[toppingsCount];
    System.out.println("for a " + pizzaSize + "pizza with:");
    for (int i = 0; i < toppingsCount; i++) {
        System.out.println(toppings[i]);
    }
    System.out.println("total bill = " + bill);
    }
    */




    }
}
