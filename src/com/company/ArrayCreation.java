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
        if (5 != friends[friends.length])
            return blank;
        else {

            for (int name = 0; name <= 5; name++)
                for (int letter = 0; letter <= friends[name].length(); letter++)
                    blank += letter + "";
        }
        return blank;
    }

    public static void main(String[] args) {
        double[] numbers = {89, 75, 100};
        System.out.print(getAverage(numbers));

    }

    public static String countryData() {
        String blank = "";
        return blank;
    }
}


