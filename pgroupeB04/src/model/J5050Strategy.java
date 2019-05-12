package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class J5050Strategy implements IJokerStrategy{
	
	
	//redefinition method interface + create list with 2 wrong choices
	public void useJoker(Game g) {
		
		List<String> choices = new ArrayList<>();
		choices = g.getCurrentAnswers();
		int indexCorrectAnswers = g.getCorrectAnswer();
		
		//remove correct choice
		choices.remove(indexCorrectAnswers);
		Random rand = new Random();
		int wrongAnswer = rand.nextInt(2-0+1)+0;
		//remove 1 wrong choice
		choices.remove(wrongAnswer);
		//at the end = list with 2 wrong choices
	}


}
