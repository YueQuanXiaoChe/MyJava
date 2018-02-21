/**
 * 多级VO设置实现
 */
package reflect;

import reflect.action.EmpAction;

public class TestEmpDemo {

	public static void main(String[] args) {
		String value = "emp.ename:月泉晓澈|emp.job:Java开发|emp.dept.dname:技术部|emp.dept.company.name:Alibaba|emp.dept.company.address:杭州";
		EmpAction action = new EmpAction();
		action.setValue(value);
		System.out.println(action.getEmp());
	}

}
