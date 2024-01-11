package com.Game;
import java.util.*;
public class GuessingGame {
	public static void main(String[]  args) {
		int guess = 0;
		int count = 0;
		System.out.println("Guess a number between 1 to 100");
		Scanner in = new Scanner(System.in);
		
		int randnum = (int)(Math.random()*100)+1;
		
		while(randnum!=guess) {
			guess = in.nextInt();
			if(guess > randnum) {
				System.out.println("Your guess is higher");
			}
			else if(randnum>guess) {
				System.out.println("Your guess is lower");
			}
			else {
				System.out.println("You guessed Correct!");
				break;
			}
			count++;
		}
		System.out.println("You took " + count + " steps to guess number");
	}
}
