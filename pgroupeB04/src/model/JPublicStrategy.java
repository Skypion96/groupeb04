package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JPublicStrategy implements IJokerStrategy{

	public void useJoker(Game g) {
		List<Integer> vote = new ArrayList<>();
		
		Random rand = new Random();
		int	correctAnswer = rand.nextInt(100-50+1)+50;
		int wrongAnswer1 = rand.nextInt((100-correctAnswer));
		int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
		int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
		vote.add(correctAnswer);
		vote.add(wrongAnswer1);
		vote.add(wrongAnswer2);
		vote.add(wrongAnswer3);
	}
}