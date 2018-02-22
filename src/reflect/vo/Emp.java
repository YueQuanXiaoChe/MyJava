/**
 * 雇员VO类
 */
package reflect.vo;

import java.util.Date;

public class Emp {
	private String ename;
	private String job;
	private Double salary;
	private Date hiredate;
	private Dept dept;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", job=" + job + ", salary=" + salary + ", hiredate=" + hiredate + "] " + this.dept;
	}
	
}
