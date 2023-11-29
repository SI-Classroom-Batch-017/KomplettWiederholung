<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Wiederholungswoche: Store Programmieren</h3>
<br>



### Beschreibung
Wir werden in diesem Projekt Tag für Tag die Konzepte aus den letzten 6 Wochen Grundlagen der Programmierung zu wiederholen

> #### Hinweise zur Bearbeitung
> - Wir wollen einen virtuellen Store modellieren, das heißt jeden Tag kommen mehr Aufgaben zu den jeweiligen Wochenthemen dazu

<details>
<summary> <b> Woche 1 - Variablen und Datentypen </b> </summary>
  In der 1. Woche haben wir Variablen und Datentypen kennengelernt.

Lege in der `Main.kt` im `src` Ordner folgende Variablen an und denke dir die passenden Variablennamen und Datentypen dazu selber aus:

1. Name des Stores - sei kreativ
2. kurze Beschreibung, welche Art von Produkte es in deinem Store zu kaufen gibt - sei kreativ
3. Eine Filialnummer - dein Store ist der 13. seiner Art in ganz Deutschland
4. den Namen der Person, die den Store leitet - soll über `readln()` eingegeben werden
5. das Alter der Person, die den Store leitet - soll über `readln()` eingegeben werden
6. Information darüber, ob aktuell eine Rabattaktion läuft oder nicht

Danach drucke alle diese Informationen hübsch in der Konsole aus.


</details>

---

<details>
<summary> <b> Woche 2 - Listen und Maps </b> </summary>

Jetzt wollen wir den Umgang mit Listen und Maps üben.

1. Erstelle eine Variable namens `inventar` in der du 5 Produkte mit ihren Preisen anlegst.
- Welche Datenstruktur ist geeignet, um Schlüssel gemeinsam mit Werten anzulegen?
- Welche Datentypen sollten Schlüssel und Werte jeweils haben?

2. Füge jetzt manuell, das heißt mit der richtigen Funktion/Syntax und nicht einfach, indem du die originale Map bearbeitest, folgendes hinzu:

- Ein Produkt namens `iPhone` mit dem Preis `9999.99`
- Ein Produkt namens `Kaugummi` mit dem Preis `2.49`
- Ein Produkt namens `Smoothie` mit dem Preis `4.99`

Um dies zu tun, gibt es 2 unterschiedliche Syntaxen.
Suche in den LiveBeispielen aus der Vorlesung heraus, was die beiden sind. Nutze beide mind. 1x, für das 3. Produkt kannst du die benutzen, die dir besser gefällt.

3. Aktualisierung der Preise: Verringere den Preis von 3 Produkten deiner Wahl um 1.50 Euro.

- Um dies zu tun, gibt es 2 unterschiedliche Syntaxen.
- Suche in den LiveBeispielen aus der Vorlesung heraus, was die beiden sind. Nutze beide mind. 1x, für das 3. Produkt kannst du die benutzen, die dir besser gefällt.

4. Produkt entfernen: Entferne das teuerste Produkt (du musst das Programm nicht rausfinden lassen, welches das teuerste ist, sondern kannst es selbst identifizieren)

5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus. Dafür brauchst du if else.


6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.


7. Listen anlegen:
- Lege jetzt jeweils eine Liste mit
   - allen Produkten
   - allen Preisen

  an. Dafür gibt es wieder eine Funktion/Schlüsselwort, mit dem du alle keys und alle values einfach aus der map ziehen und in eine neue Variable speichern kannst.

- Achte darauf, dass es sich bei dieser neuen Variable um den korrekten Datentypen, eine Liste, handelt!

8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map?


BONUS: Bist du schon in der Lage, 

- das gesamte Inventar mit Preisen Zeile für Zeile auszudrucken? 
- nur alle Produkte auszudrucken, deren Preis zB genau 1.49 ist?
- Welche Konstrukte brauchst du hierfür?

</details>
---
<details>
<summary> <b> Null & Null Safety </b> </summary>

1. Lege eine List<String?> an und füge einige null und nicht-null Werte hinzu. Gib die Liste aus.

2. Verwende den Safe Call Operator, um die Länge jedes Strings in der oben erstellten Liste zu bekommen, ohne dass das Programm abstürzt.

3. Verwende den Elvis Operator, um sicherzustellen, dass die Länge jedes Strings in der Liste einen Wert hat. Wenn der String null ist, soll die Länge als -1 betrachtet werden.

4. Versuche die Länge eines null Strings mit dem Non-Null Assertion Operator zu bekommen und beobachte, was passiert.

5. Verwende if-else Bedingungen, um zu überprüfen, ob eine Variable null ist. Wenn sie null ist, setze sie auf eine Standardzeichenkette und gib die Länge aus. Wenn sie nicht null ist, gib einfach die Länge aus.

6. Verwende repeat um eine Liste von Strings zu erzeugen, die abwechselnd null und nicht-null Werte enthält. Berechne dann die durchschnittliche Länge der nicht-null Strings (hierfür brauchst du eine Schleife oder ein Lambda).

</details>
---
<details>
<summary> <b> Woche 3 - Funktionen </b> </summary>

Lagere nun die gesamte Funktionalität, die du programmiert hast, in Funktionen in der Datei `Functions.kt` aus.

Sie könnten wie folgt heißen:

- `displayStore()`
- `addProduct()`
- `updatePrice()`
- `removeProduct()`
- `doesProductExist()` - soll für alle Produkte, nicht nur Kaugummi funktionieren
- `doesPriceExist()` - soll für alle Preise, nicht nur 1.49 gelten


Überlege dir, welche Funktionen was für return-Werte brauchen und wo Parameter übergeben werden müssen.
</details>

---

<details>
<summary> <b> Woche 4 - If Else, When </b> </summary>

Schreibe folgende Funktionen in `IfElsWhen.kt`:

1. Altersüberprüfung: `purchaseAllowed(name: String, age: Int)` - Prüft, ob Kunde namens `name` mit dem alter `age` über 6 Jahre alt ist. Wenn nicht, wird eine Nachricht gedruckt, dass `name` nochmal mit den Eltern wiederkommen soll.


2. `calculateDiscount(customerAge: Int, isRegularCustomer: Boolean) : Double` - prüft, ob ein Kunde einen Rabatt erhält und rechnet den Rabatt aus nach folgendem Schema:
   - ist der Kunde über 60 und ein Stammkunde: Rabatt von 60%
   - Kunde nur über 60: Rabatt von 10%
   - Kunde nur Stammkunde: Rabatt von 20%
   - Kunde unter 12: Rabatt von 15%
- Der Rabatt soll am Ende zurückgegeben werden! (`return`)


3. Rabattaktionen:
   Die Variable aus Aufgabe 1, die angibt, ob es eine Rabattaktion gibt oder nicht, soll nun nicht einfach manuell gesetzt werden, sondern Logik bekommen.

   - Schreibe eine Funktion `checkDiscountDays`, die einen Wochentag übergeben bekommt und eine passende Nachricht in die Konsole druckt für folgende Szenarien:
      - ist der Wochentag Montag, Mittwoch oder Freitag: es gibt Rabatte.
      - ist der Wochentag Dienstag, Donnerstag oder Samstag: es gibt keine Rabatte
      - ist der Wochentag Sonntag: der Laden hat geschlossen, folglich gibt es keine Rabatte
   - Benutze hierzu  `when`! Gerne auch zur Übung zusätzlich mit `if else` lösen.
   - Speichere das Ergebnis der Funktion am Ende in deine in Aufgabe 1 erstellte Variable.


4. Einkauf: Simuliere einen Einkauf durch einen Kunden. Schreibe dazu eine Funktion `buy(budget: Double, price: Double)`, die folgendes tut:
   - das Kundenbudget und den Preis des Produkts ausdruckt
   - prüft, ob der Kunde genug Geld dabei hat, um sich ein Produkt zu leisten. wenn ja:
      - Den Preis vom Budget abziehen und in einer neuen Variable speichern
      - entsprechende Nachrichten in die Konsole drucken, dass das Produkt gekauft wurde und er Kunde noch x Euro übrig hat
   - wenn nein: Bescheid sagen, dass das Produkt zu teuer ist, weil dem Kunden x Euro fehlen
</details>

---

<details>
<summary> <b> Woche 5 - Schleifen I: Lesende Funktionen </b> </summary>

In der Datei `Data.kt` findest du einige Datenstrukturen mit Produkten/Mitarbeitern.

Durch diese Datenstrukturen wollen wir jeweils mit Schleifen durchgehen.

Schreibe **Funktionen**, die die jeweiligen Aufgaben erfüllen, in die Datei `Schleifen.kt`


1.  Mitarbeiter filtern: Schreibe eine Funktion, die alle Mitarbeiter ausgibt, deren Namen mit einem bestimmten Buchstaben beginnen, welcher der Funktion als `Char` übergeben werden kann. Verwende eine Schleife oder ein passendes Lambda in einer Higher-Order Function. Tipp: es gibt eine Funktion namens `startsWith

2. Längster Produktname pro Kategorie:
   Finde den längsten Produktnamen in jeder Kategorie und gib ihn aus. Du kannst zB eine Schleife verwenden, um durch die Produktkategorien zu iterieren und dann maxBy verwenden, um den längsten Namen in jeder Kategorie zu finden.

3. Produkte nach Kategorien filtern: Schreibe eine Funktion, die Produkte einer bestimmten Kategorie filtert und ausgibt. Der Benutzer sollte die Kategorie auswählen können, und die Funktion sollte die entsprechenden Produkte anzeigen.

4. Mitarbeiterliste alphabetisch sortieren
   Sortiere die Liste der Mitarbeiter alphabetisch und gib sie aus. Du kannst die sorted-Funktion oder eine Schleife verwenden, um die Sortierung durchzuführen.

5. Produkte nach Länge filtern:
   Filtere Produkte in jeder Kategorie basierend auf ihrer Länge (also der Länge ihres Namens). Zum Beispiel könntest du Produkte auswählen, die weniger als 6 Zeichen lang sind. Verwende filter und map, um die Filterung durchzuführen.

6. Gesamtanzahl der Produkte:
   Berechne die Gesamtanzahl der Produkte in allen Kategorien. Du kannst eine Schleife verwenden, um durch die Kategorien und Produkte zu iterieren und die Summe berechnen.

7. Zufälliges Produkt pro Kategorie:
   Schreibe eine Funktion, die zufällig ein Produkt aus jeder Kategorie auswählt und ausgibt. Verwende die random()-Funktion, um ein zufälliges Element aus der Liste von Produkten in jeder Kategorie zu wählen.

8. Produkte nach Anfangsbuchstaben gruppieren:
   Gruppiere die Produkte in jeder Kategorie nach dem Anfangsbuchstaben und gib die Gruppen aus. Zum Beispiel könntest du alle Produkte auflisten, die mit "A" beginnen, dann mit "B" usw. Verwende eine Schleife oder Higher-Order Functions, um die Gruppierung durchzuführen.

9. Anzahl der Produkte pro Kategorie:
   Berechne die Anzahl der Produkte in jeder Kategorie und gib sie aus. Du kannst die count()-Funktion oder eine Schleife verwenden, um die Anzahl der Produkte in jeder Kategorie zu zählen.


</details>

---

<details>
<summary> <b> Woche 5 - Schleifen II: Schreibende Funktionen </b> </summary>

Die Datenstrukturen sind noch nicht bearbeitbar.

Was muss eine List oder Map jeweils sein, damit man darauf auch schreibende Operationen ausführen kann?

Erstelle jeweils eine mutable Kopie von `produktMap` und von `employees`, nenne sie jeweils `cProduktMap` und `cEmployees`. Denk daran, dass die einzelnen Listen in `cProduktMap` auch noch mutable gemacht werden müssen.

Danach führe folgende Operationen in `SchleifenII.kt` durch:

10. Produkte hinzufügen:
    Schreibe eine Funktion, die es den Benutzern ermöglicht, neue Produkte und Kategorien hinzuzufügen. Der Benutzer sollte den Produktnamen und die Kategorie eingeben können, und die Funktion fügt das Produkt zur Map `cProductMap` hinzu.

11. Produkte entfernen:
    Erstelle eine Funktion, die es den Benutzern ermöglicht, Produkte aus den Kategorien zu entfernen. Der Benutzer sollte den Produktnamen und die Kategorie eingeben können, und die Funktion entfernt das Produkt aus der Map `cProductMap`.

12. Produkte sortieren:
    Schreibe eine Funktion, die Produkte in jeder Kategorie alphabetisch sortiert. Du kannst die sort()-Funktion oder eine eigene Sortierlogik verwenden, um die Produkte in jeder Kategorie zu sortieren.

13. Kategorie umbenennen:
    Ermögliche es den Benutzern, den Namen einer Kategorie zu ändern. Der Benutzer sollte die alte und die neue Kategorie eingeben können, und die Funktion aktualisiert die Map `cProductMap`.

14. Produkte in den Warenkorb legen:

Erstelle eine Funktion, die es den Benutzern ermöglicht, Produkte in einen Warenkorb zu legen. Der Warenkorb kann als Mutable List repräsentiert werden. Der Benutzer sollte den Produktnamen und die Anzahl eingeben können, und die Funktion fügt das Produkt mit der entsprechenden Anzahl zum Warenkorb hinzu.

</details>

---

<details>
<summary> <b> Woche 6 - Objektorientierte Programmierung </b> </summary>

Jetzt kommt Objektorientierung ins Spiel.

Committe und pushe bevor du hiermit anfängst deine bisherigen Lösungen! Wir refactoren jetzt den gesamten Code!

Alle unsere Produkte, die bisher jeweils lediglich Strings sind, sollen jetzt in tatsächliche Produkte mit einem Namen und einem Preis umgewandelt werden.

1. Produkt: Erstelle eine neue Datei, die Klasse `Produkt.kt`, der du im Primären Konstruktor die Eigenschaften `bezeichner`, `preis` und `kategorie` gibst.
- Ersetze in unseren Datenstrukturen in der Datei `Data.kt` alle Strings, die zuvor als Platzhalter für richtige Produkte enthalten waren, mit tatsächlichen Produkten.

Jetzt werden einige Fehler auftauchen.

Du musst die meisten deiner bisher Funktionen jetzt so refactoren, dass sie mit dem neuen Datentyp Produkt funktionieren. Behebe alle Fehler.

2. Mitarbeiter: Erstelle eine Klasse `Mitarbeiter.kt`, der du im Primären Konstruktor die Eigenschaften `name` und `alter` gibst.
- Ersetze die Strings in der Liste `mitarbeiter` mit tatsächlichen Instanzen der Klasse Mitarbeiter. Wenn du noch Nerven dazu hast, schreibe dazu eine Funktion, die ein zufälliges Alter zwischen 16 und 70 ausgibt, und rufe diese auf, statt manuell ein Alter bei jedem Mitarbeiter reinzuschreiben.

3. In Produkt, erstelle eine Funktion `printInfo()`, die uns alle Informationen über das Produkt ausdruckt.

4. Erstelle jetzt die Kindklassen Elektronik, Kleidung, Nahrung, Buch und Haushalt, die von Produkt erben und jeweils ihre Kategorie als String in der Variable `kategorie` als Default Wert stehen haben.


</details>
Viel Erfolg!
