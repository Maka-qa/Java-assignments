package apstraktneKlase;
/*Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
• stranice a i b
• gettere/settere/konstruktore
• implementira metodu povrsina
• implementira metodu obim*/
public class Pravugaonik extends GeometijskaFigura{
	private double stranicaA;
	private double stranicaB;
	public Pravugaonik(double stranicaA, double stranicaB) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	public double getStranicaA() {
		return stranicaA;
	}
	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}
	public double getStranicaB() {
		return stranicaB;
	}
	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}
	@Override
	public double povrsina() {
		return stranicaA*stranicaB;
	}
	@Override
	public double obim() {
		return (2*stranicaA)+(2*stranicaB);
	}
}