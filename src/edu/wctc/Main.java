package edu.wctc;

import java.util.Scanner;
//project implements commons-codec-1.15.jar
//project implements commons-validator-1.7.jar

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter a middle initial");
        String middleInitial = scanner.nextLine();
        System.out.println("Enter a last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your birth year in four digits.");
        Integer birthYear = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter your birth month in two digits.");
        Integer birthMonth = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the day of your birth in two digits.");
        Integer birthDate = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter your gender (M or F)");
        char genderCode = scanner.nextLine().charAt(0);

        try {
            //try logic
            DriversLicense dl = new DriversLicense();

        } catch (Exception e) {

        }
    }
}