package package2;

public class WhilePetlja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int n =1;
		
		while ( i <= 15 ) {
			System.out.println("Usao sam u petlju " + n + ". i vrednost i je: " + i);
			i+=2; //i=i+2 (produzena varijanta)
			n++;
		}
		System.out.println("Kraj programa.");
	}

}
