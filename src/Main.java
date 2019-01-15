import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import com.google.common.base.Splitter;

public class Main {
	public ArrayDeque<String> slowka = new ArrayDeque<String>(3);

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		WatekA watekA = new WatekA(m);
		WatekB watekB = new WatekB(m);
		watekA.run();
		watekB.run();
	}
}
