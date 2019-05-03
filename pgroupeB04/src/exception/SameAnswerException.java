package exception;

import java.util.Map;

public class SameAnswerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SameAnswerException(Map<String, Boolean> choices) {
		super("The answer is already in the list");
	}

}
