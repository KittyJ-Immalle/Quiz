package com.github.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class RunQuiz extends ReadQuiz {


	public static void main(String[] args) {
		
		Scanner scanInput = new Scanner(System.in);
		String YesNo;
		Run(scanInput);
		
		while(true) {
			System.out.println("Do you want to play again?");
			YesNo = scanInput.nextLine().toLowerCase();
			if(YesNo.equals("yes")) {
				Run(scanInput);
			} else if(YesNo.equals("no")) {
				System.out.println("You may now go, yes, go.");
				break;
			} else {
				System.out.println("Please only enter yes or no.");
			}
		}
		scanInput.close();
		
		
	}
	
	public static void Run(Scanner scanInput) {
		ReadQuiz readQuiz = new ReadQuiz();
		ArrayList<String> questions = new ArrayList<String>();
		questions = (ArrayList<String>) readQuiz.Read("questions.txt");
		for(int i = 0; i < questions.size(); i = i + 2) {
			
			System.out.println(questions.get(i));
			
			String input = scanInput.nextLine().toLowerCase();
			String[] answer = questions.get(i + 1).toLowerCase().split(",");
			
			for(int j = 0; j < answer.length; j++) {
				if (input.equals(answer[j])) {
					System.out.println("Correct");
					break;
				} else if (j == answer.length - 1){
					System.out.println("Wrong");
					System.out.println(answer[j]);
				}
			}
		}
	}

}