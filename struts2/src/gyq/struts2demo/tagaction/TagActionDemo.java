package gyq.struts2demo.tagaction;

import gyq.struts2demo.service.TagService;
import gyq.struts2demo.tagbean.CityBean;
import gyq.struts2demo.tagbean.HobbyBean;
import gyq.struts2demo.tagbean.UserBean;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class TagActionDemo	extends ActionSupport implements Preparable {
	private TagService tagservice = new TagService();
	private List<HobbyBean> lstHobbyBean;
	private List<CityBean> lstCityBean;
	private	UserBean userBean;
	/*action 方法*/
	public String getForm(){
		userBean = new UserBean();
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("lstSexBean", tagservice.getSex());
		return SUCCESS;
	}
	public String dosubmit(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("selectedcity", tagservice.getSelectedCity(userBean.getCity()));//在此处加断点，观察不到userBean的行踪，说明struts2框架啊在执行方法之前不会赋值
		request.setAttribute("selectedhobbies", tagservice.getCheckedHobbies(userBean.getHobby()));
		return SUCCESS;
	}

	public List<HobbyBean> getLstHobbyBean() {
		return tagservice.getHobbis();
	}
	public void setLstHobbyBean(List<HobbyBean> lstHobbyBean) {
		this.lstHobbyBean = lstHobbyBean;
	}
	public List<CityBean> getLstCityBean() {
		return tagservice.getAllCity();
	}
	public void setLstCityBean(List<CityBean> lstCityBean) {
		this.lstCityBean = lstCityBean;
	}
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	@Override
	public void prepare() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("lstSexBean", tagservice.getSex());
		
	}
	
}
