/* pisanje u fajl */

package apachePOI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class PisanjeUFajl {
	public static void main(String[] args) throws IOException {
		File fileZaUpis = new File("data/podaci2.xlsx");
		FileOutputStream fos = new FileOutputStream(fileZaUpis);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("vezbanje upisa");
		XSSFRow red1 = sheet1.createRow(0);
		XSSFCell gornjeLevoPolje = red1.createCell(0);
		gornjeLevoPolje.setCellValue("Gornje levo polje");
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("Kraj programa");
	}
}