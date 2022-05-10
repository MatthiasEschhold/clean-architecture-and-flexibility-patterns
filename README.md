# Flexible Anwendungsarchitektur mit der Clean Architecture - Codebeispiele zur Artikelserie
## Zur Artikelserie

* [Zu Teil 1 in Java Aktuell 2/22](https://www.doag.org/de/home/news/java-aktuell-022022-architektur/)
* Zu Teil 2 in Java Aktuell 3/22: Release 13.05.2022
* Zu Teil 3 in Java Aktuell 2/22: Release 08.07.2022

## Output Adapter Factory

Am Beispiel des Baustein Fahrzeug wird das Output Adapter Factory Pattern beschrieben. Der FahrzeugService ist Konsument einer Adapter-Implementierung des Package [adapter.out](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeug/adapter/out). Hier sind die Factory und die beteiligten Adapter-Implementierung abgelegt.

## Service Strategy

Die Service Strategie ist am Beispiel einer Schnell- und Exaktenbewertung verdeutlicht im Package
[fahrzeugbewertung.strategy.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/strategy/domain/service).

## Service Decorator

Das Service Decorator Pattern wird ebenfalls am Beispiel der Fahrzeugbewertung in Abhängigkeit von drei Nutzergruppen beschrieben. Die Implementierung der Dekorierer befindet sich im Package [fahrzeugbewertung.decorator.domain.service](https://github.com/MatthiasEschhold/clean-architecture-and-flexibility-patterns/tree/main/clean-flexible-architecture-parent/clean-architecture-and-flexibility-patterns/src/main/java/de/clean/architecture/fahrzeugbewertung/decorator/domain/service).

## Hinweis
Der Quellcode hat nur das Ziel, die in der Artikelserie beschriebenen Konzepte zur verdeutlichen. Der Code ist nicht lauffähig.
Der Code sollte kompilieren. 

Zur Verdeutlichung der Verwendung von Dependency Injecton wird die  Library [Google Guice](https://github.com/google/guice/wiki/Motivation) eingesetzt.
Google Guice ist nicht vollständig konfiguriert. Auch hier ist das Ziel "nur" den Einsatz der Verwendung zu verdeutlichen.