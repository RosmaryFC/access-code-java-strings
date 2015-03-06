/**
 *
 * Created by c4q-rosmary on 3/5/15.
 * Rosmary Fermin
 * ExitTicketAge.java
 *
 */

import java.util.Scanner;

public class ExitTicketAge {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int age;
        int AgeInFiveYears;

        System.out.println( "How old are you?" );
        age = keyboard.nextInt();

        AgeInFiveYears = age + 5;

        System.out.println( "You are " + age + " years old. In five years, you will be " + AgeInFiveYears + " years old!" );

    }
}
