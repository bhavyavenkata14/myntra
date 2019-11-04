package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic_properties {
	
	long val;
	public  static String  property_file(String path,String key_data) throws FileNotFoundException, IOException
	{
		
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		
		String data = p.getProperty(key_data);
		System.out.println(data);
		
		
		String s=data;
      long val= Long.parseLong(s);
        System.out.println(val);
        
   
		
		return data;
		
	}

}
