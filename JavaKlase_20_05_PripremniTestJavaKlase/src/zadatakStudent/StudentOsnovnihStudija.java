/*Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student 
 * i koja ima:
	●koja za cenu skolarine vraca 90000
	●za metodu da li je na budzetu vraca true ako je student
	 ispod 5 godine studija*/
package zadatakStudent;

public class StudentOsnovnihStudija extends Student {
	
	
	
	public StudentOsnovnihStudija(String imeIPrezime, String brIndexa, int godStudija) {
		super(imeIPrezime, brIndexa, godStudija);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int cenaSkolarine() {
		return 90000;
	}
	@Override
	public boolean daLiJeNaBudzetu() {
		if(super.getGodStudija()<5) {
			return true;
		} else
			return false;
}
}