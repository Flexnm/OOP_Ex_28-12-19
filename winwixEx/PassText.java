package winwixEx;

public class PassText extends TextBox {

	public PassText(String label) {
		super(label);
	}

	public String draw() {
		String str = "";
		for (int j = 0; j < 3; j++) { // is j < 3 because it needs to be 3 lines of text.
			for (int i = 0; i < getLabel().length(); i++) {
				str += "*";
			}
			str += "\n";
		}

		return str;
	}

	

}
