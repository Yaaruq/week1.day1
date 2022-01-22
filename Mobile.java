package week1.day1;

public class Mobile {
public void sendMsg() {
	String message = "Hi World";
	System.out.println("Sending Message as: "+message);
}
public void makecall() {
	long number = 1234567890L;
	System.out.println("Making call to: "+number);
}
public void saveContact() {
	String contact = "Testleaf";
	System.out.println("Saving Contact as: "+contact);
}
public static void main(String[] args) {
	Mobile m = new Mobile();
	m.sendMsg();
	m.makecall();
	m.saveContact();
}
}
