package de.nrw.schule.svws.statistik;

/**
 * Allgemeine Klasse zur Beschreibung von PL-Fehlern
 */
public class PLFehler {

	/// Eine textuelle Beschreibung der PL-Prüfung
	private final String plBeschreibung;
	
	/// Die Daten-Klassen, auf die sich der PL-Fehler bezieht
	private final String plDatenKlasse;
	
	/// Ggf. ein Core-Type, welcher der PL-Prüfung zugrunde liegt - oder null
	private final String plCoreType;
	
	/// Die textuelle Fehlerrückmeldung - muss gesetzt werden! 
	private String plFehler = null;

	
	/**
	 * Erstellt ein neues PL-Fehler-Objekt
	 * 
	 * @param plBeschreibung  eine textuelle Beschreibung der PL-Prüfung
	 * @param plDatenKlasse   die Daten-Klassen, auf die sich der PL-Fehler bezieht
	 * @param plCoreType      ggf. ein Core-Type, welcher der PL-Prüfung zugrunde liegt - oder null
	 */
	public PLFehler(String plBeschreibung, String plDatenKlasse, String plCoreType) {
		this.plBeschreibung = plBeschreibung;
		this.plDatenKlasse = plDatenKlasse;
		this.plCoreType = plCoreType;
	}

	
	/**
	 * TODO
	 */
	public void setFehler(String fehler) {
		this.plFehler = fehler;
	}
	

	/**
	 * TODO
	 */
	public String getPlBeschreibung() {
		return plBeschreibung;
	}


	/**
	 * TODO
	 */
	public String getPlDatenKlasse() {
		return plDatenKlasse;
	}


	/**
	 * TODO
	 */
	public String getPlCoreType() {
		return plCoreType;
	}


	/**
	 * TODO
	 */
	public String getPlFehler() {
		return plFehler;
	}

}
