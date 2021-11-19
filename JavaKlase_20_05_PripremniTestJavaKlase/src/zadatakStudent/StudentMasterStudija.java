/*Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
	●koja za cenu skolarine vraca 100000
	●za metodu da li je na budzetu vraca true ako je student
	 ispod 2 godine studija*/
package zadatakStudent;

public class StudentMasterStudija extends Student {
	
	
	
	public StudentMasterStudija(String imeIPrezime, String brIndexa, int godStudija) {
		super(imeIPrezime, brIndexa, godStudija);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int cenaSkolarine() {
		return 100000;
	}
	@Override
	public boolean daLiJeNaBudzetu() {
		if(super.getGodStudija()<2) {
			return true;
		} else
			return false;
		
}
}