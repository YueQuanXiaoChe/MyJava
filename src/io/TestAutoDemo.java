/**
 * AutoCloseable自动关闭支持(不建议使用，容易造成代码混乱)
 */
package io;

class Message implements AutoCloseable {

	public Message() {
		System.out.println("创建一条新的消息!");
	}
	
	public void print() {
		System.out.println("Hello world!");
	}
	
	@Override
	public void close() throws Exception {  // 关闭的处理操作
		System.out.println("[AutoCloseable] 进行关闭方法的处理!");
	}
	
}

public class TestAutoDemo {

	public static void main(String[] args) throws Exception {
		try(Message msg = new Message()) {  // 必须在try语句里面定义对象
			msg.print();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
