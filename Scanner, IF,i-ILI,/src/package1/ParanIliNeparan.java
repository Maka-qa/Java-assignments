package package1;

import java.util.Scanner;

public class ParanIliNeparan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite broj sa tastature: ");
		int a = s.nextInt();
		if ((a%2)==0) {
			System.out.println("Broj je paran");
		}else if ((a%2)!=0) {
			System.out.println("Broj je neparan");
		}

	}

}
