package live_Q_6;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;
public class Test {
	public static void main(String[] args) {
		Veena veena =new Veena();
		veena.play();
		Saxophone saxophone=new Saxophone();
		saxophone.play();
		Playable p1=veena;
		Playable p2=saxophone;
		p1.play();
		p2.play();
	}
}
