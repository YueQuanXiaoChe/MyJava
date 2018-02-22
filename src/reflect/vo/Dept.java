/**
 * 部门VO类
 */
package reflect.vo;

public class Dept {
	private String dname;
	private String loc;
	private Long count; // 总员工数
	private Company company = new Company();
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [dname=" + dname + ", loc=" + loc + ", count=" + count + "] " 
	            + this.company;
	}
	
}
