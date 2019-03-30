package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class J5050Strategy implements IJokerStrategy{
	
	
	
	public void useJoker(Game g) {
		
		List<String> choices = new ArrayList<>();
		choices = g.getCurrentAnswers();
		int indexCorrectAnswers = g.getCorrectAnswer();
		
		choices.remove(indexCorrectAnswers);
		Random rand = new Random();
		int wrongAnswer = rand.nextInt(2-0+1)+0;
		
		choices.remove(wrongAnswer);
	}


}
