package osnoveJaveDopunskaDragoljub_25_05;
import java.util.Scanner;
public class Vezba2 {
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int unetBroj = sken.nextInt();
        int suma = 0;
        while (unetBroj >= 0) {
            suma = suma + unetBroj;
            System.out.println("unesite broj");
            unetBroj = sken.nextInt();
        }
        System.out.println("Suma unetih brojeva do unetog negativnog broja je " + (unetBroj + suma));
        System.out.println("Kraj programa");
    }
}