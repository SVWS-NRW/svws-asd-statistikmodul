# Schueler S0001

Überschrift | Wert
--------------- | ----------------------------------------
Bezeichnung | S0001_Geschlecht
Prüfung | Geschlecht - gültiger Eintrag
Schulform | Alle: 02,04, .... 
Logik | GESCHLECHT ≠ 3, 4, 5, 6
Fehlertext | Individualdaten I: Geschlecht fehlt oder ist unzulässig besetzt. 
Information ASD | Fehlersymbol: A01 Art: H Tabelle: SCHUELER
Information SVWS | DB: schueler.geschlecht 
Schlüssel | [geschlecht](https://github.com/SVWS-NRW/svws-asd-statistikmodul/blob/main/Schluesseltabellen/geschlecht.java)

## Referenzen zum Quellcode

- [Geschlecht](https://github.com/SVWS-NRW/SVWS-Server/blob/dev/svws-core/src/main/java/de/nrw/schule/svws/core/types/Geschlecht.java)
- [SchuelerStammdaten](https://github.com/SVWS-NRW/SVWS-Server/blob/dev/svws-core/src/main/java/de/nrw/schule/svws/core/data/schueler/SchuelerStammdaten.java)
- [Lamba](./PLSchuelerStammdaten.java)
- [Fehlerausgabe](./PLSchuelerStammdatenFehler.java)

## Fehler-JSON
```
{
    "Ziel": "schueler"
    "PL": "Geschlecht"
    "Beschreibung":"Prüfung: Geschlecht - gültiger Eintrag" 

    "Fehlertext": "Individualdaten I: Geschlecht fehlt oder ist unzulässig besetzt."
    "Logik" : " ... "
    "Javacode" : " ... " 
}
```


