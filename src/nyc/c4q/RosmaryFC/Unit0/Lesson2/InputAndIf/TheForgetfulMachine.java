package nyc.c4q.RosmaryFC.Unit0.Lesson2.InputAndIf; /**
 * Created by c4q-rosmary on 3/5/15.
 * Rosmary Fermin
 * Access Code 2.1
 *
 */

import java.util.Scanner;

public class TheForgetfulMachine {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            String FirstWord;
            String SecondWord;
            int FirstNumber;
            int SecondNumber;

            System.out.println("Give me a word!");
            FirstWord = keyboard.next();

            System.out.println("Give me a second word!");
            SecondWord = keyboard.next();

            System.out.println();

            System.out.println("Great, now your favorite number?");
            FirstNumber = keyboard.nextInt();

            System.out.println("And your second-favorite number...");
            SecondNumber = keyboard.nextInt();

            System.out.println();

            System.out.println("Whew! Wasn't that fun?");

        }
}
