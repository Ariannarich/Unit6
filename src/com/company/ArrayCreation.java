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
        if (friends.length != 5)
            return blank;
        else {
                for (int num = 0; num < friends.length; num++) {
                    blank+= friends[num].length() + " ";


                }
            }
        return blank;
    }

    public static void main(String[] args) {
      System.out.print(countryData());



    }

    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan",
                "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo",
                "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi",
                "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};

        int index = (int) (Math.random() * (countries.length-1)+ 1);
         return "The capital of " + countries[index] + " is " + capitals[index] + " and the primary language is " + languages[index]
        + ".";

    }
}


