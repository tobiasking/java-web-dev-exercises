package org.launchcode.java.demos.Studios;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        Double radius;

        do {
            System.out.print("Enter a radius: ");
            while (!input.hasNextDouble() || input.nextDouble() < 1) {
                System.out.println("Positive Integer, please! ");
                input.next();
            }
        } while (input.nextDouble() < 0) ;
            radius = input.nextDouble();
            System.out.println("The area of this circle is " + Circle.getArea(radius));

        }
    }


