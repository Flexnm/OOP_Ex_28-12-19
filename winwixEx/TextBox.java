package winwixEx;

public class TextBox extends Control {

	private int charNum;
	
	

	public TextBox(String label) {
		super(label);
		// this.charNum = 0;
	}

	public TextBox(String label, int charNum) {
		super(label);
		setCharNum(charNum);
	}

	public int getCharNum() {
		return charNum;
	}

	public void setCharNum(int charNum) {
		this.charNum = charNum;
	}

	public String draw() {
		String str = "";
		if (getCharNum() > 0 && getCharNum() >= getLabel().length()) {
			str += stars(getCharNum(), getLabel());	// Helper method used here.
		} else {
			str += str += stars(8, ""); // Helper method used here too.
		}
		return str;
	}

	public static String stars(int num, String text) { // I decided to make a helper method.
		String str = ""; // I use the helper method because I didnt want to type it twice.
		for (int i = 0; i < num; i++) {
			str +=  "*"; // It builds the * lines above and below the label text
		}
		str += "\n" + text + "\n"; // Label text goes here in the middle.
		for (int i = 0; i < num; i++) {
			str +=  "*"; // Second * line.
		}
		return str;
	}

}
