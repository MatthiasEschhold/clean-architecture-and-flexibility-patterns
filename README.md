# Flexible Anwendungsarchitektur mit der Clean Architecture - Codebeispiele zur Artikelserie

## Zur Artikelserie

* [Zu Teil 1 in Java Aktuell 2/22](https://www.doag.org/de/home/news/java-aktuell-022022-architektur/)
* [Zu Teil 2 in Java Aktuell 3/22](https://www.doag.org/de/home/news/java-aktuell-3-22-security/)
* Zu Teil 3 in Java Aktuell 4/22: Release 08.07.2022

## Hinweis
Der Quellcode hat nur das Ziel, die in der Artikelserie beschriebenen Konzepte zur verdeutlichen. Der Code ist nicht lauffähig.
Der Code sollte kompilieren.

Zur Verdeutlichung der Verwendung von Dependency Injecton wird die  Library [Google Guice](https://github.com/google/guice/wiki/Motivation) eingesetzt.
Google Guice ist nicht vollständig konfiguriert. Auch hier ist das Ziel "nur" den Einsatz der Verwendung zu verdeutlichen.

## Output Adapter Factory Pattern

Am Beispiel des Baustein Fahrzeug wird das Output Adapter Factory Pattern beschrieben. Der FahrzeugService ist Konsument einer Adapter-Implementierung 
des Package [adapter.out](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeug/adapter/out). Hier sind die Factory und die beteiligten Adapter-Implementierung abgelegt.

## Service Strategy Pattern

Die Service Strategie ist am Beispiel einer Schnell- und Exaktenbewertung verdeutlicht im Package
[fahrzeugbewertung.strategy.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/strategy/domain/service).

## Service Decorator Pattern

Das Service Decorator Pattern wird ebenfalls am Beispiel der Fahrzeugbewertung in Abhängigkeit von drei 
Nutzergruppen beschrieben. Die Implementierung der Dekorierer befindet 
sich im Package [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service).

Ergänzend zu Kapitel 2 ist der FahrzeugbewertungsService als Element der Service Decorator Pattern, 
ebenfalls Konsument des Supporting Services SendEmail.

## Output Adapter Command Facade Pattern

Das Output Adapter Commnd Facade Pattern wird im vgl. zum Artikel nochmal umfangreicher im
Package [fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service).
veranschaulicht. Die folgende Abbildung visualisiert das implementierte Beispiel. Die Command der Fassade
befindet sich im Package [fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service).
Die Fassade für das komplizierte externe Systeme nutzt diese Use Case zur Orchestrierung der fachlichen
Teilfunktionen. Aus Sicht der Kern der Domäne, wird diese Komplexität in der Fassade gekapselt.

![Output Adapter Command Facade](adapterfacade.png)

## Shared Output Adapter Pattern

Zur beispielhaften Beschreibung des Shared Output Adapter Pattern wird das Geschätfsobjekt Fahrzeug verwendet.
Die Fahrzeugdaten werden von einem externen Service abgefragt wird. Zwei Konsumenten,
der Baustein Fahrzeugbewertung [fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
und der Baustein Fahrzeugangebot [fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
benötigen einen unterschiedlichen Umfang der Fahrzeugdaten und führen unabhängige Business Logik auf diesen Daten aus.
Jeder Konsument hat sein Domänenmodell. Der Shared Output Adapter mappt jeweils auf das Domänenmodell
des Konsumenten. Die ausgehenden UseCases, die der Shared Output Adapter implementiert, gehören 
zu den Konsumenten und sind dort in der Paketstruktur verortet 
([Shared Output Adapter](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service),
[Use Case Out der Fahrzeugbewertung](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service),
[Use Case Out des Fahrzeugangebot](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service).

## Supporting Service Pattern

Das Supporting Service Pattern wird am Beispiel eines Service zum versenden von Emails verdeuticht.

Im Package Baustein Ersatzeil [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
befindet sich die Klasse EmailService, die das Interface SendMail implementiert. 
SendMail hat dabei den Charakter eines ausgehenden UseCases und wird vom Domain Service FahrzeugangebotService des Baustein Fahrzeugangebot
[fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
sowie vom dem FahrzeugbewertungsService des Baustein Fahrzeugbewertung (Muster Decorator) [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
verwendet.

## Application Service Pattern

Der Baustein Ersatzteile hat die Aufgabe eine Teileliste zu einem Fahrzeug zu erstellen.
Dabei nutzt der Baustein Ersatzeil [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
den Baustein Fahrzeug [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service)
über den eingehenden UseCase ReadFahrzeug. Die fachliche Beziehung wird über einen 
Application Service (TeilelisteApplicationService) aufgelöst. Dieser ist Abhängig vom Fahrzeug
Baustein und dessen Modell. Der Kern der Domäne von Teileliste bleibt jedoch unabhängig vom Baustein
Fahrzeug.

## Adapter.Out - Usecase.In Pattern

Der FahrzeugangebotService 
([fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service))
enthält die Business Logik für die Erstellung eines rechtsgültigen Angebot
für den Verkauf eines Gebrauchtwagen. Dabei wird der Händlerverkaufswert benötigt, 
der im Baustein Fahrzeugbewertung
([fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service))
berechnet wird. Zur Abbildung der fachlichen Beziehungen zwischen den Bausteinen
wird das Adapter.Out - Usecase.in Pattern eingesetzt.

Im Package
([fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service))
befindet sich der AngebotspreisAdapter, der den ausgehenden UseCase CalcualteAngebotspreis
implementiert. Der AngebotspreisAdapter referenziert einen eingehenden UseCase
([fahrzeugbewertung.facade](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service))
der Fahrzeugbewertung und führt über diesen die Kalulation im Baustein Fahrzeugbewertung durch. 
Durch das Mapping im Adapter,
sind beide Domänen der Bausteinen Fahrzeugangebot und Fahrzeugbewertung technisch voneinander unabhängig.
