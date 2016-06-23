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
}
