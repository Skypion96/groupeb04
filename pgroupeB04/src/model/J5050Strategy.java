package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import view.GameView;

public class J5050Strategy implements IJokerStrategy{
	
	
	
	public J5050Strategy() {
		choices = new ArrayList<>();
	}

	private List<String> choices;
	
	public void useJoker(Game g) {
		
		choices = g.getCurrentAnswers();
		int indexCorrectAnswers = g.getCorrectAnswer();
		
		choices.remove(indexCorrectAnswers);
		Random rand = new Random();
		int wrongAnswer = rand.nextInt(3-1+1)+1;
		
		choices.remove(wrongAnswer);
	}

	public List<String> getChoices() {
		return choices;
	}
	
	

}
