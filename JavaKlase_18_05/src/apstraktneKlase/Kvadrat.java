package apstraktneKlase;
public class Kvadrat extends GeometijskaFigura{
	private double stranica;
	public Kvadrat(double stranica) {
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
		// TODO Auto-generated method stub
		return stranica*stranica;
	}
	@Override
	public double obim() {
		// TODO Auto-generated method stub
		return 4*stranica;
	}
}