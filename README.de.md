# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

Dieses Repository enthält versionsspezifische Umsetzungen der Netherite-Crafting-Beschränkung von DiamondSMP: Datapacks, Mods für verschiedene Loader und ein Bukkit-kompatibles Server-Plugin. Dateien und Quellcode sind nach Minecraft-Version in diesem Repository organisiert.

## Funktionsweise

Die Datapacks, Mods und das Plugin deaktivieren die Crafting-Rezepte für Netherite-Rüstung, Äxte, Schwerter sowie Netherite-Speere in Versionen, in denen es sie gibt. Netherite-Spitzhacken, -Schaufeln und -Hacken bleiben herstellbar.

Das Projekt ändert nur Rezepte. Netherite-Gegenstände, die Spieler bereits besitzen oder die in der Welt liegen, werden nicht entfernt. Auch von Mods hinzugefügte Items sind nicht betroffen.

Verwende pro Welt/Server nur eine Umsetzung (Datapack, Mod oder Plugin), damit sich Rezeptänderungen nicht überschneiden.

## Datapacks

Versionsspezifische Datapacks und Quelldateien liegen in [Datapacks](Datapacks). Jeder Ordner `Datapack-<version>` enthält die Pack-Dateien und eine ZIP-Datei namens `no_netherite_armor_and_weapons-Datapack-<version>.zip`.

Wähle den passenden Versionsbereich für Minecraft und lege die ZIP-Datei **ohne Entpacken** in den `datapacks`-Ordner der Welt. Führe `/reload` aus oder starte den Server neu. Das Repository enthält Versionen von Minecraft 1.16 bis 26.3, mit passenden `pack.mcmeta`-Dateien und Rezept-Ordnerstrukturen.

## Mods

Versionsspezifische Mod-JARs und deren entpackte Inhalte liegen in [Mods](Mods). Installiere die JAR, die sowohl zur Minecraft-Version als auch zum Mod-Loader passt, im Ordner `mods`. Die Fabric-Mod benötigt Fabric API. Die JARs verpacken Datapacks als Mods; unterstützte Spielversionen und Loader stehen in den Metadaten der jeweiligen JAR.

## Server-Plugin

Der Plugin-Quellcode liegt in [Plugin](Plugin). Das Plugin basiert auf der Bukkit-API und deklariert Folia-Unterstützung. Derselbe Plugin-Build ist für Bukkit-, Spigot-, Paper- und Folia-Server vorgesehen. Er wird mit der Spigot-API 1.16.5 kompiliert und erzeugt Java-8-Bytecode.

Installiere ein JDK und Maven und führe den folgenden Befehl im Ordner `Plugin` aus:

```powershell
mvn package
```

Die fertige JAR wird unter `Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar` erstellt.

## Teststatus

Alle in diesem Repository veröffentlichten Datapack-Versionen wurden getestet.

Die Fabric-Mod wurde mit Minecraft 1.16.5 (Java 17), 1.17.1, 1.18.2, 1.19.4, 1.20.1, 1.20.5, 1.21, 1.21.11, 26.1 und 26.3 getestet. Fabric API wird benötigt. Andere Mod-Loader wurden nicht getestet.

Das Plugin wurde auf Bukkit, Spigot, Paper und Folia 26.3 getestet.

## Lizenz

Dieses Projekt steht unter der [MIT-Lizenz](LICENSE).
