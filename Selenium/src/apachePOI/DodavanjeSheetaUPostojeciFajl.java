/* Dodavanje sheeta u postojeci fajl */


package apachePOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DodavanjeSheetaUPostojeciFajl {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File postojeciFile = new File("data/podaci2.xlsx");
		FileInputStream fis = new FileInputStream(postojeciFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		FileOutputStream fos = new FileOutputStream(postojeciFile);
		//int randomBroj = (int) Math.random() * 101;
		//String nazivSheeta = "novi sheet" + randomBroj;
		wb.createSheet("Novi sheet1");
		XSSFSheet noviSheet = wb.getSheet("Novi sheet1");
		XSSFRow red = noviSheet.createRow(0);
		XSSFCell gornjeLevoPolje = red.createCell(0);
		gornjeLevoPolje.setCellValue("novo polje u novom sheetu");
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
		System.out.println("Kraj nedelje");
	}
}