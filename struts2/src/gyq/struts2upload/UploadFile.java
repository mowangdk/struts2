package gyq.struts2upload;

import java.io.File;

public class UploadFile {
	private String[] uploadimageFileName;
	private File[] uploadimage;
	private String[] uploadimageContentType;
	
	public String[] getUploadimageFileName() {
		return uploadimageFileName;
	}
	public void setUploadimageFileName(String[] uploadimageFileName) {
		this.uploadimageFileName = uploadimageFileName;
	}
	public File[] getUploadimage() {
		return uploadimage;
	}
	public void setUploadimage(File[] uploadimage) {
		this.uploadimage = uploadimage;
	}
	public String[] getUploadimageContentType() {
		return uploadimageContentType;
	}
	public void setUploadimageContentType(String[] uploadimageContentType) {
		this.uploadimageContentType = uploadimageContentType;
	}

}
