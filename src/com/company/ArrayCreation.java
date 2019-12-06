package com.company;

public class ArrayCreation {

    public static double getAverage(double[] avg) {
        double answer = 0;
        double result;
        if (avg.length < 2 )
            return 0.0;
        else if(avg.length >2) {
            result = avg[0] + avg[avg.length/2] + avg[avg.length-1];
           answer = result / 3;
        }
        return answer;
    }

    public static String stringArray(String[] friends) {
        String blank = "";
        String blank2 = "";
        if (friends.length != 5)
            return blank;
        else {
            for (int name = 0; name <= 5; name++) {
                for (int num = 0; num <= friends[name].length(); num++) {
                    blank2+= friends[name].length() + " ";


                }
            }
        }
        return blank2;
    }

    public static void main(String[] args) {
        double[] numbers = {89, 75, 100};
        System.out.print(getAverage(numbers));
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        System.out.println(stringArray(names));


    }

    public static String countryData() {
        String blank = "";
        return blank;
    }
}


