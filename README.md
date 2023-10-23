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

4. Produkt entfernen: Entferne das teuerste Produkt mit der richtigen Funktion dafür

5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus.


6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.


7. Listen anlegen:
- Lege jetzt jeweils eine Liste mit 
  - allen Produkten 
  - allen Preisen 
  
  an. Dafür gibt es wieder eine Funktion/Schlüsselwort, mit dem du alle keys und alle values einfach aus der map ziehen und in eine neue Variable speichern kannst. 

- Achte darauf, dass es sich bei dieser neuen Variable um den korrekten Datentypen, eine Liste, handelt!

8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map? 

BONUS: Bist du in der Lage, 

- das gesamte Inventar mit Preisen auszudrucken? 

- nur Produkte auszudrucken, deren Preis zB genau 1.49 ist?
- Welche Konstrukte brauchst du hierfür?

</details>

---
<details>
<summary> <b> Woche 3 - Funktionen </b> </summary>

Lagere nun die gesamte Funktionalität, die du programmiert hast, in Funktionen aus.

Sie könnten wie folgt heißen:

- `displayInventory()`
- `addProduct()`
- `updatePrice()`
- `removeProduct()`
- `doesProductExist()`
- `doesPriceExist()`
- `printProductsByPrice()`


Überlege dir, welche Funktionen was für return-Werte brauchen und wo Parameter übergeben werden müssen.
</details>

---

<details>
<summary> <b> Woche 4 - If Else, When </b> </summary>

Schreibe in Funktionen folgende Features:

1. Altersüberprüfung: `purchaseAllowed(name: String, age: Int)` - Prüft, ob Kunde namens `name` mit dem alter `age` über 6 Jahre alt ist. Wenn nicht, wird eine Nachricht gedruckt, dass `name` nochmal mit den Eltern wiederkommen soll.


2. `calculateDiscount(customerAge: Int, isRegularCustomer: Boolean) : Double` - prüft, ob ein Kunde einen Rabatt erhält und rechnet den Rabatt aus nach folgendem Schema: 
   - ist der Kunde über 60 und ein Stammkunde: Rabatt von 60%
   - Kunde nur über 60: Rabatt von 10%
   - Kunde nur Stammkunde: Rabatt von 20%
   - Kunde unter 12: Rabatt von 15%


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


