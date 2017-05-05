
public class Contact 
{
	private String firstName = "";
	private String secondName = "";
	private String contactNumber= "";
	private String contactDescription = "";
	private String contactEmail;

public Contact(String firstName, String secondName, String contactNumber, String contactDescription, String contactEmail)
{
	this.firstName = firstName;
	this.secondName = secondName;
	this.contactNumber = contactNumber;
	this.contactDescription = contactDescription;
	this.contactEmail = contactEmail;
}

public Contact()
{
	
}
public String getfirstName()
{
	return firstName;
}
public void setfirstName (String firstName)
{
	this.firstName = firstName;
}

public String getsecondName()
{
	return secondName;

}

public void setsecondName (String secondName)
{
	this.secondName = secondName;
}
public String getcontactNumber()
{
	return contactNumber;

}

public void setcontactNumber (String contactNumber)
{
	this.contactNumber = contactNumber;
	
}
public String getcontactDescription()
{
	return contactDescription;

}

public void setcontactDescription (String contactDescription)
{
	this.contactDescription = contactDescription;
}
public String getcontactEmail()
{
	return contactEmail;
}
public void setcontactEmail (String contactEmail)
{
	this.contactEmail = contactEmail;
}
}
