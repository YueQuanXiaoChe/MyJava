/**
 * 简单Java类
 */
package reflect.vo;

public class Emp {
	private String ename;
	private String job;
	
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
		return "Emp [ename=" + ename + ", job=" + job + "]";
	}
}
