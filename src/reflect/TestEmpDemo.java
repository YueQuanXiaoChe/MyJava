/**
 * 多级VO设置实现
 */
package reflect;

import reflect.action.EmpAction;

public class TestEmpDemo {

	public static void main(String[] args) {
		String value = "emp.ename:月泉晓澈|emp.job:Java开发|emp.salary:1999.12|emp.hiredate:1999-10-10|" + 
	                   "emp.dept.dname:技术部|emp.dept.count:564891568|" + 
				       "emp.dept.company.name:Alibaba|emp.dept.company.address:杭州|" + 
	                   "emp.dept.company.cid:10|emp.dept.company.create:1990-09-05 11:01:02";
		EmpAction action = new EmpAction();
		action.setValue(value);
		System.out.println(action.getEmp());
	}

}
