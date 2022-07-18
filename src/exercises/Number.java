package exercises;
import java.util.Scanner;


public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the long side of the rectangle?");
        int longSide = input.nextInt();
        System.out.println("Great, now what is the length of the short side?");
        int shortSide = input.nextInt();
        System.out.println("I've calculated that the area of the rectangle is " + longSide*shortSide);
    }
}