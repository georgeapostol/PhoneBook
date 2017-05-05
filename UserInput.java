import java.util.Scanner;


public class UserInput
{
	private ContactList contactList;
	private Contact contact;
	Scanner scan = new Scanner(System.in);

	public UserInput()
	{
		contactList = new ContactList();
		contact = new Contact();
		

		getInput();
	

	}
	
	private void getInput()
	{
		
		System.out.println("1. Add Contact");
		System.out.println("2. List all Contacts");
		System.out.println("3. Find Contact");
		System.out.println("4. Exit");
		
		int input = scan.nextInt();
		
		switch(input)
		{
		case 1:
			addContact();
			break;
		case 2:
			printContacts();
			break;
		case 3:
			searchContact();
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println(input + " not a valid option.");
			getInput();
			break;
		}
	}
	private void addContact()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter first name: ");
		String firstName = scan.nextLine();
		
		System.out.println("Enter last name: ");
		String secondName = scan.nextLine();
		
		System.out.println("Enter contact number: ");
		String contactNumber = scan.nextLine();
		
		System.out.println("Enter contact description: ");
		String contactDescription = scan.nextLine();
		
		System.out.println("Enter contact email: ");
		String contactEmail = scan.nextLine();
		
		
		contact = new Contact(firstName, secondName, contactNumber, contactDescription, contactEmail);
		contactList.addContact(contact);
		System.out.println();
		getInput();
			
	}
	public void printContacts()
	{
		for (int index = 0; index < contactList.contactAmount(); index++)
		{ 
			Contact contact = contactList.getContact(index);
			
			System.out.println(contact.getfirstName());
			System.out.println(contact.getsecondName());
			System.out.println(contact.getcontactNumber());
			System.out.println(contact.getcontactDescription());
			System.out.println(contact.getcontactEmail());
			System.out.println();
		}
		getInput();
	}
	
	public void searchContact()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Search for the contact desired: ");
		String name = scan.nextLine().trim();
		
		for (int index = 0; index < contactList.contactAmount(); index++)
		{
			Contact contact = contactList.getContact(index);
			
			if (contact.getfirstName().equals(name))
			{
				System.out.println("Contact located");
				System.out.println();
				
				System.out.println("First name: " + contact.getfirstName());
				System.out.println("Second name: " + contact.getsecondName());
				System.out.println("Number : " + contact.getcontactNumber());
				System.out.println("Description: " + contact.getcontactDescription());
				System.out.println("Description: " + contact.getcontactEmail());
				break;
			}
			System.out.println("Couldn't find the contact"); 
			System.out.println();
			getInput();
		}
	}
}
