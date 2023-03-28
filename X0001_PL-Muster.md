# Schueler S01

Bezeichnung | Wert
--------------- | ----------------------------------------
PL-ID | X0001_sprechendeBeschreibung
Prüfung | Merkmal - Prüfbeschreibung
Schulform | Schulformkuerzel 
Logik | PL in Logiknotation
Fehlertext | Datenart: Text des Fehlers für den User. 
Information ASD | Fehlersymbol: X00001 <br>   Art: H,M,K <br>  Tabelle: Tabellenname
Information SVWS | DB: tabelle.feldname 


## JSON
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

