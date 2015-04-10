package gyq.struts2upload;


public class FileUploadService {
	FileDao filedao = new FileDao();
	FileEntity uploadfile = new FileEntity();
	public void putEntity(String filename,String filetype,String savepath){
		uploadfile.setFilename(filename);
		uploadfile.setFiletype(filetype);
		uploadfile.setSavepath(savepath);
		filedao.save(uploadfile);
	}
	public void close(){
		filedao.sessionfactoryclose();
	}
	
}
