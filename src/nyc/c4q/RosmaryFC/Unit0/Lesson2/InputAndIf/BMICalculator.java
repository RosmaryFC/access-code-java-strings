package nyc.c4q.RosmaryFC.Unit0.Lesson2.InputAndIf; /**
 * Created by c4q-rosmary on 3/5/15.
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        float height;
        int weight;
        float BMI;


        System.out.print("Your height in m: ");
        height = keyboard.nextFloat();

        System.out.print("Your weight in kg: ");
        weight = keyboard.nextInt();

        System.out.println ();

        BMI = (weight / (height * height));

        System.out.print("Your BMI is ");
        System.out.printf("%.5f", BMI);// prints out floating number with a certain amount of decimals.
    }
}
