package gyq.struts2demo.tagbean;

public class CityBean {
	private int city;
	private String cityValue;
	public CityBean(int city, String cityValue) {
		super();
		this.city = city;
		this.cityValue = cityValue;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getCityValue() {
		return cityValue;
	}
	public void setCityValue(String cityValue) {
		this.cityValue = cityValue;
	}
	
	
}
