/**
 * Created by c4q-rosmary on 3/3/15.
 */
    public class VariablesAndNames {
        public static void main( String[] args )
        {
            int cars, drivers, passengers, cars_not_driven, cars_driven;//will print out whole numbers
            double space_in_a_car, carpool_capacity, average_passengers_per_car;// will print out decimals (floating numbers)

            cars = 100;//whole number, given value 100
            space_in_a_car = 4.0;//floating number, given value 4.0
            drivers = 30;//whole number, given value 30
            passengers = 90;//whole number, given value 90
            cars_not_driven = cars - drivers;// subtracting 30(int) from 100(int) which is 70. The value is inputted into cars_not_driven
            cars_driven = drivers;//given value of 30(int)
            carpool_capacity = cars_driven * space_in_a_car;//multiplying 30(int) times 4(double) which is 120. the value is inputted into carpool_capacity
            average_passengers_per_car = passengers / cars_driven;//dividing 90(int) by 30(int) which is 3. the value is inputted into average_passengers_per_car


            System.out.println( "There are " + cars + " cars available." );
            System.out.println( "There are only " + drivers + " drivers available." );
            System.out.println( "There will be " + cars_not_driven + " empty cars today." );
            System.out.println( "We can transport " + carpool_capacity + " people today." );//int times a double will print out as double
            System.out.println( "We have " + passengers + " to carpool today." );
            System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
        }
    }

