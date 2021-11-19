package testKlase;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planina p1 = new Planina("Kopaonik", "Srbija", 3000);
		
		ArrayList<Planinar> planinar = new ArrayList<Planinar>();
		
		RekreativniPlaninar rp1 = new RekreativniPlaninar(22, "Marija Milojevic", 8, "Okrug Orindz", 3000);
		RekreativniPlaninar rp2 = new RekreativniPlaninar(32, "Jelica Milojevic", 9, "Okrug Couture", 5000);
		RekreativniPlaninar rp3 = new RekreativniPlaninar(42, "Dean Milojevic", 6, "Okrug Ajnhoven", 4500);
		
		
		Alpinista a1 = new Alpinista(1, "Marko Milosevic", 4);
		Alpinista a2 = new Alpinista(2, "Jela Simic", 12);
		Alpinista a3 = new Alpinista(3, "Nevena Peric", 15);
		
		planinar.add(rp1);
		planinar.add(rp2);
		planinar.add(rp3);
		planinar.add(a1);
		planinar.add(a2);
		planinar.add(a3);
		
		double suma = 0;
		for (int i = 0; i < planinar.size(); i++) {
			suma += planinar.get(i).clanarinaPlaninara();
			planinar.get(i).stampaj();
			
			if(planinar.get(i).uspesanUspon(p1)) {
				System.out.println("Uspece da se popne na planinu.");
			} else 
				System.out.println("Nece uspeti da se popne na planinu.");
			System.out.println("---------------");
			
		}

	
		System.out.println("Zbir clanarina  svih planinara je: " + suma + "din.");
	} 
	
	
}
