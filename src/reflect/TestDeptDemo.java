/**
 * 单级自动VO设置实现
 */
package reflect;

import reflect.action.DeptAction;

public class TestDeptDemo {

	public static void main(String[] args) {
		String value = "dept.dname:Java|dept.loc:高级语言";
		DeptAction action = new DeptAction();
		action.setValue(value);
		System.out.println(action.getDept());
	}

}
