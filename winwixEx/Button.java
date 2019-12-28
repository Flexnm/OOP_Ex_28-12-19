package winwixEx;

public class Button extends Control {
	
	private String color;
	
	public Button(String label, String color) {
		super(label);
		this.color = color;
	}
	
	public String draw() { // getLabel().length() gives the length of the String object.
		String str = "";
		for (int i = 0; i < getLabel().length(); i++) {
			str +=  "*";
		}
		str += "\n" + getLabel() + "\n";
		for (int i = 0; i < getLabel().length(); i++) {
			str +=  "*";
		}
		return str;
	}
	
	
		
	

}
