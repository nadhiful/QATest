import static com.heliumhq.API.*;
public class Main {
	public static void main(String... args) {
		startChrome();
		goTo("kumparan.com");
		click(Link("Log  In / Sign Up"));
		click("Login With Facebook");
		write("Nadhzava", into="Email Address or phone number");
		write("Alpa967181", into="Password");
		click("Login");
	}
}
