package gyq.struts2demo.service;

import gyq.struts2demo.tagbean.CityBean;
import gyq.struts2demo.tagbean.HobbyBean;
import gyq.struts2demo.tagbean.SexBean;

import java.util.ArrayList;
import java.util.List;



public class TagService {
	public List<CityBean> getAllCity(){
			CityBean city1 = new CityBean(1, "tokyo");
			CityBean city2 = new CityBean(2, "beijing");
			CityBean city3 = new CityBean(3,"shanghai");
			CityBean city4 = new CityBean(4,"guangzhou");
			List<CityBean> cityList = new ArrayList<CityBean>();
			cityList.add(city4);
			cityList.add(city3);
			cityList.add(city2);
			cityList.add(city1);
			
			return cityList;
			
	}
	public List<HobbyBean> getHobbis(){
		List<HobbyBean> lstHobby = new ArrayList<HobbyBean>();
		lstHobby.add(new HobbyBean(1, "唱歌"));
		lstHobby.add(new HobbyBean(2, "跳舞"));
		lstHobby.add(new HobbyBean(3, "运动"));
		lstHobby.add(new HobbyBean(4, "旅游"));
		lstHobby.add(new HobbyBean(5, "宅神"));
		return lstHobby;
	}
	
	public List<SexBean> getSex(){
		SexBean sexbean = new SexBean(0, "male");
		SexBean sexbean2 = new SexBean(1,"female");
		List<SexBean> sexlist = new ArrayList<SexBean>();
		sexlist.add(sexbean2);
		sexlist.add(sexbean);
		return sexlist;
	}
	
	public List<HobbyBean> getCheckedHobbies(int hobbies[]){
		if(hobbies==null||hobbies.length<1){
			return null;
		}
		
		/*循环遍历取出所有的值*/
		List<HobbyBean> lstHobby = new ArrayList<HobbyBean>();
		for(int i:hobbies){
			for(HobbyBean hobbyBean : getHobbis()){
				if(i == hobbyBean.getHobby()){
					lstHobby.add(hobbyBean);
					break;
				}
			}
		}
		return lstHobby;
	}
	public CityBean getSelectedCity(int city){
		for (CityBean citybean : getAllCity()){
			if(city == citybean.getCity()){
				return citybean;
			}
		}
		return null;
	}
}
