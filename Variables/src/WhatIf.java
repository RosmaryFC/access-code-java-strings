/**
 * Created by c4q-rosmary on 3/5/15.
 */
public class WhatIf {
    public static void main(String[] args){

        int people = 20;
        int cats = 20;//original value was 30, changed to 20 so that neither message about cats is printed
        int dogs = 15;

        if (people < cats )// if the if statement is true, then it will print out the code, if it is false then it will skip the code and continue to the next code
        {// the purpose of the curly braces is to determine what the if statement will print if it is true
            System.out.println( "Too many cats! The world is doomed!" );
        }

        if (people > cats )
        {
            System.out.println( "Not many cats! The world is saved!" );
        }

        if (people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if (people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if (people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if (people == dogs )
        {
            System.out.println ( "People are dogs." );
        }
    }
}
