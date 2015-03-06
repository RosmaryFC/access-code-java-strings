/**
 * Created by c4q-rosmary on 3/5/15.
 * Access Code 2.1
 * Rosmary Fermin
 * excersize 1 3/5/15
 * Intro to Input and If
 */

import java.util.Scanner;

public class Echo {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner (System.in);//reads whatever you are inputting from
            System.out.println("Please say something.");
            String something = keyboard.nextLine();//.Line reads one word, .nextLine reads whole sentence, .Int reads numbers. double reads floating numbers
            System.out.println(something);
        }
}
