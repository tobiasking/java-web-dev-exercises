package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        int miles = input.nextInt();
        System.out.println("Great, now how many gallons of gas did you use?");
        int gallons = input.nextInt();
        System.out.println("I've calculated that your MPG was " + miles/gallons);
    }
}
