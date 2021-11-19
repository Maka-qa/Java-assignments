/* Domaci 21.05.2021. @here
Napravite excel fajl gde cete u jednom sheetu napraviti 
kolone Valid username, Valid password, Invalid username
 i Invalid password (dodajte koliko zelite celija za ove 
 kolone ali sve kolone moraju imati isti broj celija).
 Zatim iz tog fajla napravite onoliko petlji koliko ima
 kombinacija za unos i naravno u petlji stampajte podatke iz celija.
Na primer: Petlja 1 - Valid username, valid password
Petlja 2 - Invalid username, valid password 

Druga stavka:
Resenja za domaci 7.5. ; 29.4. ; 28.4. su okacena na drive kome treba da pogleda

Treca stavka:
Neobavezni logicki zadatak:
Four people arrive at a river with a narrow bridge that can only hold two people at a time.
It’s nighttime and they have one torch that has to be used when crossing the bridge.
Person A can cross the bridge in one minute, B in two minutes, C in five minutes, and D in eight minutes.
When two people cross the bridge together, they must move at the slower person’s pace.
Can they all get across the bridge in 15 minutes or less?

*/


package domaci_21_05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domaci_21_05 {
		public static void main(String[] args) throws IOException {
			File domaciUpis = new File("data/domaci_21_05.xlsx");
			FileOutputStream fos = new FileOutputStream(domaciUpis);
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet1 = wb.createSheet("password");
			for (int i = 0; i < 2; i++) {
				XSSFRow validUsername = sheet1.createRow(i);
				XSSFRow validPassword = sheet1.createRow(i);
				XSSFRow invalidUsername = sheet1.createRow(i);
				XSSFRow invalidPassword = sheet1.createRow(i);

				
				XSSFCell prvaCelijaVaUs = validUsername.createCell(1);
				XSSFCell drugaCelijaVaUs = validUsername.createCell(2);
				
				prvaCelijaVaUs.setCellValue(i+1);
				drugaCelijaVaUs.setCellValue(i+1);
				
				XSSFCell prvaCelijaVaPass = validPassword.createCell(1);
				XSSFCell drugaCelijaVaPass = validPassword.createCell(2);
				
				prvaCelijaVaPass.setCellValue(i+1);
				drugaCelijaVaPass.setCellValue(i+1);
				
				XSSFCell prvaCelijaInUs = invalidUsername.createCell(1);
				XSSFCell drugaCelijaInUs = invalidUsername.createCell(2);
				
				prvaCelijaInUs.setCellValue(i+1);
				drugaCelijaInUs.setCellValue(i+1);
				
				XSSFCell prvaCelijaInPass = invalidPassword.createCell(1);
				XSSFCell drugaCelijaInPass = invalidPassword.createCell(2);
				
				prvaCelijaInPass.setCellValue(i+1);
				drugaCelijaInPass.setCellValue(i+1);
				
				

			}
			wb.write(fos);
			wb.close();
			fos.close();
			System.out.println("Kraj programa");
		}
	}
