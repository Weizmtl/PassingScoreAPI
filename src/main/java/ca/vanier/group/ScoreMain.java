package ca.vanier.group;

import java.util.Scanner;

/**
 * @author wei
 * @description
 * @create 2023-01-05-20:33
 */
public class ScoreMain {
	public static void main(String[] args) {
		PassingScore passingScore = new PassingScore();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your score: ");
		int score = scanner.nextInt();

		if(passingScore.isPassed(score)) {
			System.out.println("you are passed!!");
		} else {
			System.out.println("you are not passed!!");
		}
	}
}
