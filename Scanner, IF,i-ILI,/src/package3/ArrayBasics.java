package package3;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nizBoja = new String[4];
		//int[] nizBrojeva = new int[7];
		//double[]  nizDablova = new double[5];
		nizBoja[0] = "zuta";
		nizBoja[2] = "plava";
		nizBoja[1] = "braon";
		nizBoja[3] = "crvena";
		int duzinaNiza = nizBoja.length;
		System.out.println("Niz sadrzi " + duzinaNiza + " elemenata");
		for (int i = 0; i < nizBoja.length; i++) {
			System.out.println((i+1) + ". element niza je " + nizBoja[i]);		
		}
		System.out.println("Kraj programa");
		//alternatvno inicijalizovanje niza
		String[] nizCveca = {"Ruza", "Ljubicica", "Lala", "Fikus", "Lavanda"};
		System.out.println("Element sa indexom 3 je " + nizCveca[3]);
		System.out.println("Duzina niza je " + nizCveca.length);
		nizCveca[2] = "maslacak";
		for (int i = 0; i < nizCveca.length; i++) {
			System.out.println((i+1) + ". element niza je " + nizCveca[i]);
		}
		int[] nizBrojeva = new int[3];
		System.out.println(nizBrojeva[1]);

	}

}
