package gyq.struts2demo.tagbean;


import java.util.Date;

public class UserBean {
	private int userId;
	private String userName;
	private String password;
	private Date birthday = new Date();
	private int sex;
	private int city;
	private int[] hobby;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		System.out.println(birthday);
		this.birthday = birthday;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int[] getHobby() {
		return hobby;
	}
	public void setHobby(int[] hobby) {
		this.hobby = hobby;
	}
	
}
