package BaseLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/register");
	  
	 WebElement wb= driver.findElement(By.name("birthday_month"));
	            wb.click();
	            
	            Select sel=new Select(wb);
	            List<WebElement>list=sel.getOptions();	
	                     int a=list.size();
	                     System.out.println(a);
	                     
//	                     for(WebElement abc: list) {
//	                    	 String b=abc.getText();
//	                    	 System.out.println(b);
//	                     }
	                     for(int i=0;i<list.size();i++) {
	                    	 WebElement ab=list.get(i);
	                    	            String c=ab.getText();
	                    	          System.out.println(c);
	                     }
}
}
