package model;

import java.util.Random;

public class JAudienceStrategy implements IJokerStrategy{

	public void useJoker(Game g) {
		Random rand = new Random();
		
		
		
		if(g.getCurrentQuestionNumber() < 6) {
			int	correctAnswer = rand.nextInt(100-50+1)+50;
			int wrongAnswer1 = rand.nextInt((100-correctAnswer));
			int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
			int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
			g.getRandomJoker().add(correctAnswer);
			g.getRandomJoker().add(wrongAnswer1);
			g.getRandomJoker().add(wrongAnswer2);
			g.getRandomJoker().add(wrongAnswer3);
		}
		else if (g.getCurrentQuestionNumber() < 11) {
			int possibility = rand.nextInt(100-25+1);
			if(possibility > 50) {
				int	correctAnswer = rand.nextInt(100-50+1)+50;
				int wrongAnswer1 = rand.nextInt((100-correctAnswer));
				int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
				int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
				g.getRandomJoker().add(correctAnswer);
				g.getRandomJoker().add(wrongAnswer1);
				g.getRandomJoker().add(wrongAnswer2);
				g.getRandomJoker().add(wrongAnswer3);
			}
			else {
				int	correctAnswer = possibility;
				int wrongAnswer1 = rand.nextInt((100-correctAnswer));
				int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
				int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
				g.getRandomJoker().add(correctAnswer);
				g.getRandomJoker().add(wrongAnswer1);
				g.getRandomJoker().add(wrongAnswer2);
				g.getRandomJoker().add(wrongAnswer3);
			}
		}
		else {
			int possibility = rand.nextInt(100-0+1);
			int	correctAnswer = possibility;
			int wrongAnswer1 = rand.nextInt((100-correctAnswer));
			int wrongAnswer2 = rand.nextInt(100-correctAnswer-wrongAnswer1);
			int wrongAnswer3 = 100-correctAnswer-wrongAnswer1-wrongAnswer2;
			g.getRandomJoker().add(correctAnswer);
			g.getRandomJoker().add(wrongAnswer1);
			g.getRandomJoker().add(wrongAnswer2);
			g.getRandomJoker().add(wrongAnswer3);
		}
	}
}
