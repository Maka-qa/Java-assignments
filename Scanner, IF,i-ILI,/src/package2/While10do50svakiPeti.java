package package2;

public class While10do50svakiPeti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//napisati program koji ispisuje svaki peti broj izmedju 10 i 50
		//(takodje ispisuje koji put ste usli u petlju)
		// primer resenja je:
		//vrednost promenljive je 10 usao sam u petlju 1.put
		// vrednost promenljive je 15 usao sam u petlju 2.put
		//...sve tako do 50 (ukljucujuci i 50)

		int i = 10;
		int n = 1;
		
		while ( i <= 50) {
			System.out.println("Usao sam u petlju " + n + ". put i vrednost promenljive i je: " + i);
			i+=5;
			n++;
		}
		System.out.println("Kraj programa.");
	}

}
