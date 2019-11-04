package generic_libraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot_generic {

	public static void Generic_screenshot(WebDriver driver) throws IOException
	{
		String photos="./photos/";
		Date d=new Date();
		String d1 = d.toString();
		
		String date = d1.replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photos+date+".jpeg");
		FileUtils.copyFile(src, dst);
		
	}
}
