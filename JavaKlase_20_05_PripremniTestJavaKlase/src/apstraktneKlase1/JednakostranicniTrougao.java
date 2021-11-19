/*Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
• stranicu a
• gettere/settere/konstruktore
• implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
• implementira metodu obim*/

package apstraktneKlase;

public class JednakostranicniTrougao extends GeometrijskaFigura {
	private double a;
	
	
	
	

	public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}
	
	


	public double getA() {
		return a;
	}




	public void setA(double a) {
		this.a = a;
	}



	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
	}

	@Override
	public double obim() {
		return 3 * this.a;
	}
	
	
}
