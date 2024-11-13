package StudentGradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        // Initialize Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        // ArrayList to store grades entered by the user
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter grades for students (type -1 to finish):");

        // Continuously prompt the user to enter grades until they type -1
        while (true) {
            double grade = scanner.nextDouble(); // Read the grade
            if (grade == -1) break; // Stop if the user enters -1
            grades.add(grade); // Add the grade to the list
        }

        // Variables to keep track of total sum, highest, and lowest grades
        double total = 0;
        double highest = Double.MIN_VALUE; // Initialize to minimum possible value
        double lowest = Double.MAX_VALUE; // Initialize to maximum possible value

        // Loop through all grades to calculate the sum, highest, and lowest
        for (double grade : grades) {
            total += grade; // Add each grade to the total
            if (grade > highest) highest = grade; // Update highest if current grade is larger
            if (grade < lowest) lowest = grade; // Update lowest if current grade is smaller
        }

        // Calculate the average by dividing total by the number of grades
        double average = total / grades.size();

        // Display the computed average, highest, and lowest grades
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
