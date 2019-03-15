package util;

import model.Deck;
import model.Question;
import model.Round;
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
		q2.addChoice("Fran�ois Mitterrand", false);
		Question q3 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 1");
		q3.addChoice("No1", false);
		q3.addChoice("No2", false);
		q3.addChoice("No3", false);
		q3.addChoice("Yes", true);
		Question q4 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 2");
		q4.addChoice("No1", false);
		q4.addChoice("No2", false);
		q4.addChoice("No3", false);
		q4.addChoice("Yes", true);
		Question q5 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 3");
		q5.addChoice("No1", false);
		q5.addChoice("No2", false);
		q5.addChoice("No3", false);
		q5.addChoice("Yes", true);
		Question q6 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 1");
		q6.addChoice("No1", false);
		q6.addChoice("No2", false);
		q6.addChoice("No3", false);
		q6.addChoice("Yes", true);
		Question q7 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 2");
		q7.addChoice("No1", false);
		q7.addChoice("No2", false);
		q7.addChoice("No3", false);
		q7.addChoice("Yes", true);
		Question q8 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 3");
		q8.addChoice("No1", false);
		q8.addChoice("No2", false);
		q8.addChoice("No3", false);
		q8.addChoice("Yes", true);
		Question q9 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 4");
		q9.addChoice("No1", false);
		q9.addChoice("No2", false);
		q9.addChoice("No3", false);
		q9.addChoice("Yes", true);
		Question q10 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 5");
		q10.addChoice("No1", false);
		q10.addChoice("No2", false);
		q10.addChoice("No3", false);
		q10.addChoice("Yes", true);
		Question q11 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 1");
		q11.addChoice("No1", false);
		q11.addChoice("No2", false);
		q11.addChoice("No3", false);
		q11.addChoice("Yes", true);
		Question q12 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 2");
		q12.addChoice("No1", false);
		q12.addChoice("No2", false);
		q12.addChoice("No3", false);
		q12.addChoice("Yes", true);
		Question q13 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 3");
		q13.addChoice("No1", false);
		q13.addChoice("No2", false);
		q13.addChoice("No3", false);
		q13.addChoice("Yes", true);
		Question q14 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 4");
		q14.addChoice("No1", false);
		q14.addChoice("No2", false);
		q14.addChoice("No3", false);
		q14.addChoice("Yes", true);
		Question q15 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 5");
		q15.addChoice("No1", false);
		q15.addChoice("No2", false);
		q15.addChoice("No3", false);
		q15.addChoice("Yes", true);
		Deck d1 = new Deck();
		d1.addQuestion(q1);
		d1.addQuestion(q2);
		d1.addQuestion(q3);
		d1.addQuestion(q4);
		d1.addQuestion(q5);
		d1.addQuestion(q6);
		d1.addQuestion(q7);
		d1.addQuestion(q8);
		d1.addQuestion(q9);
		d1.addQuestion(q10);
		d1.addQuestion(q11);
		d1.addQuestion(q12);
		d1.addQuestion(q13);
		d1.addQuestion(q14);
		d1.addQuestion(q15);
		Serialisation.writeDeck(d1.toJson());
		Deck d2 = new Deck();
		d2 = Serialisation.readDeck();
		System.out.println(d2.getQuestions().get(0).getStatement());

		System.out.println();

	}

}
