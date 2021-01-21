package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_PropertyFile {
	
@Test
public static String read_Data(String path,String key) throws FileNotFoundException, IOException
{
Properties P=new Properties();
P.load(new FileInputStream(path));
String value=P.getProperty(key);
return(value);

}

}
