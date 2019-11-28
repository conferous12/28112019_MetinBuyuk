package finalders6.finalders66;

import java.util.Locale;

public class MetinIslemleri {


	public static String buyukHarf(String metin) {
		
		return metin.toUpperCase(
				Locale.forLanguageTag("tr"));
	}
}