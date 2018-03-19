import static com.heliumhq.API.*;

public  class Main {
	public static void main(String... args) {
		startChrome();
		goTo("kumparan.com");
		click(Link("Log In / Sign Up"));
		click("Login With Google +");
		write("alhijr121@gmail.com", into="Email or phone");
		click("Next");
		write("Alpa967181", into="Enter your password");
		click("Next");
	}
}
