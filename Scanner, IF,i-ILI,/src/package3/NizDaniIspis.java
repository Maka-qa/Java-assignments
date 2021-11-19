package package3;

public class NizDaniIspis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dane u nedelji stavite u niz, a zatim ih sve ispisite
		
		
		String [] nizDana = new String [7];
		nizDana [0] = "ponedeljak";
		nizDana [1] = "utorak";
		nizDana [2] = "sreda";
		nizDana[3] ="cetvrtak";
		nizDana [4] = "petak";
		nizDana [5] = "subota";
		nizDana [6] = "nedelja";
		/*int duzinaNiza = nizDana.length;
		System.out.println("Niz sadrzi " + duzinaNiza + " dana.");*/
		for (int i = 0; i < nizDana.length; i++)  {
			System.out.println((i+1) + ". dan u nedelji je " + nizDana[i] + ".");
		}

	/*	String[] nizDana = { "Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota", "Nedelja" };

		for (int i = 0; i < nizDana.length; i++) {
			System.out.println((i + 1) + ". Dan u nedelji je " + nizDana[i]);

		}*/

	}
}