/**
 * 动态代理设计模式（基于接口）
 */
package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

interface ISubject { // 代理设计的核心在于需要有一个核心的操作接口
	public void eat(String msg, int num);
}

class RealSubject implements ISubject {

	@Override
	public void eat(String msg, int num) {
		System.out.println("我要吃" + num + "份量的：" + msg);
	}
	
}

class ProxySubject implements InvocationHandler { // 是一个动态代理类
    private Object target; // 绑定任意的接口的对象，使用Object描述
    
    /**
     * 实现真实对象的绑定处理，同时返回代理对象
     * @param target
     * @return 返回一个代理对象（这个对象是根据接口定义动态创建的代理对象）
     */
    public Object bind(Object target) {
    	this.target = target; // 保存真实主题对象
    	return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    public void prepare() {
    	System.out.println("[ProxySubject] 准备食材");
    }
    
    public void clear() {
    	System.out.println("[ProxySubject] 收拾碗筷");
    }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println(proxy.getClass());
//		System.out.println(method);
//		System.out.println(Arrays.toString(args));
		this.prepare();
		Object ret = method.invoke(this.target, args); // 反射调用方法
		this.clear();
		return ret;
	}
	
}

public class ReflectInterfaceProxy {

	public static void main(String[] args) {
		ISubject subject = (ISubject) new ProxySubject().bind(new RealSubject());
		subject.eat("蛋糕", 2);
	}

}
