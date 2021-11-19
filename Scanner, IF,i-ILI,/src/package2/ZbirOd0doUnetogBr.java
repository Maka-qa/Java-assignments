package package2;

import java.util.Scanner;

public class ZbirOd0doUnetogBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Napisati program koji sabira
//		brojeve od 0 do broja koji ste uneli na tastaturi
//		i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
//		Zbir svih brojeva od 0 do 3 je 6
		
		
		
		
		System.out.println("Unesite broj do kog želite da saberete:");
		
		Scanner s = new Scanner(System.in);
		
		
		int brojDoKogSabiramo = s.nextInt();
		
		int zbir = 0;
		int i = 0;
		
		while (i<=brojDoKogSabiramo)
		{
			zbir+=i;
			i++;
		} 
		System.out.println("Zbir svih brojeva od 0 do " + brojDoKogSabiramo + " je: " + zbir);
	
		
		/*		int brojDoKogSabiramo=s.nextInt();
		
		int brojZaIspis=brojDoKogSabiramo;
		
		int zbir=0;
		
		while (brojDoKogSabiramo>0)
		{
		    zbir+=brojDoKogSabiramo;
		    brojDoKogSabiramo--;
		}
		
		System.out.println("Zbir brojeva od 0 do "+ brojZaIspis+ " je " + zbir);
		

		*/
	
		
		
	
	
	}


	}


