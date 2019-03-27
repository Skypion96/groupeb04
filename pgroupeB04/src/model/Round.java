package model;

public enum Round {
	FIRST_ROUND("First Round"), SECOND_ROUND("Second Round"), LAST_ROUND("Last Round");
	private String roundName;

	private Round(String roundName) {
		this.roundName = roundName;
	}

	@Override
	public String toString() {
		return roundName;
	}
}
