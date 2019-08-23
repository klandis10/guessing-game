package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game");
		System.out.println("Make a Guess:");
		
		Scanner input = new Scanner(System.in);
		int winningNumber = 7;
		int guess = input.nextInt();
		int guessCount = 0;
		while (guess != -1 && guessCount < 2) {
		
		if (guess == 0) {
			System.out.println("Eat a waffle and pick a number between 1 and 10");
			
}       else if (guess != winningNumber) {
			System.out.println("Wrong answer.");
			
		}
		if (guessCount == 0) {
			System.out.println("You get one more guess.");
			
			< winningNumber) {
		}
			System.out.println("You guessed too low, you get one more try.");
		}
		else if (guess > winningNumber) {
			System.out.println("You guessed too high, you get one more try.");
			
		} guessCount++; }
		
		if (guess != winningNumber){
			System.out.println("Wrong, you lose. =,(");
		
		}
		
		if (guess == winningNumber) {
			System.out.println("You Win!!!");
					break;
		
	
	} }}




