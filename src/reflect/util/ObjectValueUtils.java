/**
 * 本类的功能是将字符串的内容根据属性对应的类型变为各种数据类型
 * 支持的类型：int(Tnteger)、double(Double)、long(Long)、String、Date
 * 其中Date必须考虑同时支持日期时间(yyyy-MM-dd HH:mm:ss)、日期(yyyy-MM-dd)
 */
package reflect.util;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ObjectValueUtils {
	private ObjectValueUtils() {}
	
	/**
	 * 负责将传入的字符串变为与指定属性类型相符合的数据类型
	 * @param wrapObject 要操作的对象
	 * @param attribute 属性类型
	 * @param value 传入的数据（都是字符串）
	 * @return 根据属性类型进行转型处理
	 * @throws Exception 
	 */
	public static Object getValue(Object wrapObject, String attribute, String value) throws Exception {
		Field field = ObjectUtils.getObjectField(wrapObject, attribute);
		if(field == null) {
			return null;
		}
		return stringToType(field.getType().getSimpleName(), value);
	}
	
	/**
	 * 根据指定的类型将字符串进行转型处理
	 * @param type 数据类型
	 * @param value 数据内容
	 * @return 转换为具体类型
	 */
	public static Object stringToType(String type, String value) {
		if("String".equals(type)) { // 字符串
			if(isNotEmpty(value)) {
				return value;
			}
		}else if("int".equals(type) || "Integer".equals(type)) { // 整形
			if(isInt(value)) {
				return Integer.parseInt(value);
			}
		}else if("long".equals(type) || "Long".equals(type)) {
			if(isInt(value)) {
				return Long.parseLong(value);
			}
		}else if("double".equals(type) || "Double".equals(type)) {
			if(isDouble(value)) {
				return Double.parseDouble(value);
			}
		}else if("Date".equals(type)) {
			String pattern = null;
			if(isDate(value)) {
				pattern = "yyyy-MM-dd";
			}else if(isDateTime(value)) {
				pattern = "yyyy-MM-dd HH:mm:ss";
			}
			if(pattern != null) {
				try {
					return new SimpleDateFormat(pattern).parse(value);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	/**
	 * 判断字符串是否不是空字符串后才可以进行处理
	 * @param str 要判断的字符串
	 * @return 如果字符串为空，那么返回false，否则返回true
	 */
	private static boolean isNotEmpty(String str) {
		return !(str == null || str.isEmpty() || "".equals(str));
	}
	
	/**
	 * 判断给定的字符串是否是一个整数
	 * @param str 给定字符串
	 * @return 如果字符串是由整数所组成，那么返回true，否则返回false
	 */
	private static boolean isInt(String str) {
		if(isNotEmpty(str)) { // 必须保证传入的字符串有内容
			return str.matches("\\d+");
		}
		return false;
	}
	
	/**
	 * 判断给定的字符串是否是小数
	 * @param str 给定字符串
	 * @return 如果字符串是由小数所组成，那么返回true，否则返回false
	 */
	private static boolean isDouble(String str) {
		if(isNotEmpty(str)) {
			return str.matches("\\d+(\\.\\d+)");
		}
		return false;
	}
	
	/**
	 * 判断给定的字符串是否是日期类型(yyyy-MM-dd)
	 * @param str 给定字符串
	 * @return 如果字符串是日期格式，那么返回true，否则返回false
	 */
	private static boolean isDate(String str) {
		if(isNotEmpty(str)) {
			return str.matches("\\d{4}-\\d{2}-\\d{2}");
		}
		return false;
	}
	
	/**
	 * 判断给定的字符串是否是日期时间类型(yyyy-MM-dd HH:mm:ss)
	 * @param str 给定字符串
	 * @return 如果字符串是日期时间格式，那么返回true，否则返回false
	 */
	private static boolean isDateTime(String str) {
		if(isNotEmpty(str)) {
			return str.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
		}
		return false;
	}
}
