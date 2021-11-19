package zadatakStudent;
public class ZadatakStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOsnovnihStudija stOsSt = new StudentOsnovnihStudija("Milovan Pocek", "P024/07", 7);
		StudentMasterStudija stMaSt = new StudentMasterStudija("Nikola Tesla", "001", 1);
		stOsSt.stampaj();
		System.out.println("---------------------");
		stMaSt.stampaj();
	}
}