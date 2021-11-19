package package3;

public class NizNajmanjiUnizu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nizBrojeva = {3, -34, 0, 1,5,67};
		int min = nizBrojeva[0];
		for (int i = 0; i < nizBrojeva.length; i++)
			if (nizBrojeva [i] < min) {
				min = nizBrojeva[i];
			}
		System.out.println("Najmanji broj u nizu je: " + min);

	}

}
