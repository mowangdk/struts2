package gyq.struts2upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
		FileUploadService fileuploadservice = new FileUploadService();
		private UploadFile uploadFile;
		private static String path="/upload";

		public UploadFile getUploadFile() {
			return uploadFile;
		}




		public void setUploadFile(UploadFile uploadFile) {
			this.uploadFile = uploadFile;
		}




		@Override
		public String execute() throws Exception {
				String realpath = ServletActionContext.getServletContext().getRealPath(path);
				
				
				if(uploadFile.getUploadimage()!= null){
					File savedir = new File(realpath);
					if(!savedir.exists())
						savedir.mkdirs();
					for(int i=0;i<uploadFile.getUploadimage().length;i++){
						File savefile = new File(savedir,uploadFile.getUploadimageFileName()[i]);
						fileuploadservice.putEntity(uploadFile.getUploadimageFileName()[i],uploadFile.getUploadimageContentType()[i],savefile.getAbsolutePath());
						FileUtils.copyFile(uploadFile.getUploadimage()[i], savefile);
					}
				
					fileuploadservice.close();
					
				}
				return SUCCESS;
		}

}
