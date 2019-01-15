
public class WatekB extends Thread{
	Main m;
	
	WatekB(Main m) {
		this.m = m;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(70);
				int wielkieLitery = 0;
				for(String str : m.slowka) {
					for(int i = 0; i < str.length(); i+= 1) {
						if(Character.isUpperCase(str.charAt(i))) {
							wielkieLitery += 1;
						}
					}
				}
				for(String str : m.slowka) {
					System.out.print(str + "|");
					System.out.print("\t " + wielkieLitery);
				}
				System.out.println();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
	
}


