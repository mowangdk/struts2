package gyq.struts2download;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	DownloadService  downloadservice = new DownloadService();
		@Override
		public String execute() throws Exception {
			ActionContext ac = ActionContext.getContext();
			ac.put("filelist", downloadservice.getList());
			downloadservice.close();
			return SUCCESS;
		}
}
