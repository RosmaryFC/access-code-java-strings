package nyc.c4q.RosmaryFC.Unit0.Lesson2.InputAndIf; /**
 * Created by c4q-rosmary on 3/5/15.
 */

import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        double FirstNumber;
        double SecondNumber;
        double ThirdNumber;
        double Total;

        System.out.print("What is your first number?");
        FirstNumber = keyboard.nextDouble();

        System.out.print("What is your second number?");
        SecondNumber = keyboard.nextDouble();

        System.out.print("What is your third number?");
        ThirdNumber = keyboard.nextDouble();

        System.out.println();

        Total = FirstNumber + SecondNumber + ThirdNumber;

        System.out.println("( " + FirstNumber + " + " + SecondNumber + " + " + ThirdNumber + " ) / 2 is... " + ((Total) /2) );
    }
}
