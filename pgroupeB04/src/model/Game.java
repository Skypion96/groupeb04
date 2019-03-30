package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import serialisation.Serialisation;

public class Game {

	private int currentQuestionNumber;
	private Question currentQuestion;
	private List<Question> questionList;
	private List<String> currentAnswers;
	private int correctAnswer;
	private IJokerStrategy joker;
	private List<Integer> randomJoker;
	private String rCall;

	public Game() {
		questionList = Serialisation.readDeck().getQuestions();
		currentQuestionNumber = 0;
		currentAnswers = new ArrayList<String>();
		randomJoker = new ArrayList<>();
	}

	// Generate a new question depending of the advancement of the game
	public void newQuestion() {
		currentQuestionNumber++;
		currentAnswers.clear();

		// A random question is chosen depending of the Round the player is in which is
		// determined by the number of the current question
		Round round;
		if (currentQuestionNumber < 6) {
			round = Round.FIRST_ROUND;
		} else {
			if (currentQuestionNumber < 11) {
				round = Round.SECOND_ROUND;
			} else {
				round = Round.LAST_ROUND;
			}
		}
		int size = questionList.size();

		// Pick a random question while not in the correct round
		Random rand = new Random();
		int questionNb;

		do {
			questionNb = rand.nextInt(size);
		} while (!questionList.get(questionNb).getRound().equals(round));

		// Setting the current question
		currentQuestion = questionList.get(questionNb);

		// Setting the index of the correct answer
		int i = 0;
		for (HashMap.Entry<String, Boolean> entry : questionList.get(questionNb).getChoices().entrySet()) {
			currentAnswers.add(entry.getKey());
			if (entry.getValue()) {
				correctAnswer = i;
			}
			i++;
		}

		// Remove the chosen question from the question list to avoid to get the same
		// question twice
		questionList.remove(questionNb);

	}

	// Shows the question
	public String showStatement() {
		return currentQuestion.getStatement();
	}

	// Shows the chosen answer
	public String showAnswer(int n) {
		return currentAnswers.get(n);
	}

	// Checking if the chosen answer is the correct answer
	public boolean isAnswerCorrect(int n) {
		return n == correctAnswer;
	}

	// Getter correct answer
	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public List<String> getCurrentAnswers() {
		return currentAnswers;
	}
	
	public int getCurrentQuestionNumber() {
		return currentQuestionNumber;
	}
	
	public void setStrategy(IJokerStrategy joker) {
		this.joker = joker;
	}
	
	
	
	public List<Integer> getRandomJoker() {
		return randomJoker;
	}

	public void useJoker() 
	{
		if (joker != null) 
		{
			joker.useJoker(this);			
			
		}											
	}

	public String getrCall() {
		return rCall;
	}

	public void setrCall(String rCall) {
		this.rCall = rCall;
	}



}
