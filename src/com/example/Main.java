package com.example;

import com.example.common.Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a Month");

        for (Month month: Month.values()){
            System.out.print(month.getEnglishName() + " , ");
        }
        System.out.println();
        String monthChoice = scanner.nextLine();
        System.out.println("the month you chose and the successive months shown below");
        System.out.println(Month.monthsFollowing(monthChoice));
    }
}
