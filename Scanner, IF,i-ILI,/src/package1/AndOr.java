
package package1;

public class AndOr {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
//				AND => &&
//				OR => ||
				int a =0;
				int b = 10;
				
				if(a > 0 && b > 0) {
					System.out.println("Oba broja su pozitivna");
				}else if (a > 0 || b > 0) {
					System.out.println("Jedan broj je pozitivan");
				}else {
					System.out.println("Oba broja su 0 ili negatini");
				}
			}
		}
