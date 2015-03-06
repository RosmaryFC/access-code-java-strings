package nyc.c4q.RosmaryFC.Unit0.Lesson2.InputAndIf; /**
 * Created by c4q-rosmary on 3/5/15.
 */

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args ){
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hey, what's your name?");
        name = keyboard.nextLine();

        System.out.println( "Ok, " + name + " , How old are you?" );
        age = keyboard.nextInt();

        if (age <= 15 )
        {
            System.out.println( "You can't drive." );
        }

        if ( age <= 17 )
        {
            System.out.println("You can't vote." );
        }

        if ( age <= 24 )
        {
            System.out.println( "You can't rent a car." );
        }

        if ( age >= 25 )
        {
            System.out.println( "You can do anything that's legal.");
        }
    }

}
