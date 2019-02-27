package modele;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Game {
	
	private Deck deck;
	private int questionNumber;
	private Question currentQuestion;
	private List<String> currentAnswers;
	private int correctAnswer;
	
	public Game() {
		deck=Deck.fromJson();
		questionNumber=1;
		newQuestion();
	}
	
	//Generate a new question depending of the advancement of the game
	public void newQuestion() {
		Round round;
		if(questionNumber<6) {
			round=Round.FIRST_ROUND;
		}
		else {
			if(questionNumber<11) {
				round=Round.SECOND_ROUND;
			}
			else {
				round=Round.LAST_ROUND;
			}
		}
		int size = deck.getQuestions().size();
		Random rand = new Random();
		int questionNb;
		
		do {
			questionNb=rand.nextInt(size);
		}
		while(deck.getQuestions().get(questionNb).getRound().equals(round));
		
		currentQuestion=deck.getQuestions().get(questionNb);
		
		int i=0;
		for(HashMap.Entry<String, Boolean> entry : deck.getQuestions().get(questionNb).getChoices().entrySet()) {
			currentAnswers.add(entry.getKey());
			if(entry.getValue()) {
				correctAnswer=i;
			}
			i++;
		}
	}
	
	public String showQuestion() {
		return currentQuestion.getStatement();
	}
	
	public String showAnswer(int n) {
		return currentAnswers.get(n);
	}
	
	public boolean confirmAnswer(int n) {
		return n==correctAnswer;
	}
	

}
