/**
 * 单级、多级VO设置实现: 本类主要负责实现自动的VO匹配处理操作，本身不需要通过实例化对象完成，所以构造方法私有化
 */
package reflect.util;

public class BeanOperation {

	private BeanOperation() {
	}

	/**
	 * 负责设置类中的属性操作
	 * 
	 * @param actionObject 表示当前发出设置请求的程序类的当前对象
	 * @param msg 所有属性的具体内容，格式“属性名称:内容|属性名称:内容”
	 * @throws Exception
	 */
	public static void setBeanValue(Object actionObject, String msg) throws Exception {
		// 如果要想进行内容的设置，那么必须要求将字符串拆分（此处不关心验证）
		String[] result = msg.split("\\|"); // 按照竖线拆分，取出所有要设置的内容
		for (String str : result) { // 此时每次执行的格式只剩下“属性名称:内容”
			String[] temp = str.split(":", 2); // 需要针对给定的属性名称和内容进行一次拆分
			String attribute = temp[0]; // 属性名称，包括了“XxxAction的属性和简单Java类的属性”
			
			
//			String value = temp[1]; // 接受具体的属性内容
			
			
			// 通过拆分属性的信息就可以判断出是单级还是多级
			String[] fields = attribute.split("\\.");
			if (fields.length > 2) { // 多级VO
				Object currObj = actionObject; // 确定当前要操作属性的对象
				for (int y = 0; y < fields.length - 1; y++) { // 对应的getter的返回对象
					currObj = ObjectUtils.getObject(currObj, fields[y]);
				}
				Object value = ObjectValueUtils.getValue(currObj, fields[fields.length - 1], temp[1]);
				ObjectUtils.setObjectValue(currObj, fields[fields.length - 1], value);
			} else { // 单级VO
				Object currObject = ObjectUtils.getObject(actionObject, fields[0]);
				Object value = ObjectValueUtils.getValue(currObject, fields[1], temp[1]);
				ObjectUtils.setObjectValue(currObject, fields[1], value);
			}
		}
	}
}
