package package1;

import java.util.Scanner;

public class SwitchMesecBrDana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*uneti sa tastature redni broj meseca u godini. Program treba da ispise koji je to mesec i 
		koliko ima dana u njemu. 
		Primer ispisa: 1. mesec u godini je Januar. U njemu ima 31 dan*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite redni broj meseca u godini:");
		int broj = s.nextInt();
		
		
		switch (broj) {
		case 1:{
			System.out.println(broj + ". mesec u godini je Januar. Ima 31 dan." ); 
			break;
		}
		
		case 2:{
			System.out.println(broj + ". mesec u godini je Februar. Ima 28/29 dana." ); 
			break;
		}
		case 3:{
			System.out.println(broj + ". mesec u godini je Mart. Ima 31 dan." ); 
			break;
		}
		case 4:{
			System.out.println(broj + ". mesec u godini je April. Ima 30 dana." ); 
			break;
		}
		case 5:{
			System.out.println(broj + ". mesec u godini je Maj. Ima 31 dan." ); 
			break;
		}
		case 6:{
			System.out.println(broj + ". mesec u godini je Jun. Ima 30 dana." ); 
			break;
		}
		case 7:{
			System.out.println(broj + ". mesec u godini je Jul. Ima 31 dan." ); 
			break;
		}
		case 8:{
			System.out.println(broj + ". mesec u godini je Avgust. Ima 31 dan." ); 
			break;
		}
		case 9:{
			System.out.println(broj + ". mesec u godini je Septembar. Ima 30 dana." ); 
			break;
		}
		case 10:{
			System.out.println(broj + ". mesec u godini je Oktobar. Ima 31 dan." ); 
			break;
		}
		case 11:{
			System.out.println(broj + ". mesec u godini je Novembar. Ima 30 dana." ); 
			break;
		}
		case 12:{
			System.out.println(broj + ". mesec u godini je Decembar. Ima 31 dan." ); 
			break;
		}
			
		default: System.out.println("Neispravan unos. Molimo Vas unesite broj od 1 do 12!");
			break;


	}

}
}
