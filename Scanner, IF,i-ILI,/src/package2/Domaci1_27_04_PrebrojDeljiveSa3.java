package package2;

public class Domaci1_27_04_PrebrojDeljiveSa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih)
deljivih brojem 3.

  */
		
		 int brojac = 0;
	        for (int i = 9; i <= 250; i++) {
	            if (i%3 == 0) {
	                brojac++;
	                
	            }
	            
	        }
	        System.out.println("U opsegu od 9 do 250 , broj cifara deljivih sa 3 je :");
	        System.out.println(brojac);


	}

}
