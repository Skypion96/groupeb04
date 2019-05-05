package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Deck;
import model.Game;
import model.J5050Strategy;
import model.JAudienceStrategy;
import model.JCallStrategy;
import model.Levels;
import model.Pseudo;
import model.Question;
import model.Round;
import model.ScoreList;

class TestJUnit {

	Question q;
	Question q2;
	Question q3;
	Deck d;
	Game g;
	Pseudo ps;
	ScoreList scorel;

	@BeforeEach
	void setUp() throws Exception {
		q = new Question("Vincent", Round.FIRST_ROUND, "Test");
		q2 = new Question("Vincent", Round.SECOND_ROUND, "Test");
		q3 = new Question("Vincent", Round.LAST_ROUND, "Test");
		d = new Deck();
		g = new Game();
		ps = new Pseudo("TestNom", "100€");
		scorel = new ScoreList();
	}

	@AfterEach
	void tearDown() throws Exception {
		q = null;
		q2 = null;
		q3 = null;
		d = null;
		g = null;
	}

	// Test clone method
	@Test
	void testClone() {
		System.out.println(q.clone());
	}

	// Test addChoice method
	@Test
	void AddAnswer() {
		q.addChoice("vrai", true);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
	}

	@Test
	void AddFifthAnswer() {
		q.addChoice("vrai", true);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
		q.addChoice("faux3", false);
	}

	@Test
	void AddTwoCorrectAnswers() {
		q.addChoice("vrai", true);
		q.addChoice("faux1", true);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
	}

	@Test
	void AddNoTrueAnswer() {
		q.addChoice("faux", false);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
	}

	@Test
	void addQuestion() {
		q.addChoice("Vrai", true);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
		d.addQuestion(q);
	}

	@Test
	void addWrongQuestion() {
		d.addQuestion(q);
	}

	@Test
	void isNotValidNotFourAnswers() {
		q.addChoice("Vrai", true);
		System.out.println(q.isValid());
	}

	@Test
	void isNotValidNotOneTrue() {
		q.addChoice("Vrai", true);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
		System.out.println(q.isValid());
	}

	@Test
	void deckToJson() {
		d.toJson();
	}

	@Test
	void deckFromJson() {
		d.fromJson(d.toJson());
	}

	@Test
	void deckGestQuestion() {
		d.getQuestions();
	}

	@Test
	void questionToJson() {
		q.toJson();
	}

	@Test
	void gameNewQuestion() {
		g.newQuestion();
	}

	@Test
	void gameTestJoker5050() {
		g.setStrategy(new J5050Strategy());
		g.newQuestion();
		g.useJoker();
	}

	@Test
	void gameTestJokerAudience() {
		g.setStrategy(new JAudienceStrategy());
		g.newQuestion();
		g.useJoker();
	}

	@Test
	void gameTestJokerAudienceSecondRound() {
		g.setStrategy(new JAudienceStrategy());
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		for(int i=1;i<=10;i++) {
			g.useJoker();
		}
	}

	@Test
	void gameTestJokerAudienceLastRound() {
		g.setStrategy(new JAudienceStrategy());
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.newQuestion();
		g.useJoker();
	}

	@Test
	void gameTestJokerCall() {
		g.setStrategy(new JCallStrategy());
		g.useJoker();
	}

	@Test
	void gameGetCorrectAnswer() {
		g.getCorrectAnswer();
	}

	@Test
	void gameGetCurrentAnswer() {
		g.getCurrentAnswers();
	}

	@Test
	void questGetAuthors() {
		q.getAuthor();
	}

	@Test
	void questGetStatement() {
		q.getStatement();
	}

	@Test
	void questGetRound() {
		q.getRound();
	}

	@Test
	void questGetChoices() {
		q.getChoices();
	}

	@Test
	void showStatement() {
		g.newQuestion();
		System.out.println(g.showStatement());
	}

	@Test
	void showAnswers() {
		g.newQuestion();
		for (int i = 0; i <= 3; i++) {
			System.out.println(g.showAnswer(i));
		}
	}

	@Test
	void isCorrectAnswer() {
		g.newQuestion();
		for (int i = 0; i <= 3; i++) {
			System.out.println(g.isAnswerCorrect(i));
		}
	}

	@Test
	void getRCall() {
		g.newQuestion();
		g.setStrategy(new JCallStrategy());
		g.useJoker();
		System.out.println(g.getrCall());
	}

	@Test
	void useNoJoker() {
		g.newQuestion();
		g.useJoker();
	}
	
	@Test
	void pseudoGetName() {
		System.out.println(ps.getName());
	}
	
	@Test
	void pseudoGetScore() {
		System.out.println(ps.getScore());
	}
	
	@Test
	void pseudoSetName() {
		ps.setName("Roger");
		System.out.println(ps.getName());
	}
	
	@Test
	void pseudoSetScore() {
		ps.setScore("1000€");
		System.out.println(ps.getScore());
	}

}
