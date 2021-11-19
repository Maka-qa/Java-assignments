package videoPlayer;
import java.util.ArrayList;
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
//U glavnom programu kreirati listu akcija i izvrsiti ih nad istim plejerom.
public class GlavnaKlasa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoPlayer vidPly = new VideoPlayer(3500, 2000, 54, 144);
		vidPly.stampaj();
		System.out.println("-----------------------");
		TimeControl premotajUnapred = new TimeControl(true);
		premotajUnapred.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		AudioControl stisaj = new AudioControl(false);
		stisaj.izvrsiAkciju(vidPly);
		stisaj.izvrsiAkciju(vidPly);
		stisaj.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		QuplityOptimizerControl qualityControl = new QuplityOptimizerControl(30);
		qualityControl.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		TimeControl premotajUnazad = new TimeControl(false);
		AudioControl pojacaj = new AudioControl(true);
		QuplityOptimizerControl qualityControl1 = new QuplityOptimizerControl(50);
		ArrayList<Control> listaAkcija = new ArrayList<Control>();
		listaAkcija.add(premotajUnazad);
		listaAkcija.add(pojacaj);
		listaAkcija.add(qualityControl1);
		for (int i = 0; i < listaAkcija.size(); i++) {
			listaAkcija.get(i).izvrsiAkciju(vidPly);
		}
		vidPly.stampaj();
		System.out.println("-----------------------");
		for (int i = 0; i < 20; i++) {
			pojacaj.izvrsiAkciju(vidPly);
		}
		vidPly.stampaj();
	}
}