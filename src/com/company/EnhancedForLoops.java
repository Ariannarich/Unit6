package com.company;

public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String blank ="";
        for(int i = 0;i< arr.length; i++)
            blank += arr[i] + " ";
        return blank;
    }

    public static String printStandardFor(int[] arr){
        String blank ="";
        for(int i = 0;i< arr.length; i++)
            blank += arr[i] + " ";
        return blank;}

    public static String printStandardFor(double[] arr) {
        String blank ="";
        for(int i = 0;i< arr.length; i++)
            blank += arr[i] + " ";
        return blank;
    }

    public static String printEnhancedFor(String[] arr){
        String blank ="";
        for( String i : arr)
        {
            blank += i + " ";

        }
        return blank;

    }

    public static String printEnhancedFor(int[] arr){
        String blank ="";
        for( int i : arr)
        {
            blank += i + " ";
        }
        return blank;
    }

    public static String printEnhancedFor(double[] arr){
        String blank ="";
        for( double i : arr)
        {
            blank +=  i + " ";
        }
        return blank;
    }

    public static String printStandardWhile(String[] arr) {
        String blank ="";
      int i = 0;
       while(i < arr.length)
       {
           blank += arr[i] + " ";
           i++;
       }
       return blank;
    }

    public static String printStandardWhile(int[] arr) {
        String blank ="";
        int i = 0;
        while(i < arr.length)
        {
            blank += arr[i] + " ";
            i++;
        }
        return blank;
    }

    public static String printStandardWhile(double[] arr) {
        String blank ="";
        int i = 0;
        while(i < arr.length)
        {
            blank += arr[i] + " ";
            i++;
        }
        return blank;

    }

    public static void main(String[] args) {
        int [] integer= {1,2,3,4,5};
        double [] d ={1.0,2.0,3.0,4.0,5.0,};
        String [] str= {"one", "two", "three", "four", "five"};
        System.out.println(printEnhancedFor(integer));
        System.out.println(printStandardFor(integer));
        System.out.println(printStandardWhile(integer));
        System.out.println(printEnhancedFor(d));
        System.out.println(printStandardFor(d));
        System.out.println(printStandardWhile(d));
        System.out.println(printEnhancedFor(str));
        System.out.println(printStandardFor(str));
        System.out.println(printStandardWhile(str));
    }

}
