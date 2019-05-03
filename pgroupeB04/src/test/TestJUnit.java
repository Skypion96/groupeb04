package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Deck;
import model.Game;
import model.J5050Strategy;
import model.JAudienceStrategy;
import model.JCallStrategy;
import model.Levels;
import model.Question;
import model.Round;

class TestJUnit {
	
	Question q = new Question("Vincent", Round.FIRST_ROUND, "Test");
	Question q2 = new Question("Vincent", Round.SECOND_ROUND, "Test");
	Question q3 = new Question("Vincent", Round.LAST_ROUND, "Test");
	Deck d = new Deck();
	Game g = new Game();
	Levels l ;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// Test clone method
	@Test
	void testClone() {
		q.clone();
	}

	// Test addChoice  method
	@Test 
	void AddAnswer() {
		q.addChoice("vrai", true);
		q.addChoice("faux1", false);
		q.addChoice("faux2", false);
		q.addChoice("faux3", false);
	}
	
	@Test
	void addQuestion() {
		d.addQuestion(q);
		d.addQuestion(q2);
		d.addQuestion(q3);
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
	}
	
	@Test
	void gameTestJokerAudience() {
		g.setStrategy(new JAudienceStrategy());
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
	
}
