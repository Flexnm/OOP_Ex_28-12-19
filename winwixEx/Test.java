package winwixEx;

public class Test {
	public static void main(String[] args) {
		
		Control[] ctrl = new Control[6];
		
		ctrl[0] = new Button("Hello", "Blue");
		ctrl[1] = new Button("Click This", "Black");
		ctrl[2] = new TextBox("Meow", 7);
		ctrl[3] = new TextBox("Hello");
		ctrl[4] = new PassText("whatsup");
		ctrl[5] = new PassText("Interesting");
		
		for (int i = 0; i < ctrl.length; i++) {
			System.out.println(ctrl[i].draw());
			System.out.println("==============");
		}
		
		
		
		
		
		
		
//		Button but = new Button("Hello", "Wot");
//		TextBox text1 = new TextBox("hello", 9);
//		TextBox text2 = new TextBox("hello");
//		PassText pass1 = new PassText("whatsup");
//		
//		System.out.println(but.draw());
//		System.out.println(text1.draw());
//		System.out.println(text2.draw());
//		System.out.println(pass1.draw());
	}

}
