package de.nrw.schule.svws.statistik;

import de.nrw.schule.svws.core.data.schueler.SchuelerStammdaten;
import de.nrw.schule.svws.core.types.Geschlecht;

/**
 * PL-Fehler bei der Prüfungs von Schüler-Stammdaten
 */
public class PLSchuelerStammdatenFehler extends PLFehler {

	private SchuelerStammdaten stammdaten;
	
	public PLSchuelerStammdatenFehler(SchuelerStammdaten stammdaten) {
		super("Prüfung: Geschlecht gültiger Eintrag", SchuelerStammdaten.class.getName(), Geschlecht.class.getName());
		this.stammdaten = stammdaten;
	}

	public PLSchuelerStammdatenFehler geschlecht() {
		this.setFehler("Schüler-Stammdaten: Geschlecht fehlt oder ist ungültig bei dem Schüler mit der ID " + stammdaten.id);
		return this;
	}

}
