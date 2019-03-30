package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JCallStrategy implements IJokerStrategy{

	
	public void useJoker(Game g) {
		
		List<String> call = new ArrayList<>();
		
		call.add("I really don't know the answer. Sorry.");
		call.add("I'm not sure but i think it's ");
		call.add("I'm sure that the answer is ");
		
		Random rand = new Random();
		int answerIndex = rand.nextInt(2-0+1);
		
		String answer = call.get(answerIndex);
		g.setrCall(answer);
	}
}
