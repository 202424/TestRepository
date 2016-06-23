package myMP3;
import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Ordner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Ordner
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Ordner vater;
    private Ordner[] soehne;
    private ArrayList<Datei> dateien;

    /**
     * Konstruktor für Objekte der Klasse Ordner
     */
//     public Ordner()
//     {
//         // Instanzvariable initialisieren
//         x = 0;
//     }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String toString()
    {
        // tragen Sie hier den Code ein
        return "name = " + name + dateien.toString();
    }
}
