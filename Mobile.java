package week1.day1;

public class Mobile {

	public String sendMsg() {
		String msg = "Hello Veera";
		return msg;
		
	}
	private long makeCall() {
	long  mobile = 12345678910L;
	return mobile;
}
	void saveContact() {
		String contact = "Veera";
		System.out.println("Contact " +contact +" is saved");
}
	public static void main(String[] args) {
		Mobile myObj = new Mobile();
		myObj.saveContact();
		System.out.println("Message: " +myObj.sendMsg());
		System.out.println("Dailing Mobile " +myObj.makeCall());
		
	}
}
