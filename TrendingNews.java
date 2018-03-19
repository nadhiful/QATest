import static com.heliumhq.API.*;

public class Main {
	public static void main(String... args) {
		startChrome();
		goTo("kumparan.com");
		click(Link("view_all"));
		click(Link("Kilas Balik Perjuangan JKT48 Generasi 1 Mencapai Ketenaran"));
	}
}
