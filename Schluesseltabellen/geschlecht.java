/**
 * Der Core-Type für die zulässigen Arten des Geschlechts.
 */
public enum Geschlecht {

	/** Männlich mit Statistikcode 3 */
	M(3, "m", "männlich", "männlich"), 
	
	/** weiblich mit Statistikcode 4 */
	W(4, "w", "weiblich", "weiblich"), 
	
	/** divers mit Statistikcode 5 */
	D(5, "d", "divers", "divers"),
	
	/** ohne Angabe mit Statistikcode 6 */
	X(6, "x", "ohne Angabe", "ohne Angabe im Geburtenregister");


	/** Die ID des Geschlechtes, welche im Rahmen der amtlichen Schulstatistik verwendet wird. */
    public final int id;
    
    /** Das Geschlecht als einstelliges Kürzel */
    public final @NotNull String kuerzel;
    
    /** Die Kurz-Bezeichnung des Geschlechtes */
    public final @NotNull String text;
 
    /** Die ausführliche Bezeichnung des Geschlechtes */
    public final @NotNull String textLang;
