/**
 * 观察者设计模式
 */
package designPattern;

import java.util.Observable;
import java.util.Observer;

class People implements Observer{  // 这是所有的观察者

	@Override
	public void update(Observable o, Object arg) {  // 一旦你关注的事情发生了变化
		if(o instanceof House) {  // 如果现在发现House这个被观察者改变了
			if(arg instanceof Double) {
				System.out.println("【人们观察到】房价变动，新价格: " + arg);
			}
		}
	}
	
}

class House extends Observable {  // 被观察者
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price != this.price) {
			super.setChanged();  // 现在我们关注的内容改变了
			super.notifyObservers(price);  // 唤醒所有的观察者
		}
		this.price = price;
	}

	public House(double price) {
		this.price = price;
	}
}

public class ObserverPattern {

	public static void main(String[] args) {
		People p1 = new People();
		People p2 = new People();
		People p3 = new People();
		People p4 = new People();
		House house = new House(800000.00);
		house.addObserver(p1);  // 必须手工设置观察者
		house.addObserver(p2);
		house.addObserver(p3);
		house.addObserver(p4);
		house.setPrice(10000.00);
	}

}
