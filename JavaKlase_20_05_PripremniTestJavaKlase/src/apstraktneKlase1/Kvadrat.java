package apstraktneKlase;

public class Kvadrat extends GeometrijskaFigura {
	
	private double stranicaA;
	
	

	public Kvadrat(double stranicaA) {
		super();
		this.stranicaA = stranicaA;
	}

	
	
	public double getStranicaA() {
		return stranicaA;
	}



	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}



	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return (stranicaA * stranicaA);
	}

	@Override
	public double obim() {
		// TODO Auto-generated method stub
		return (4 * stranicaA);
	}

}
