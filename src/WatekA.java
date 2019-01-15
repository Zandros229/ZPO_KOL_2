import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import com.google.common.base.Splitter;

public class WatekA extends Thread{
	Main m;
	
	WatekA(Main m) {
		this.m = m;
	}

	
	ArrayList<String> akapitList = new ArrayList<String>();
	Random random = new Random();
	
	public void tworzSlowkaAkapitu() {
		String akapit = "W�tek A, w niesko�czonej p�tli losuje s�owa z tego akapitu (zaznacz, wklej do swojej klasy" + 
				"jako string), ka�de losowanie poprzedzone pauz� o czasie od 0.5s do 1s (wybranym losowo z" +
				"dok�adno�ci� do 0.01s), i wrzuca je do kolejki o maks. rozmiarze 3 element�w. W�tek B co" +
				"0.7s sprawdza czy kolejka zosta�a uaktualniona (od poprzedniego sprawdzenia), i je�li tak, to" +
				"wypisuje liczb� wielkich liter w kolejce. Do realizacji kolejki u�yj kolekcji LinkedList (je�li" +
				"po dodaniu elementu na ko�cu listy liczba element�w w kolejce wynosi�aby 4, to usuwamy" +
				"element z pocz�tku listy)";
		Iterable<String> akapitIterator = Splitter.on(' ').split(akapit);
		for(String str : akapitIterator) {
			akapitList.add(str);
			
		}
		
		
		/*
		while(akapitIterator.) {
			akapitList.add(akapitIterator.next());
		}*/
	}

	public String losujSlowo() {
		int slowoKtore = random.nextInt(akapitList.size() - 1); 
		return akapitList.get(slowoKtore);
	}

	public void run () {
		tworzSlowkaAkapitu();
		while(true) {
			double op = 0;
			while(op < 50) {
				op = (random.nextInt(100));
			}
			try {
				Thread.sleep((long) (10 * (op * 0.01)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String str = losujSlowo();
			m.slowka.add(str);

		}	
	}
	

}
