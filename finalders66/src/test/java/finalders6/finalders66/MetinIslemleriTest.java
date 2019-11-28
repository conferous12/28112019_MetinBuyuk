package finalders6.finalders66;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc =MetinIslemleri
		.buyukHarf("okul");
		Assert.assertEquals("OKUL", sonuc);
	}

}
