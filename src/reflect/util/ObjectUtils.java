/**
 * 单级VO设置实现: 本类的主要功能是根据属性名称调用相应类中的getter、setter方法
 */
package reflect.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectUtils {
	private ObjectUtils() {}
	
	/**
	 * 根据指定的类对象设置指定类中的属性，调用setter方法
	 * @param warpObject 属性所在类的实例化对象
	 * @param attribute 属性名称
	 * @param value 属性内容
	 * @throws Exception 
	 */
	public static void setObjectValue(Object warpObject, String attribute, String value) throws Exception {
		Field field = warpObject.getClass().getDeclaredField(attribute); // 判断属性是否存在
		if(field == null) { // 给你第二次取得的机会，万一某些属性是通过父类取得的
			field = warpObject.getClass().getField(attribute);
		}
		if(field == null) { // 两次操作都无法取得对应的成员对象
			return; // 该属性一定不存在
		}
		String methodName = "set" + StringUtils.initcap(attribute);
		Method method = warpObject.getClass().getMethod(methodName, field.getType());
		method.invoke(warpObject, value);
	}
	
	/**
	 * 负责调用指定类中的getter方法
	 * @param warpObject 要调用的方法所在类对象
	 * @param attribute 属性名称
	 * @return 调用对象的结果
	 * @throws Exception 
	 */
	public static Object getObject(Object warpObject, String attribute) throws Exception {
		String methodName = "get" + StringUtils.initcap(attribute); // 定义getter的方法名称
		// 调用指定属性的Field对象，目的是取得对象类型，如果没有此属性也就意味着该操作无法继续了
		Field field = warpObject.getClass().getDeclaredField(attribute);
		if(field == null) { // 给你第二次取得的机会，万一某些属性是通过父类取得的
			field = warpObject.getClass().getField(attribute);
		}
		if(field == null) { // 两次操作都无法取得对应的成员对象
			return null; // 该属性一定不存在
		}
		Method method = warpObject.getClass().getMethod(methodName);
		return method.invoke(warpObject);
	}
}
