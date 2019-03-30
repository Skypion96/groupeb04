package model;

import java.util.Random;

public class JPublicStrategy implements IJokerStrategy{

	public void useJoker(Game g) {
		
		
		Random rand = new Random();
		int	correctAnswer = rand.nextInt(100-50+1)+50;
		int wrongAnswer1 = rand.nextInt((100-correctAnswer));
		int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
		int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
		g.getRandomJoker().add(correctAnswer);
		g.getRandomJoker().add(wrongAnswer1);
		g.getRandomJoker().add(wrongAnswer2);
		g.getRandomJoker().add(wrongAnswer3);
	}
}
