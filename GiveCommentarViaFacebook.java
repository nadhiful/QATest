import static com.heliumhq.API.*;

public  class Main {
	public static void main(String... args) {
		startChrome();
		goTo("kumparan.com");
		click("Login With Facebook");
		write("Nadhzava", into="Email Address or phone number");
		write("Alpa967181", into="Password");
		click("Login");
		find_all(Window("Kilas Balik Perjuangan JKT48 Generasi 1 Mencapai Ketenaran"));
		write("Sedih",into="Tulis Komentarmu");
		click("Post");
	}
}
