package gyq.struts2demo.tagbean;

public class HobbyBean {
	private int hobby;
	private String hobbyValue;
	public HobbyBean(int hobby, String hobbyValue) {
		super();
		this.hobby = hobby;
		this.hobbyValue = hobbyValue;
	}
	public int getHobby() {
		return hobby;
	}
	public void setHobby(int hobby) {
		this.hobby = hobby;
	}
	public String getHobbyValue() {
		return hobbyValue;
	}
	public void setHobbyValue(String hobbyValue) {
		this.hobbyValue = hobbyValue;
	}
	
	
}
