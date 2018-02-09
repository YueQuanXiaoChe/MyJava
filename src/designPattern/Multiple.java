/**
 * 多例模式
 */
package designPattern;

class Color {

	private static final Color RED = new Color("RED");
	private static final Color GREEN = new Color("GREEN");
	private static final Color BLUE = new Color("BLUE");

	private String title;

	private Color(String title) {
		this.title = title;
	}

	public static Color getInstance(int ch) {
		switch (ch) {
		case 0:
			return RED;

		case 1:
			return GREEN;

		case 2:
			return BLUE;

		default:
			return null;
		}
	}

	public String toString() {
		return this.title;
	}

}

public class Multiple {

	public static void main(String[] args) {
		System.out.println(Color.getInstance(0));
	}

}