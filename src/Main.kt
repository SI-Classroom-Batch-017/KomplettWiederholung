
fun main() {
    //TODO Aufgabe 1: Variablen und Datentypen
    val storeName = "MeinStore"
    val storeDescription = "Ein virtueller Store mit tollen Produkten"
    val branchNumber = 13

    print("Geben Sie den Namen des Store-Leiters ein: ")
    val storeManagerName = readln()

    print("Geben Sie das Alter des Store-Leiters ein: ")
    val storeManagerAge = readln().toInt()

    val isDiscountAvailable = true

    println("Willkommen bei $storeName!")
    println("Unser Store bietet $storeDescription an.")
    println("Filialnummer: $branchNumber")
    println("Store-Leiter: $storeManagerName, Alter: $storeManagerAge Jahre")
    println("Rabattaktion läuft: $isDiscountAvailable")




    // Aufgabe 2: Listen, Maps und Sets
    // Erstelle eine Variable namens inventar in der du 5 Produkte mit ihren Preisen anlegst.
    val inventar = mutableMapOf(
        "Apfel" to 1.0,
        "Banane" to 0.5,
        "Orange" to 0.75,
        "Erdbeere" to 2.0,
        "Kiwi" to 1.25
    )

    // Füge jetzt manuell, das heißt mit der richtigen Funktion/Syntax und nicht einfach, indem du die originale Map bearbeitest, folgendes hinzu:
    inventar["iPhone"] = 9999.99
    inventar.put("Kaugummi", 2.49)
    inventar["Smoothie"] = 4.99

    // verringere den Preis von 3 Produkten deiner Wahl um 1.50 Euro
    inventar["Erdbeere"] = inventar["Erdbeere"]!!-1.5

    // Entferne das teuerste Produkt (du musst das Programm nicht rausfinden lassen, welches das teuerste ist, sondern kannst es selbst identifizieren)
    inventar.remove("iPhone")


    //5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus. Dafür brauchst du if else.
    if (inventar.containsKey("Kaugummi")) {
        println("Kaugummi ist im Inventar.")
    } else {
        println("Kaugummi ist nicht im Inventar.")
    }

    //6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.
    if (inventar.containsValue(1.49)) {
        println("Ein Produkt kostet 1.49 Euro.")
    } else {
        println("Kein Produkt kostet 1.49 Euro.")
    }

//    7. Listen anlegen: Lege jetzt jeweils eine Liste an mit
//       - allen Produkten
//       - allen Preisen

    val products = inventar.keys.toList()
    val prices = inventar.values.toList()

    println("Produkte: $products")
    println("Preise: $prices")


    // 8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map?
    // --> Set enthält keine Doppelungen, keine Indizes, wie eine Liste wo alle doppelten Werte rausgefiltert werden





}

