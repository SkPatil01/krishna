package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import ModelLayer.Register;

public class RegisterPage extends BaseClass {
  private WebDriver driver;
  
  @FindBy(name="firstName")
  protected WebElement firstname;
  
  @FindBy(name="lastName")
  protected WebElement lastname;
  
  @FindBy(name="phone")
  protected WebElement phone; 
  
  @FindBy(name="userName")
  protected WebElement userName;
  
  @FindBy(name="address1")
  protected WebElement address1;
  
  @FindBy(name="city")
  protected WebElement city;
  
  @FindBy(name="state")
  protected WebElement state;
  
  @FindBy(name="postalCode")
  protected WebElement postalCode;
  
  @FindBy(name="email")
  protected WebElement email;
  
  @FindBy(name="password")
  protected WebElement password;
  
  @FindBy(name="confirmPassword")
  protected WebElement confirmPassword;
  
  @FindBy(xpath="//input[@name='submit']")
  protected WebElement submit;
  
  public RegisterPage() {
	  PageFactory.initElements(driver, this);
  }
 
  public void register (Register reg) {
	 firstname.sendKeys(reg.getFirstName());
	 lastname.sendKeys(reg.getLastName());
	 phone.sendKeys(reg.getPhone());
	 email.sendKeys(reg.getEmail());
	 address1.sendKeys(reg.getAddress1());
	 city.sendKeys(reg.getCity());
	 state.sendKeys(reg.getState());
	 password.sendKeys(reg.getPassword());
	 postalCode.sendKeys(reg.getPostalCode());
	 confirmPassword.sendKeys(reg.getConfirmPassword());
	 submit.click();
	 
	 
	 
	 
  }
  
  
}
