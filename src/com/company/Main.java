package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("""
                        1.Monday
                        2.Tuesday
                        3.Wednesday
                        4.Thursday
                        5.Friday
                        6.Saturday
                        7.Sunday""");
                System.out.println("Please choose one day!");
                int numberOfDay = sc.nextInt();
                switch (numberOfDay) {
                    case 1:
                        System.out.println(Days.MONDAY.getDifference()+"\n");
                        break;
                    case 2:
                        System.out.println(Days.TUESDAY.getDifference()+"\n");
                        break;
                    case 3:
                        System.out.println(Days.WEDNESDAY.getDifference()+"\n");
                        break;
                    case 4:
                        System.out.println(Days.THURSDAY.getDifference()+"\n");
                        break;
                    case 5:
                        System.out.println(Days.FRIDAY.getDifference()+"\n");
                        break;
                    case 6:
                        System.out.println(Days.SATURDAY.getDifference()+"\n");
                        break;
                    case 7:
                        System.out.println(Days.SUNDAY.getDifference()+"\n");
                        break;
                    default:
                        System.out.println("Are you stupid? " +
                                "We don't have such day.");
                        System.out.println();
                }

            } catch (InputMismatchException e) {
                System.err.println("""
                        Ailanaiyn tuura jazchy
                        Sandary menen tanda\n""");
            }
        }
    }
}
