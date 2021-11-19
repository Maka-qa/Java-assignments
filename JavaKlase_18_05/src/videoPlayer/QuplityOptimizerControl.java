package videoPlayer;
/*Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
●ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
●gettere, settere i konstruktore
●implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
Kvalitet se racuna na osnovu formule:brzina interneta * 10.1, gde se uzima prvi veci kvalitet npr:
	ako je brizna interneta 20 * 10.1 = 204 => postavlja 240npr:
		ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144npr: 
			ako je brzina interneta 50 * 10.1 = 505 => postavlja 720*/
public class QuplityOptimizerControl extends Control {
	
	private int brzinaInterneta;
	
	public QuplityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}
	
	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}
	
	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		vp.setKvalitetVidea(this.racunajKvalitet(this.brzinaInterneta));
	}
	
	public int racunajKvalitet(int brzinaInterneta) {
		double a = brzinaInterneta * 10.1;
		int kvalitet = 0;
		//(144, 240, 360, 480, 720, 1080)
		if(a<=144) {
			kvalitet=144;
		}else if(a<240){
			kvalitet = 240;
		}else if(a<360){
			kvalitet = 360;
		}else if(a<480){
			kvalitet = 480;
		}else if(a<720){
			kvalitet = 720;
		}else {
			kvalitet = 1080;
		}
		return kvalitet;
	}

}

