package com.tts;

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


        //int[] math = toPower(2, 2);

    }

}

 /*   //make toPower with two int as size, power
    public static int toPower(int[] size, int power) {
        //below not working..but should be something like this
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> math = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            int newArr = scanner.nextInt();
            math.add(newArr);
            return power >= size.length ? -1 : (int) Math.pow(size[power], power);
            int 1 = scanner.nextInt();
            int 2 = scanner.nextInt();
            int 3 = scanner.nextInt();
            math.add(1);
            math.add(2);
            math.add(3);

        }
        return power;
    }

}

//tried plain mathpow     int three = Math.pow(3, 6);



//
*/





