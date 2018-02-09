/**
 * 泛型的基本使用
 */
package generic;

class Point<T> {
	private T x;
	private T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
}

public class GenericBasic {

	public static void main(String[] args) {
		// 设置数据
		Point<String> p = new Point<String>();
		p.setX("东经10度"); // 设置坐标
		p.setY("北纬20度");
		// 取出数据
		String x = p.getX();
		String y = p.getY();
		System.out.println("x = " + x + ", y = " + y);
	}

}