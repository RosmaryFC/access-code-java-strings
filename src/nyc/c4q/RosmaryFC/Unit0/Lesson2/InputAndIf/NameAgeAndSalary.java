package nyc.c4q.RosmaryFC.Unit0.Lesson2.InputAndIf; /**
 * Created by c4q-rosmary on 3/5/15.
 */


import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println( "Hello what is your name?");
        name = keyboard.nextLine();

        System.out.println();

        System.out.println( "Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println();

        System.out.println( "So you're " + age + " , eh? That's not old at all!");

        System.out.println( "How much do you make, " + name + "?");
        salary = keyboard.nextDouble();

        System.out.println();

        System.out.println( salary + "! I hope that's per hour and not per year! LOL!");


    }
}
