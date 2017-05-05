import java.util.List;
import java.util.ArrayList;
public class ContactList 
{
	// allows for more generic list changes
	List<Contact> contacts;

	
	public ContactList()
	{
		contacts = new ArrayList<>();
		ContactList contactList;
	}
	
	
	public int addContact (Contact contact)
	{
		
		contacts.add(contact);
		return contacts.size();
//		contact.setfirstName("George");
//		contact.setsecondName("Apostolopoulos");
//		contact.setcontactNumber("8163825");
//		contact.setcontactDescription("Me");
		
	}
	// returns contact size i.e 9 contacts
	public int contactAmount()
	{
		return contacts.size();
	}
	
	//check contact amount
	public Contact getContact(int index)
	{
		if (index < 0 || index>= contactAmount())
		{
			System.out.println("Contact not found");
			return null;
			
		}
		return contacts.get(index);
	}

}
