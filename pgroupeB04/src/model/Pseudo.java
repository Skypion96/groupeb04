package model;

import com.google.gson.Gson;

public class Pseudo {

	private String name;
	private String score;
	
	public Pseudo(String name, String score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Pseudo [name=" + name + ", gain=" + score + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(String score) {
		this.score = score;
	}
	

}
