/**
 * 行为类
 */
package reflect.action;

import reflect.util.BeanOperation;
import reflect.vo.Dept;

public class DeptAction {
private Dept dept = new Dept();
	
	public void setValue(String val) { // 设置属性内容
		// 之所以要传递一个this，主要是将EmpAction的类对象传递到方法里面
		// 因为给定的标记：emp.ename:smith，而emp应该对应的事getEmp()方法
		try {
			BeanOperation.setBeanValue(this, val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Dept getDept() {
		return dept;
	}
}
