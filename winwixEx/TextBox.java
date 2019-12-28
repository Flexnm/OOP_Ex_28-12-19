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
			str += stars(getCharNum(), getLabel());	
		} else {
			str += str += stars(8, "");
		}
		return str;
	}

	public static String stars(int num, String text) {
		String str = "";
		for (int i = 0; i < num; i++) {
			str +=  "*";
		}
		str += "\n" + text + "\n";
		for (int i = 0; i < num; i++) {
			str +=  "*";
		}
		return str;
	}

}
