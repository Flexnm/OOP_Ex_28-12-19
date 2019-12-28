package winwixEx;

public abstract class Control {
	
	private String label;
	
	
	public Control(String label) {
		setLabel(label);
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public abstract String draw();

}
