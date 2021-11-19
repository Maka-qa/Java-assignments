package zadatakPlatnaKartica;
public class ZadatakPlatnaKartica {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisaKartica v1 = new VisaKartica(1000, "4323qrej2or3ej", 2022, 8, "Milovan Pocek");
		v1.stampaj();
		v1.izvrsiTransakciju(20);
		v1.stampaj();
		v1.izvrsiTransakciju(180);
		v1.stampaj();
		MasterKartica m1 = new MasterKartica(500, "asdkad", 2022, 7);
		m1.stampaj();
		m1.odrzavanje();
		m1.stampaj();
		m1.izvrsiTransakciju(20);
		m1.stampaj();
	}
}