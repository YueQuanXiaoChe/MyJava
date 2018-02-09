/**
 * 抽象类的实际应用: 模板设计模式
 */
package designPattern;

abstract class Action { // 描述的是一个抽象的行为

	public static final int EAT = 1;
	public static final int SLEEP = 5;
	public static final int WORK = 10;

	public void command(int cmd) {
		switch (cmd) {
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case WORK:
			this.work();
			break;
		case EAT + SLEEP + WORK:
			this.eat();
			this.sleep();
			this.work();
			break;
		}
	}

	// 不确定具体的实现，但是行为应该定义好
	public abstract void eat();

	public abstract void sleep();

	public abstract void work();

}

class Person extends Action {

	public void eat() {
		System.out.println("人吃干净的熟食");
	};

	public void sleep() {
		System.out.println("人在床上睡觉");
	};

	public void work() {
		System.out.println("人要努力工作");
	};

}

class Pig extends Action {

	public void eat() {
		System.out.println("^(*￣(oo)￣)^ 吃泔水");
	};

	public void sleep() {
		System.out.println("^(*￣(oo)￣)^ 吃饱了就睡");
	};

	public void work() {

	};

}

class Robot extends Action {

	public void eat() {
		System.out.println("机器人补充能量");
	};

	public void sleep() {

	};

	public void work() {
		System.out.println("机器人不停的工作");
	};

}

public class TemplatePattern {

	public static void main(String[] args) {
		fun(new Person());
		fun(new Pig());
		fun(new Robot());
	}

	public static void fun(Action action) {
		action.command(Action.EAT + Action.SLEEP + Action.WORK);
	}

}