package Review02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class Test1 {
public static void main(String[] args) {
	//Constants c=new Constants();//we have to create the object
	
	//the firs step is that i want to read a file
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	String browser=ConfigsReader.getProperty("browser");
	System.out.println("browser ->" +browser);
System.out.println("url->"+ ConfigsReader.getProperty("url"));
}
}