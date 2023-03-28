import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import de.nrw.schule.svws.core.data.schueler.SchuelerStammdaten;
import de.nrw.schule.svws.core.types.Geschlecht;

public class PLSchuelerStammdaten {

    /** Definition eines Predicate f�r die �berpr�fung der G�ltigkeit des Geschlechtseintrags bei den Sch�ler-Stammdaten */
    private Predicate<SchuelerStammdaten> plSchuelerStammdatenGeschlecht = 
        (SchuelerStammdaten daten) -> Geschlecht.fromValue(daten.geschlecht) != null;

    /** Noch zu erweiterendes Beispiel bez�glich Fehlerinformationen als JSON (anstatt List<Long>) und 
     * sp�ter Umsetzung als generisches L�sung durch Programmierer (!) */
    private Function<List<SchuelerStammdaten>, List<Long>> plListeSchuelerStammdatenGeschlecht =
        (List<SchuelerStammdaten> daten) ->
            daten.stream().map(s -> plSchuelerStammdatenGeschlecht.test(s) ? null : s.id).filter(s -> s != null).toList(); 
    
}

