package gyq.struts2demo.tagbean;

public class SexBean {
	private int sex;
	private String sexValue;
	public SexBean(int sex, String sexValue) {
		super();
		this.sex = sex;
		this.sexValue = sexValue;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getSexValue() {
		return sexValue;
	}
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	
}
