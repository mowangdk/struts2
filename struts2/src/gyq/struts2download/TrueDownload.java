package gyq.struts2download;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TrueDownload extends ActionSupport {
	private String name;
	private String type;
	private final static String Downloadfile = "/upload/";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//从下载文件原始存放路径读取得到文件输出流
	public InputStream getDownloadFile(){
		return  ServletActionContext.getServletContext().getResourceAsStream(Downloadfile+name);
	}
	//如果下载文件名为中文，进行字符编码转换
	public String getDownloadChineseFileName(){
		String downloadChineseFilename = name;
		try {
			downloadChineseFilename = new String(downloadChineseFilename.getBytes(),"ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return downloadChineseFilename;
	}
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	
}
