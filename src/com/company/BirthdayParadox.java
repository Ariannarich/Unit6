package com.company;

public class BirthdayParadox {

    public static int[] dates(int num) {
        int[] dates = new int[num];
        for (int i = 0; i < dates.length; i++) {
            if (dates[i] == 0)
                dates[i] = (int) (Math.random() * 365) + 1;
        }
        return dates;
    }

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

    public static void main(String[] args) {
        int dupe = 0;
        int percentage = 0;
        int numOfTimes= 10;
            for (int k = 0; k <= numOfTimes; k++) {
                 if ((hasDupes(dates(23))) == true)
                    dupe++;

            }
        percentage = (dupe/numOfTimes) * 100;
        System.out.print("The percent of times there were duplicate birthdays is " + percentage +"%");

    }
}
