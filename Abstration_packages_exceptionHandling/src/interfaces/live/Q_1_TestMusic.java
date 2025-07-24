package interfaces.live;

import interfaces.music.string.Veena;
import interfaces.music.wind.Saxophone;
import interfaces.music.Playable;
public class Q_1_TestMusic {
	public static void main(String[] args) {
		Veena v = new Veena();
        Playable veena = v;
        Saxophone s = new Saxophone(); 
        Playable saxo = s;
        veena.play(); 
        saxo.play(); 
	}
}
