package model;

public enum Levels {

	LVL15("15 -         1 000 000 €"), LVL14("14 -            300 000 €"), LVL13("13 -            150 000 €"), LVL12("12 -            100 000 €"), LVL11("11 -              72 000 €"), LVL10("10 -              48 000 €"), LVL9("9 -                24 000 €"), LVL8("8 -                12 000 €"), LVL7("7 -                  6 000 €"), LVL6("6 -                  3 000 €"), LVL5("5 -                  1 500 €"), LVL4("4 -                     800 €"), LVL3("3 -                     500 €"), LVL2("2 -                     300 €"), LVL1("1 -                     200 €");
	
	private String name;
	
	private Levels(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
	
}
