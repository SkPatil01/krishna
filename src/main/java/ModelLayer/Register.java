package ModelLayer;

public class Register {
  private String firstName;
  private String lastName;
  private String phone;
  private String email;
  private String address1;
  private String city;
  private String state;
  private String postalCode;
  private String userName;
  private String password;
  private String confirmPassword;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
@Override
  public String toString() {
	return "firstName="+firstName+
			"lastName="+lastName+
			"phone="+phone+
			"email="+email+
			"address1="+address1+
            "city="+city+
            "state="+state+
            "postalCode="+postalCode+
	        "userName="+userName+
	        "password="+password+
	        "confirmPassword="+confirmPassword;
	        
	  
  }
}
