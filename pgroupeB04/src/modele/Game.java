package modele;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Game {
	
	private Deck deck;
	private int currentQuestionNumber;
	private Question currentQuestion;
	private List<String> currentAnswers;
	private int correctAnswer;
	
	public Game() {
		deck=Deck.fromJson();
		currentQuestionNumber=0;
		newQuestion();
	}
	
	//Generate a new question depending of the advancement of the game
	public void newQuestion() {
		currentQuestionNumber++;
		
		//A random question is chosen depending of the Round the player is in which is determined by the number of the current question
		Round round;
		if(currentQuestionNumber<6) {
			round=Round.FIRST_ROUND;
		}
		else {
			if(currentQuestionNumber<11) {
				round=Round.SECOND_ROUND;
			}
			else {
				round=Round.LAST_ROUND;
			}
		}
		int size = deck.getQuestions().size();
		
		//Pick a random question while not in the correct round
		Random rand = new Random();
		int questionNb;
		
		do {
			questionNb=rand.nextInt(size);
		}
		while(!deck.getQuestions().get(questionNb).getRound().equals(round));
		
		//Setting the current question
		currentQuestion=deck.getQuestions().get(questionNb);
		
		//Setting the index of the correct answer
		int i=0;
		for(HashMap.Entry<String, Boolean> entry : deck.getQuestions().get(questionNb).getChoices().entrySet()) {
			currentAnswers.add(entry.getKey());
			if(entry.getValue()) {
				correctAnswer=i;
			}
			i++;
		}
		deck.getQuestions().remove(questionNb);
	}
	
	//Shows the question
	public String showQuestion() {
		return currentQuestion.getStatement();
	}
	
	//Shows the chosen answer
	public String showAnswer(int n) {
		return currentAnswers.get(n);
	}
	
	//Checking if the chosen answer is the correct answer
	public boolean isAnswerCorrect(int n) {
		return n==correctAnswer;
	}
	

}
