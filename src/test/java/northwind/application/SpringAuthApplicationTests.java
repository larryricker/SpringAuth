package northwind.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.bouncycastle.jcajce.provider.digest.SHA256;
import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;

@SpringBootTest
class SpringAuthApplicationTests {

	@Test
	void matchingSHA3Test() {
	    String password1 = "L0ckHerUp";
	    String password2 = "L0ckHerUp";
	    SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest512();
	    byte[] digest1 = digestSHA3.digest(password1.getBytes());
	    byte[] digest2 = digestSHA3.digest(password2.getBytes());

	    String hexString1 = Hex.toHexString(digest1);
	    String hexString2 = Hex.toHexString(digest2);
	    System.out.println("matching test");
		System.out.println("SHA3-512 = " + hexString1);
		System.out.println("SHA3-512 = " + hexString2);
		System.out.println("hexString1 length = " + hexString1.length());
		System.out.println("hexString2 length = " + hexString2.length());
	    assert(hexString1.equals(hexString2));

	}

	@Test
	void notMatchingSHA3Test() {
	    String password1 = "L0ckHerUp";
	    String password2 = "Ch@ngeMe";
	    SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest512();
	    byte[] digest1 = digestSHA3.digest(password1.getBytes());
	    byte[] digest2 = digestSHA3.digest(password2.getBytes());

	    String hexString1 = Hex.toHexString(digest1);
	    String hexString2 = Hex.toHexString(digest2);
	    System.out.println("not matching test");
		System.out.println("SHA3-512 = " + hexString1);
		System.out.println("SHA3-512 = " + hexString2);
		System.out.println("hexString1 length = " + hexString1.length());
		System.out.println("hexString2 length = " + hexString2.length());
	    assert(!hexString1.equals(hexString2));

	}

	@Test
	void matchingSHA256Test() {
	    String password1 = "L0ckHerUp";
	    String password2 = "L0ckHerUp";
	    SHA256.Digest digestSHA2 = new SHA256.Digest();
	    byte[] digest1 = digestSHA2.digest(password1.getBytes());
	    byte[] digest2 = digestSHA2.digest(password2.getBytes());

	    String hexString1 = Hex.toHexString(digest1);
	    String hexString2 = Hex.toHexString(digest2);
	    System.out.println("matching test");
		System.out.println("SHA256 = " + hexString1);
		System.out.println("SHA256 = " + hexString2);
		System.out.println("hexString1 length = " + hexString1.length());
		System.out.println("hexString2 length = " + hexString2.length());
	    assert(hexString1.equals(hexString2));

	}

	@Test
	void notMatchingSHA256Test() {
	    String password1 = "L0ckHerUp";
	    String password2 = "Ch@ngeMe";
	    SHA256.Digest digestSHA2 = new SHA256.Digest();
	    byte[] digest1 = digestSHA2.digest(password1.getBytes());
	    byte[] digest2 = digestSHA2.digest(password2.getBytes());

	    String hexString1 = Hex.toHexString(digest1);
	    String hexString2 = Hex.toHexString(digest2);
	    System.out.println("not matching test");
		System.out.println("SHA256 = " + hexString1);
		System.out.println("SHA256 = " + hexString2);
		System.out.println("hexString1 length = " + hexString1.length());
		System.out.println("hexString2 length = " + hexString2.length());
	    assert(!hexString1.equals(hexString2));

	}

}
