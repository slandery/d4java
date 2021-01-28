package com.tts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("lets start with five numbers and get them in an array.");

        ArrayList<Integer> myNumArr = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        myNumArr.add(num1);
        myNumArr.add(num2);
        myNumArr.add(num3);
        myNumArr.add(num4);
        myNumArr.add(num5);


        System.out.print(myNumArr);

        //for (int i = 0; i < myNumArr; i++) {
        //    System.out.println(myNumArr[i] + " ");
        //}

        // Summing all elements
        int sum = 0;
        for (int value : myNumArr) {
            sum += value;
        }
        System.out.printf("Your sum is %s", sum);


        String mathA = Arrays.toString(toPower(4,2));
        System.out.println("  This is topower request of 4**2"+ mathA);
    }



    //make toPower with two int as size, power
    public static int[] toPower(int size, int power) {
        //below not working..but should be something like this
        //int[] newArr = new int[size];

        //Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> math = new ArrayList<Integer>();
        int[] mathArr = new int[size];
        for (int i = 0; i < size; i++) {
            int math = (int)Math.pow( i, power);
            mathArr[i] = math;

            /*int math = scanner.nextInt();

            math.add(newArr);
            //return power >= size.length ? -1 : (int) Math.pow(size[power], power);
            int 1 = scanner.nextInt();
            int 2 = scanner.nextInt();
            int 3 = scanner.nextInt();
            math.add(1);
            math.add(2);
            math.add(3);*/

        }
        return mathArr;
    }

    double[ ] exampleArray = {1,5,6,5,4,1};


}

//tried plain mathpow     int three = Math.pow(3, 6);



//






