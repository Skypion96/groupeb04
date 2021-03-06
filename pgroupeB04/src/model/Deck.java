package model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Deck {

	private List<Question> questions;

	public Deck() {
		questions = new ArrayList<Question>();
	}

	public boolean addQuestion(Question q) {
		if (q.isValid()) {
			return questions.add(q);
		}
		return false;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static Deck fromJson(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, Deck.class);
	}

	public List<Question> getQuestions() {
		List<Question> questions = new ArrayList<Question>();
		questions.addAll(this.questions);
		return questions;
	}
	
}
