package apstraktneKlase;
/*Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
• stranicu a
• gettere/settere/konstruktore
• implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
• implementira metodu obim*/
public class JednakostranicniTrougao extends GeometijskaFigura{
	private double stranica;
	public JednakostranicniTrougao(double stranica) {
		super();
		this.stranica = stranica;
	}
	public double getStranica() {
		return stranica;
	}
	public void setStranica(double stranica) {
		this.stranica = stranica;
	}
	@Override
	public double povrsina() {
		return (this.stranica * this.stranica) * 1.73205 / 4;
	}
	@Override
	public double obim() {
		return 3*this.stranica;
	}
}