# PLSchuelerGeschlechtGueltig

Überschrift | Wert
--------------- | ----------------------------------------
Bezeichnung | PLSchuelerGeschlechtGueltig
Prüfung | Geschlecht - gültiger Eintrag
Schulform | Alle: 02,04, .... 
Logik | GESCHLECHT ≠ 3, 4, 5, 6
Fehlertext | Individualdaten I: Geschlecht fehlt oder ist unzulässig besetzt. 
Information ASD | Fehlersymbol: A01 Art: H Tabelle: SCHUELER
Information SVWS | DB: schueler.geschlecht 
Bemerkung | Wenn Geschlscht NULL, dann löst der Fehler auch aus.

## Referenzen zum Quellcode

- [Geschlecht](https://github.com/SVWS-NRW/SVWS-Server/blob/dev/svws-core/src/main/java/de/svws_nrw/core/types/Geschlecht.java)
- [SchuelerStammdaten](https://github.com/SVWS-NRW/SVWS-Server/blob/dev/svws-core/src/main/java/de/svws_nrw/core/data/schueler/SchuelerStammdaten.java)
- [Lamba](./PLSchuelerStammdaten.java)
- [Fehlerausgabe](./PLSchuelerStammdatenFehler.java)

## Fehler-JSON
```
{
    "Ziel": "schueler"
    "PL": "geschlechtGueltig"
    "Beschreibung":"Prüfung: Geschlecht - gültiger Eintrag" 

    "Fehlertext": "Individualdaten I: Geschlecht fehlt oder ist unzulässig besetzt." 
}
```


