package com.company;

public class BirthdayParadox {


  /*  Arianna Richardson
   AP Computer Science A
    January 8th, 2020

    This program finds the percentage of how many people have the same birthday in an array.
     */
    //Start code.

    // Randomly generates and returns a set amount(array) of birthday dates.

    public static int[] dates(int num) {
        int[] birthdays = new int[num];
        for (int i = 0; i < birthdays.length; i++) {
                birthdays[i] = (int) (Math.random() * 365) + 1;
        }

        return birthdays;
    }
// Checks to see if there are any of the same dates in an array.
    public static boolean hasDupes(int[] birthdays) {
        for (int i = 0; i < birthdays.length; i++) {
            for (int j = birthdays.length - 1; j > 0; j--) {
                if (birthdays[i] == birthdays[j] && j != i) {
                    return true;
                }
            }
        }
        return false;
    }
// Calculates the percentage of the same birthday in a group of 23 people, and runs it 1000 times.
    public static void main(String[] args) {
        double dupe = 0;
            for (int k = 0; k <= 1000; k++) {
                 if (hasDupes(dates(23)))
                    dupe++;

            }
        double percentage = dupe / 1000 * 100;
            // Output:
        System.out.print("The percent of times there were duplicate birthdays is " + percentage +"%");
// End code.
    }
}
