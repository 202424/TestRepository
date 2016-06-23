package myMP3;

/**
 * Beschreiben Sie hier die Klasse MP3Player.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MP3Player
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String adresse;
    private String name;
    private String telefon;
    private Ordner dateisystem;
    private Datei[] top_ten;
    private Playlist[] playlisten;
    private MP3Player[] anderePlayer;

    /**
     * Konstruktor für Objekte der Klasse MP3Player
     */
    public MP3Player()
    {
        // Instanzvariable initialisieren
        top_ten = new Datei[10];
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void addDatei (Datei e)
    {
        // tragen Sie hier den Code ein
        for (int i = 0; i <= top_ten.length -1; i++)
        top_ten [i] = e;
    }
    
    public String toString()
    {
    	String resume = "";
        // tragen Sie hier den Code ein
    	for (int i = 0; i <= top_ten.length -1; i++)
    	{ resume = top_ten[i].toString ();}
    	return  resume;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	MP3Player mp1 = new MP3Player();
    	Datei erste = new Datei();
    	mp1.addDatei(erste);
    	System.out.println(mp1.toString());
	}
}
