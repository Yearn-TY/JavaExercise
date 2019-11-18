
public class PersonalInfoDemo {
	public static void main(String[] args) {
		PersonalInformation myInfo = new PersonalInformation();
		PersonalInformation myFriend1 = new PersonalInformation();
	    PersonalInformation myFriend2 = new PersonalInformation();
	      
		// Set my info.
	    myInfo.setName("Joe Mahoney");
	    myInfo.setAge(27);
	    myInfo.setAddress("724 22nd Street");
	    myInfo.setPhone("(555)555-1234");
		
	    // Set friend #1's info.
	    myFriend1.setName("Geri Rose");
	    myFriend1.setAge(24);
	    myFriend1.setAddress("149 East Bay Street");
	    myFriend1.setPhone("(555)555-5678");
	    
	    //set friend #2's info
	    myFriend2.setName("John Carbonni");
	    myFriend2.setAge(28);
	    myFriend2.setAddress("22 King Street");
	    myFriend2.setPhone("(555)555-0123");
	    
	    System.out.println("My information:");
	    System.out.println("Name: "+myInfo.getName());
	    System.out.println("Age: "+myInfo.getAge());
	    System.out.println("Address: "+myInfo.getAddress());
	    System.out.println("Phone: "+myInfo.getPhone());
	    
	    System.out.println("\nFriend #1's information:");
	    System.out.println("Name: "+myFriend1.getName());
	    System.out.println("Age: "+myFriend1.getAge());
	    System.out.println("Address: "+myFriend1.getAddress());
	    System.out.println("Phone: "+myFriend1.getPhone());
	    
	    System.out.println("\nFriend #2's information:");
	    System.out.println("Name: "+myFriend2.getName());
	    System.out.println("Age: "+myFriend2.getAge());
	    System.out.println("Address: "+myFriend2.getAddress());
	    System.out.println("Phone: "+myFriend2.getPhone());
	    
	}
}
