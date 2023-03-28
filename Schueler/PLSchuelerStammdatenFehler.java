import de.nrw.schule.svws.core.data.schueler.SchuelerStammdaten;
import de.nrw.schule.svws.core.types.Geschlecht;

/**
 * PL-Fehler bei der Pr�fungs von Sch�ler-Stammdaten
 */
public class PLSchuelerStammdatenFehler extends PLFehler {

    private SchuelerStammdaten stammdaten;
    
    public PLSchuelerStammdatenFehler(SchuelerStammdaten stammdaten) {
        super("Pr�fung: Geschlecht g�ltiger Eintrag", SchuelerStammdaten.class.getName(), Geschlecht.class.getName());
        this.stammdaten = stammdaten;
    }

    public PLSchuelerStammdatenFehler geschlecht() {
        this.setFehler("Sch�ler-Stammdaten: Geschlecht fehlt oder ist ung�ltig bei dem Sch�ler mit der ID " + stammdaten.id);
        return this;
    }

}