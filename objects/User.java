package objects;

public class User {
	
	private String name;
	
	private String password; // only used on high admin priveledge
	
	private String emailAddr;
	
	private int age;
	private int contactNum;
	private int userID;
	private int priveledgeLvl; // admin, librarian, renter
	private int ammountOwned; // past due books
	private int[] bookRentedIDs; // array of book ids that the user rented
	
	
	public String getName() {
		return new String(name);
	}
	public void setName(String name) {
		this.name = new String(name);
	}
	public String getPassword() {
		return new String(password);
	}
	public void setPassword(String password) {
		this.password = new String(password);
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = new String(emailAddr);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getContactNum() {
		return contactNum;
	}
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getPriveledgeLvl() {
		return priveledgeLvl;
	}
	public void setPriveledgeLvl(int priveledgeLvl) {
		this.priveledgeLvl = priveledgeLvl;
	}
	public int getAmmountOwned() {
		return ammountOwned;
	}
	public void setAmmountOwned(int ammountOwned) {
		this.ammountOwned = ammountOwned;
	}
	public int[] getBookRentedIDs() {
		return bookRentedIDs;
	}
	public void setBookRentedIDs(int[] bookRentedIDs) {
		this.bookRentedIDs = bookRentedIDs;
	}
	
	
	
}
