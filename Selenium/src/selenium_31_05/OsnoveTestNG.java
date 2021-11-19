package selenium_31_05;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class OsnoveTestNG {
	@BeforeClass 
	public void preSihTestova() {
		System.out.println("============================");
		System.out.println("Ispis pre svih testova");
		System.out.println("============================");
	}
	@BeforeMethod 
	public void preSvakogTesta() {
		System.out.println("--------------------------------");
		System.out.println("Ispis pre svakog testa");
	}
	@Test (priority = 0)
	public void test3() {
		System.out.println("Ispis is testa 3");
	}
	@Test(priority = 10)
	public void test1() {
		System.out.println("Ispis is testa 1");
	}
	@Test(priority = 5)
	public void test2() {
		System.out.println("Ispis is testa 2");
	}
	@AfterMethod 
	public void posleSvakogTesta() {
		System.out.println("Ispis nakon svakog testa");
		System.out.println("--------------------------------");
	}
	@AfterClass 
	public void posleSihTestova() {
		System.out.println("============================");
		System.out.println("Ispis posle svih testova");
		System.out.println("============================");
	}
}