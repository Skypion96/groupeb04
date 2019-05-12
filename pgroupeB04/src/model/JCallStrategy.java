package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JCallStrategy implements IJokerStrategy{

	//redefinition method interface + create an answer with the good choice or not
	public void useJoker(Game g) {
		
		List<String> call = new ArrayList<>();
		//predefined sentences
		call.add("I really don't know the answer. Sorry.");
		call.add("I'm not sure but i think it's ");
		call.add("I'm sure that the answer is ");
		
		Random rand = new Random();
		int answerIndex = rand.nextInt(2-0+1);
		//choose sentence
		String answer = call.get(answerIndex);
		g.setrCall(answer);
	}
}
