package BaseLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/register");
		  
		    List<WebElement>list=driver.findElements(By.tagName("a"));
		                   int a=list.size();
		                   System.out.println(a);
		                   
//		                   for(WebElement abc: list) {
//		                	   String b=abc.getText();
//		                	   System.out.println(b);
//		                   }
		                   
		                   for(int i=0;i<list.size();i++) {
		                	 WebElement wb= list.get(i);
		                	     String c=wb.getText();
		                	      System.out.println();
		                   }
	}

}
