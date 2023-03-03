# Lehrer L01

Überschrift | Wert
--------------- | ----------------------------------------
Bezeichnung | L0001_LIDKuerzel
Prüfung | LID-Kürzel - gültiger Eintrag
Schulform | Alle: 02,04, .... 
Logik | 1te Stelle LIDKRZ = @ <br> ODER 1te Stelle LIDKRZ kein Großbuchstabe   <br> ODER 2te-4te Stelle LIDKRZ kein Großbuchstabe, Zahl, Strich oder „leer“
Fehlertext | Lehrkräfte/ Basisdaten: LID-Kürzel muss linksbündig stehen, 1. Stelle muss ein Großbuchstabe sein. Wenn die folgenden Stellen verwendet werden, muss es sich um Großbuchstaben, Zahlen oder einen Bindestrich handeln.  
Information ASD | Fehlersymbol: LBA01 <br> Art: H <br> Tabelle: LEHRER
Information SVWS | DB: nn.nn


## JSON
```
{
    "Ziel": "schueler"
    "PL": "Geschlecht"
    "Beschreibung":"Prüfung: Geschlecht - gültiger Eintrag" 

    "Fehlertext": "Lehrkräfte/ Basisdaten: LID-Kürzel muss linksbündig stehen, 1. Stelle muss ein Großbuchstabe sein. Wenn die folgenden Stellen verwendet werden, muss es sich um Großbuchstaben, Zahlen oder einen Bindestrich handeln. "
    "Logik" : " ... "
    "Javacode" : " ... " 
}
```

