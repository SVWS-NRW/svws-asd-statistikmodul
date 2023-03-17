package de.nrw.schule.svws.statistik;

import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.Predicate;

import de.nrw.schule.svws.core.data.schueler.SchuelerStammdaten;
import de.nrw.schule.svws.core.types.Geschlecht;


/**
 * TODO
 */
public class PLSchuelerStammdaten implements Function<List<SchuelerStammdaten>, List<PLSchuelerStammdatenFehler>> {

	/** Die Instanz der PL-Funktion */
	public static final PLSchuelerStammdaten instance = new PLSchuelerStammdaten(); 	
	
	/** Definition eines Predicate für die Überprüfung der Gültigkeit des Geschlechtseintrags bei den Schüler-Stammdaten */
	private Predicate<SchuelerStammdaten> plSchuelerStammdatenGeschlecht = 
		(SchuelerStammdaten daten) -> Geschlecht.fromValue(daten.geschlecht) != null;


	@Override
	public List<PLSchuelerStammdatenFehler> apply(List<SchuelerStammdaten> daten) {
		List<PLSchuelerStammdatenFehler> result = new Vector<>();
		result.addAll(daten.stream().map(s ->  plSchuelerStammdatenGeschlecht.test(s) ? null : new PLSchuelerStammdatenFehler(s).geschlecht()).filter(s -> s != null).toList());
		return result;
	} 

}
