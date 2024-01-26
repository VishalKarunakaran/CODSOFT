package com.company;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int minRange = 1;
                int maxRange = 100;
                int attemptsLimit = 10;
                int totalRounds = 3; // You can change the number of rounds as needed

                int totalAttempts = 0;
                int roundsWon = 0;

                System.out.println("Welcome to the Number Game!");

                for (int round = 1; round <= totalRounds; round++) {
                    System.out.println("\nRound " + round + ":");
                    int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                    boolean roundWon = false;

                    for (int attempt = 1; attempt <= attemptsLimit; attempt++) {
                        System.out.print("Enter your guess (between " + minRange + " and " + maxRange + "): ");
                        int userGuess = scanner.nextInt();

                        if (userGuess == targetNumber) {
                            System.out.println("Congratulations! You guessed the correct number.");
                            roundWon = true;
                            break;
                        } else if (userGuess < targetNumber) {
                            System.out.println("Too low. Try again.");
                        } else {
                            System.out.println("Too high. Try again.");
                        }

                        totalAttempts++;
                    }

                    if (roundWon) {
                        System.out.println("Round " + round + " won in " + attemptsLimit + " attempts!");
                        roundsWon++;
                    } else {
                        System.out.println("Round " + round + " lost. The correct number was: " + targetNumber);
                    }
                }

                System.out.println("\nGame Over!");
                System.out.println("Total Rounds Won: " + roundsWon);
                System.out.println("Total Attempts: " + totalAttempts);

                scanner.close();
            }
        }


