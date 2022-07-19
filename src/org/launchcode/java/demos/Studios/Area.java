package org.launchcode.java.demos.Studios;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");

        //variables
        double radius;
        double pi = 3.14;

        do {

            if (input.nextDouble() < 1) {
                System.out.print("Please re-enter radius: ");
           /* } else { if (!input.hasNextDouble()) {
                System.out.println("Don't use a string!");
            }} */
            }
        } while (input.nextDouble() < 0) ;
            radius = input.nextDouble();
            System.out.println("The area of this circle is " + Circle.getArea(radius));

        }
    }


        /* do {
            if (!input.hasNextDouble() || input.nextDouble() < 1) {
                System.out.print("Oops! Enter a positive integer: ");
                input.nextLine();
            } else {
                radius = input.nextDouble();
            }
        } while (radius < 1);
        System.out.println("The area of this circle is " + Circle.getArea(radius));
    }
} */