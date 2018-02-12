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
	
}

public class ObserverPattern {

	public static void main(String[] args) {
		
	}

}
