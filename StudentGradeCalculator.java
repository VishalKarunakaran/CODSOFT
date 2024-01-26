package com.company;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Number of subjects can be adjusted based on your requirements
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            // Array to store marks for each subject
            int[] subjectMarks = new int[numSubjects];

            // Input marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks obtained in Subject " + (i + 1) + ": ");
                subjectMarks[i] = scanner.nextInt();
            }

            // Calculate total marks
            int totalMarks = 0;
            for (int marks : subjectMarks) {
                totalMarks += marks;
            }

            // Calculate average percentage
            double averagePercentage = (double) totalMarks / numSubjects;

            // Assign grades based on average percentage
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display results
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }


