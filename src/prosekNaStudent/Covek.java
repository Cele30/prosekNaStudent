package prosekNaStudent;

public class Covek {

	private int godini;
	private String ime;
	private String prezime;

	public Covek(int godini, String ime, String prezime) {
		this.godini = godini;
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public void setGodini(int godini) {
		this.godini = godini;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public int getGodini() {
		return godini;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	
	public String toStringCovek() {
		return "Covek godini=" + godini + ", ime=" + ime + ", prezime=" + prezime + "";
	}  
}
