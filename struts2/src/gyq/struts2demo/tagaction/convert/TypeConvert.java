package gyq.struts2demo.tagaction.convert;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class TypeConvert extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map<String, Object> context, Object value,
			Class toType) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try{
			if(toType == Date.class){//当字符串向date类型转换时
				String[] params = (String[]) value;//request.getParameterValues
				System.out.println(dateformat.parseObject(params[0]));
				return  dateformat.parseObject(params[0]);
			}else if( toType == String.class){
				//当date转化为字符的时候
				Date date = (Date) value;
				return dateformat.format(date);
				
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
		return null;
	}
	
}