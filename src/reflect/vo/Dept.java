/**
 * 简单Java类
 */
package reflect.vo;

public class Dept {
	private String dname;
	private String loc;
	
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
		return "Dept [dname=" + dname + ", loc=" + loc + "]";
	}
}
