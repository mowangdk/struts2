package gyq.struts2download;

import gyq.struts2upload.FileEntity;

import java.util.List;

public class DownloadService {
	DownloadDao download = new DownloadDao();
	public List<FileEntity> getList(){
		return download.getdownloadfiel();
		
	}
	public void close(){
		download.close();
	}
}
