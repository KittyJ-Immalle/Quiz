package com.github.quiz;

import java.util.ArrayList;

public class RunQuiz extends ReadQuiz {

	public static void main(String[] args) {
		
		ReadQuiz readquiz = new ReadQuiz();
		ArrayList<String> questions = new ArrayList<String>();
		
		questions = (ArrayList<String>) readquiz.Read("questions.txt");
		System.out.println(questions);
		

	}

}