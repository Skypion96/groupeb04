package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Question;
import model.Round;

class TestJUnit {
	
	Question q = new Question("Vincent", Round.FIRST_ROUND, "Test");
	
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
}
