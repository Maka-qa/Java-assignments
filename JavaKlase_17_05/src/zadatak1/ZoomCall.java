package zadatak1;
/*Kreirati klasu ZoomCall koja ima:●link za poziv●password●korisnika koji je host●korisnika koji je 
guest●gettere za sve atribute●setter samo za guest-a●metodu pokreni poziv koja stampa podatke
u formatu:
	Zoom Call: url
	Password:password
	Host: ime i prezime
	Guest: ime i prezime
	Maksimalno trajanje poziva je (broj minuta)min*/
public class ZoomCall {
	private String linkZaPoziv;
	private String password;
	private Korisnik host;
	private Korisnik guest;
	public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
		super();
		this.linkZaPoziv = linkZaPoziv;
		this.password = password;
		this.host = host;
		this.guest = guest;
	}
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLinkZaPoziv() {
		return linkZaPoziv;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	public void pokreniPoziv() {
		System.out.println("Url: " + this.linkZaPoziv);
		System.out.println("Password: " + this.password);
		System.out.print("Host: "); 
		this.host.stampajKorisnika();
		System.out.print("Guest: "); 
		this.guest.stampajKorisnika();
		System.out.println("Max trajanje poziva je " + this.host.maxDuzinaTrajanjaPozivaUMinutima() + ". min");
	}
}