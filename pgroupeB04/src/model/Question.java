package model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Question {

	private String author;
	private Round round;
	private String statement;
	private Map<String, Boolean> choices;

	public Question(String author, Round round, String statement) {
		this.author = author;
		this.round = round;
		this.statement = statement;
		choices = new HashMap<String, Boolean>();
	}

	public boolean addChoice(String choice, Boolean correct) {
		boolean out = false;
		
		//If already 4 choices then out
		if (choices.size()==4){
			out=true;
		}
		
		//If already 3 choices, look closer
		if(choices.size()==3) {
			boolean alreadyTrue = false;
			//If the choice we want to add is not the correct answer and there is still no correct answer then out (because it's the last choice we can add)
			if(!correct) {
				for(Map.Entry<String, Boolean> mapEntry : choices.entrySet()) {
					if(mapEntry.getValue()==true) {
						alreadyTrue = true;
					}
				}
				if(!alreadyTrue) {
					out=true;
				}
			}
		}
				
		
		//If the choice we want to add is the correct answer and there is already a correct answer then out
		if(correct) {
			for(Map.Entry<String, Boolean> mapEntry : choices.entrySet()) {
				if(mapEntry.getValue()==true) {
					out = true;
				}
			}
		}
		
		//If the choice is already in the choices Map then out
		for(Map.Entry<String, Boolean> mapEntry : choices.entrySet()) {
			if(mapEntry.getKey().contentEquals(choice)) {
				out = true;
			}
		}
		
		//If out then don't add the choice
		if(!out) {
			choices.put(choice, correct);
			return true;
		}
		return false;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Round getRound() {
		return round;
	}
	
	public String getStatement() {
		return statement;
	}
	
	public boolean isValid() {
		
		if(choices.size()!=4) {
			return false;
		}
		
		int nbTrue=0;
		for(Map.Entry<String, Boolean> mapEntry : choices.entrySet()) {
			if(mapEntry.getValue()==true) {
				nbTrue++;;
			}
		}
		if(nbTrue!=1) {
			return false;
		}
		return true;
	}
	
	public Map<String, Boolean> getChoices(){
		HashMap<String, Boolean> choices = new HashMap<String, Boolean>();
		choices.putAll(this.choices);
		return choices;
	}
	
	public Question clone() {
		Question q = new Question(author, round, statement);
		q.choices.putAll(choices);
		return q;
	}	
}
