package model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ScoreList {

	private List<Pseudo> scoreList;

	public ScoreList() {
		scoreList = new ArrayList<>();
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static ScoreList fromJson(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, ScoreList.class);
	}

	public void add(Pseudo ps) {
		scoreList.add(ps);
	}

	public List<Pseudo> getScoreList() {
		return scoreList;
	}
}
