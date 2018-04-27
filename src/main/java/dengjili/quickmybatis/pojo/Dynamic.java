package dengjili.quickmybatis.pojo;

import java.util.Date;

public class Dynamic {
	
	private int id;
	private String name;
	private float price;
	private Date birth;
	private String desc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Dynamic [id=" + id + ", name=" + name + ", price=" + price + ", birth=" + birth + ", desc=" + desc + "]";
	}

}
