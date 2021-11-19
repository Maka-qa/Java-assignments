package package2;

public class SabiranjeUWhilePetlji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int zbir = 0;
		
		while (i <= 50 ) {
			zbir = zbir + i;   //  zbir += i;
			System.out.println("Vrednost i je: " + i + " a zbir je: " + zbir);
			i += 5;
		}
	}

}

/* package package1;
public class WhilePetlja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 30;
		int zbir = 0;
		while (i <= 50) {
			zbir = zbir + i;
			System.out.println("i je " + i + ", a trenutni zbir je " + zbir);
			i++;
		}
		System.out.println("Kraj programa");
	}
} */
