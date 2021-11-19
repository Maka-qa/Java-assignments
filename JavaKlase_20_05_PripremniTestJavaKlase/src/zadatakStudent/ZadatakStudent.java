package zadatakStudent;

public class ZadatakStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOsnovnihStudija stOsSt = new StudentOsnovnihStudija("Marija Milojevic", "M099/08", 9);
		StudentMasterStudija stMaSt = new StudentMasterStudija("Jelica Panic", "P099/05", 1);
		
		stOsSt.stampaj();
		System.out.println("-----------------");
		stMaSt.stampaj();
		
		

	}

}
