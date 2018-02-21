/**
 * 单级自动VO设置实现
 */
package reflect;

import reflect.action.EmpAction;

public class TestEmpDemo {

	public static void main(String[] args) {
		String value = "emp.ename:月泉晓澈|emp.job:程序猿";
		EmpAction action = new EmpAction();
		action.setValue(value);
		System.out.println(action.getEmp());
	}

}
