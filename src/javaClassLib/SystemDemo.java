/**
 * System类
 */
package javaClassLib;

class TestPerson {
	public TestPerson() {
		System.out.println("生成TestPerson实例对象");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("TestPerson实例对象被销毁了");
		throw new Exception("See you again!");
	}
}

public class SystemDemo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		for (int x = 0; x < 3000; x++) {
			str += x;
		}
		long end = System.currentTimeMillis();
		System.out.println("花费时间: " + (end - start));
		
		TestPerson per = new TestPerson();
		per = null;
		System.gc(); // 强制释放内存
		System.out.println("程序继续执行");
	}

}
