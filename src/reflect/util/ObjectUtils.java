/**
 * 单级、多级VO设置实现: 本类的主要功能是根据属性名称调用相应类中的getter、setter方法
 */
package reflect.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectUtils {
	private ObjectUtils() {}
	
	/**
	 * 根据对象和指定的属性名称取得Field对象信息
	 * @param wrapObject 当前操作对象
	 * @param attribute 属性
	 * @return 属性的对象，如果该属性不存在返回null
	 */
	public static Field getObjectField(Object wrapObject, String attribute) throws Exception {
		Field field = wrapObject.getClass().getDeclaredField(attribute); // 判断属性是否存在
		if(field == null) { // 给你第二次取得的机会，万一某些属性是通过父类取得的
			field = wrapObject.getClass().getField(attribute);
		}
		return field;
	}
	
	/**
	 * 根据指定的类对象设置指定类中的属性，调用setter方法
	 * @param warpObject 属性所在类的实例化对象
	 * @param attribute 属性名称
	 * @param value 属性内容
	 * @throws Exception 
	 */
	public static void setObjectValue(Object wrapObject, String attribute, Object value) throws Exception {
		Field field = getObjectField(wrapObject, attribute);
		if(field == null) { // 两次操作都无法取得对应的成员对象
			return; // 该属性一定不存在
		}
		String methodName = "set" + StringUtils.initcap(attribute);
		Method method = wrapObject.getClass().getMethod(methodName, field.getType());
		method.invoke(wrapObject, value);
	}
	
	/**
	 * 负责调用指定类中的getter方法
	 * @param warpObject 要调用的方法所在类对象
	 * @param attribute 属性名称
	 * @return 调用对象的结果
	 * @throws Exception 
	 */
	public static Object getObject(Object wrapObject, String attribute) throws Exception {
		String methodName = "get" + StringUtils.initcap(attribute); // 定义getter的方法名称
		// 调用指定属性的Field对象，目的是取得对象类型，如果没有此属性也就意味着该操作无法继续了
		Field field = getObjectField(wrapObject, attribute);
		if(field == null) { // 两次操作都无法取得对应的成员对象
			return null; // 该属性一定不存在
		}
		Method method = wrapObject.getClass().getMethod(methodName);
		return method.invoke(wrapObject);
	}
}
