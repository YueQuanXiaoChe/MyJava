/**
 * 接口的设计模式: 代理设计模式
 */
package designPattern;

interface ISubject {
	public abstract void fun(); // 核心功能
}

class RealSubject implements ISubject { // 真实业务

	public void fun() {
		System.out.println("<<< 调用真实的业务  >>>");
	}

}

class ProxySubject implements ISubject { // 代理实现

	private ISubject subject; // 真正的操作业务
	// 在创建代理类对象的时候必须设置要代理的真实主题

	public ProxySubject(ISubject subject) {
		this.subject = subject;
	}

	public void pre() {
		System.out.println("--- 真实操作前的准备  ---");
	}

	public void pro() {
		System.out.println("--- 真实操作后的收尾 ---");
	}

	public void fun() { // 接口子类一定要实现的抽象方法
		this.pre(); // 真实操作前的准备
		subject.fun(); // 调用真实的业务
		this.pro(); // 真实操作后的收尾
	}

}

class Factory {

	public static ISubject getInstance() {
		return new ProxySubject(new RealSubject());
	}

}

public class ProxyPattern {

	public static void main(String[] args) {
		ISubject sub = Factory.getInstance();
		// 通过代理类对象发出，利用代理类来实现真实业务调用
		sub.fun();
	}

}