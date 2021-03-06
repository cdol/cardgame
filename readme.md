# Quelldateien & Ausführung

`	Die Quelldateien sind abrufbar unter:
**	https://github.com/cdol/cardgame


`	Das Program kann in der Eingabeaufforderung durch: 
**  'mvn compile'
**	'java -cp target/classes GameManager'
`	ausgeführt werden. Dazu muss vorher im Terminal/Eingabeaufforderung in den 'cardgame' Ordner navigiert werden,
`   sowie eine gültige Maven Version eingerichtet sein.


`	Ein einfaches UML-Diagramm finden Sie unter:
**	out/sequence/CardGame.svg


`	Die Quelldateien sind auffindbar in:
**	src/main/java
`	Dies gilt für die JUnit5 Tests in:
**	src/test/java



# Annahmen

Beim Ausführen des Programms wird das Spiel automatisch mit den in 'SimpleCardGame.md' genannten Regeln ohne weitere Nutzerabfrage gestartet.

Die Wertigkeit der Karte 'Ass' wurde auf 14 gesetzt. Je nach Regelsatz ist auch eine Wertigkeit von 1 sinnvoll.



# Erweiterbarkeit & Limitationen

Die Spieleranzahl kann durch hinzufügen weiterer Spieler auf bis zu 10 erweitert werden und ist nach oben durch decksize/(maxplayers\*handsize) limitiert.

Das Kartendeck lässt sich durch Aufruf des Deck-Constructor mit verändertem Parameter schnell auf zB 32 Karten (Skat) reduzieren.

Sollen andere Spielregeln integriert werden, so kann ein weiteres Regelwerk implementiert werden, welches die Größe des Decks und der Spielerhand, 
sowie minimale und maximale Spieleranzahl definiert. Außerdem muss dort die Methode 'int[] score(Player)' zur Auswertung des 
Spielergebnisses geschrieben werden.

In der aktuellen Implementation sind nur Spielmodi vorgesehen, in der einmalig pro Spielrunde die Handkarten jedes Spielers gezogen werden.

Außerdem wurden die Grundsteine für viele Funktionen gelegt, welche noch implementiert wird die maximale Spieleranzahl noch nicht überprüft.

Desweiteren sind wahrscheinlich try/catch Blöcke zumindest um Dinge wie User Input sinnvoll.


**Vielen Dank für diese Aufgabe, ich freue mich auf Ihr Feedback!**