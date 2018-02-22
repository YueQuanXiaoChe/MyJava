/**
 * 公司VO类
 */
package reflect.vo;

import java.util.Date;

public class Company {
	private Integer cid;
	private String name;
	private String address;
	private Date create;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", address=" + address + ", create=" + create + "]";
	}
	
}
