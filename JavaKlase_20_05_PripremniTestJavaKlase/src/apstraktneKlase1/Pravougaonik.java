/*Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
• stranice a i b
• gettere/settere/konstruktore
• implementira metodu povrsina
• implementira metodu obim*/

package apstraktneKlase;

public class Pravougaonik extends GeometrijskaFigura{
	
	private double strA;
	private double strB;
	
	

	public Pravougaonik(double strA, double strB) {
		super();
		this.strA = strA;
		this.strB = strB;
	}
	
	

	public double getStrA() {
		return strA;
	}



	public void setStrA(double strA) {
		this.strA = strA;
	}



	public double getStrB() {
		return strB;
	}



	public void setStrB(double strB) {
		this.strB = strB;
	}



	@Override
	public double povrsina() {
		return strA * strB;
	}

	@Override
	public double obim() {
		return (2 * strA) + (2 * strB);
	}

}
