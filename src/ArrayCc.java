    /*Import java Array utility
Declare integers, Strings, characters, & booleans
Declare values for Numbers, Days of week, characters, and booleans
Print 5 numbers, 7 Strings, 5 characters, 2 booleans
        */

import java.util.Arrays;

    public class ArrayCc {

        public static void main(String[] args) {

            int[] Numbers = {1,2,3,4,5,};
            System.out.println("Numbers: " + Arrays.toString(Numbers));;

            String[] Daysofweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" , "Friday" , "Saturday" };
            System.out.println("Days of Week: " + Arrays.toString(Daysofweek));

            char[] characters = { 'a', 'e', 'i', 'o', 'u' };
            System.out.println("characters: " + Arrays.toString(characters));

            boolean [] a = {true, false};
            System.out.println("Booleans: " + Arrays.toString(a));


        }
    }


