# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md) | [Polski](README.pl.md)

Dieses Repository enthält die Netherite-Crafting-Beschränkung von DiamondSMP als versionsspezifische Datapacks, Loader-Mods und Bukkit-kompatibles Server-Plugin.

## Was wird deaktiviert?

Die Datapacks und das Plugin deaktivieren die Schmiederezepte für Netherite-Rüstung, Äxte, Schwerter und – in Versionen, in denen es sie gibt – den Netherite-Speer. Netherite-Spitzhacken, -Schaufeln und -Hacken bleiben herstellbar.

## Datapacks

Die versionsspezifischen Datapacks liegen in [Datapacks](Datapacks). Jeder Versionsordner enthält die Datapack-Dateien und eine ZIP-Datei für den jeweiligen Versionsbereich. Wähle den passenden Versionsbereich und lege die ZIP-Datei in den datapacks-Ordner deiner Welt. Führe anschließend /reload aus oder starte den Server neu.

Die verfügbaren Versionen reichen von Minecraft 1.16 bis 26.3. Jeder Ordner enthält eine eigene pack.mcmeta und die passende Rezept-Ordnerstruktur.

## Mods

Die versionsspezifischen Mod-JARs liegen in [Mods](Mods). Jeder Versionsordner enthält eine Mod-JAR für den jeweiligen Versionsbereich sowie deren entpackte Inhalte. Installiere die JAR aus dem Ordner, dessen Versionsbereich zu deiner Minecraft-Version passt, im mods-Ordner des passenden Mod-Loaders. Die JARs verpacken Datapacks als Mods; unterstützte Loader und Spielversionen stehen in den Metadaten der jeweiligen JAR.

## Server-Plugin

Der Plugin-Quellcode liegt in [Plugin](Plugin). Das Plugin basiert auf der Bukkit-API und deklariert Folia-Unterstützung. Ein Build ist für Bukkit-, Spigot-, Paper- und Folia-Server vorgesehen. Es wird mit der Spigot-API 1.16.5 und Java-8-Bytecode kompiliert.

## Teststatus

Die Mod-Versionen wurden nicht getestet. Das Plugin wurde ausschließlich auf Folia 26.3 getestet; die Kompatibilität mit anderer Serversoftware oder anderen Minecraft-Versionen wurde nicht bestätigt.

### Bauen

Installiere ein JDK und Maven und führe im Ordner Plugin folgenden Befehl aus:

~~~powershell
mvn package
~~~

Die Plugin-JAR wird unter Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar erstellt. Kopiere sie in den plugins-Ordner des Servers und starte ihn neu.

Verwende für diese Regel entweder das Datapack oder das Plugin; beides gleichzeitig ist nicht erforderlich.

## Lizenz

Dieses Projekt steht unter der [MIT-Lizenz](LICENSE).
