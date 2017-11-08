package com.github.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadQuiz {
	public List<String> Read(String filename) {
		BufferedReader reader = null;
		List<String> output = new ArrayList<String>();
		
		try {
			File file = new File(filename);
			reader = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = reader.readLine()) != null) {
		        output.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return output;
	}
	
}
