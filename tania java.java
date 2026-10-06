package grade;
import.java.util.*;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your average mark:");
        int average = scanner.nextInt();

        checkGrade(average);

        scanner.close();
    }

    public static void checkGrade(int average) {
        if (average >= 80) {
            System.out.println("Your grade is A");
        } else if (average >= 60) {
            System.out.println("Your grade is B");
        } else if (average >= 50) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is D");
        }
    }
}