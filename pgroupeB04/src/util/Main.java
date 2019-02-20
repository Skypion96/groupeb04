package util;

import modele.Deck;
import modele.Question;
import modele.Round;
import serialisation.Serialisation;

public class Main {

	public static void main(String[] args) {
		
		Question q1 = new Question("Maxime", Round.FIRST_ROUND, "What's the capital of France ?");
		q1.addChoice("Bruxelles", false);
		q1.addChoice("Paris", true);
		q1.addChoice("Luxembourg", false);
		q1.addChoice("Berlin", false);
		Question q2 = new Question("Vincent", Round.FIRST_ROUND, "Who build the Eiffel Tower ?");
		q2.addChoice("Gustave Eiffel", true);
		q2.addChoice("Jean-Pierre Foucault", false);
		q2.addChoice("Nicolas Sarkozy", false);
		q2.addChoice("François Mitterrand", false);
		Deck d1 = new Deck();
		d1.addQuestion(q1);
		d1.addQuestion(q2);
		Serialisation.writeDeck(d1.toJson());
		Deck d2 = new Deck();
		d2 = Deck.fromJson();
		System.out.println(d2.getQuestions().get(1).getStatement());
		
	}

}
