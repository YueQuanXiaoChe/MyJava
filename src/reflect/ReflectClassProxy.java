/**
 * 用cglib库实现基于类的动态代理设计模式（了解即可，没什么卵用）
 */
package reflect;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class Message { // 直接做此类的代理
	public void send() {
		System.out.println("Hello world");
	}
}

class MyProxy implements MethodInterceptor { // 定义一个拦截器

	private Object target; //代理的真实主题对象
	
	public MyProxy(Object target) { // 直接通过构造方法传递进来
		this.target = target;
	}
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy mProxy) throws Throwable {
		this.prepare();
		Object ret = method.invoke(this.target, args);
		this.over();
		return ret;
	}
	
	public void prepare() {
    	System.out.println("[MyProxy] 打开电脑");
    }
    
    public void over() {
    	System.out.println("[MyProxy] 关闭电源");
    }
}

public class ReflectClassProxy {

	public static void main(String[] args) {
		Message msg = new Message();
		Enhancer enhancer = new Enhancer(); // 这是一个负责代理关系的操作程序类
		enhancer.setSuperclass(msg.getClass()); // 把本类的类型作为描述
		enhancer.setCallback(new MyProxy(msg)); // 代理对象
		// 以上就动态配置好了类之间的代理关系
		Message temp = (Message) enhancer.create();
		temp.send();
	}

}
