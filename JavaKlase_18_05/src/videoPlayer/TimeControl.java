package videoPlayer;
/*Kreirati klasu TimeControl koja nasledjuje klasu Control i 
●konstruktore
●ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
●implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 
15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.*/
public class TimeControl extends Control{
	private boolean unapred;
	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}
	public boolean isUnapred() {
		return unapred;
	}
	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if(unapred) {
			if(vp.getTrenutnoVremeVidea()+15>vp.getDuzinaVidea())
				vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
			else {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea()+15);
			}
		}else {
			if(vp.getTrenutnoVremeVidea()-15<0)
				vp.setTrenutnoVremeVidea(0);
			else {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea()-15);
}
		}
	}
}