package exception;

import java.util.List;

import model.Question;

public class SameQuestionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SameQuestionException(List<Question> q) {
		super("The question is already in the list");
	}

}
