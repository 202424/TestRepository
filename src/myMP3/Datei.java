package myMP3;
import java.util.Date;

/**
 * Abstrakte Klasse Datei - beschreiben Sie hier die Klasse
 *
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public class Datei
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Date date;
    private int groesse;
    private int zaehler;
	private String titel;
    private Ordner ordner;
    private Playlist[] playlisten;

    public Datei()
    {
       date = new Date();

    }

    public Datei(String titel, int i) {
		// TODO Auto-generated constructor stub
    	this.WithZahl(i).WithTitel(titel);
	}

	/**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     *
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
     public String toString()
    {
        String how = "Datum  = " + date; // + "Groesse = " + groesse + "Zaehler = " + zaehler + "Titel = " + titel;
        return how;
    }

     public Datei WithTitel(String titel)
     {
        this.setTitel(titel);
        return this;
     }
     public Datei WithZahl(int zahl)
     {
        this.setZaehler(zahl);
        return this;
     }

     public Date getDate() {
 		return date;
 	}

 	public void setDate(Date date) {
 		this.date = date;
 	}

 	public int getZaehler() {
 		return zaehler;
 	}

 	public void setZaehler(int zaehler) {
 		this.zaehler = zaehler;
 	}

 	public String getTitel() {
 		return titel;
 	}

 	public void setTitel(String titel) {
 		this.titel = titel;
 	}

	public void viewStudent(Student st) {
		st.setCredits(st.getCredits() + this.getZaehler());
	}
}
