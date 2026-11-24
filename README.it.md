# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

Questo repository offre la restrizione alla creazione di oggetti in netherite di DiamondSMP tramite datapack specifici per versione, mod per diversi loader e un plugin server compatibile con Bukkit.

## Ricette disabilitate

I datapack e il plugin disabilitano le ricette di forgiatura per l’armatura in netherite, le asce, le spade e, nelle versioni in cui è presente, la lancia in netherite. Picconi, pale e zappe in netherite restano fabbricabili.

## Datapack

I datapack specifici per versione si trovano in [Datapacks](Datapacks). Ogni cartella di versione contiene i file del datapack e un archivio ZIP per il relativo intervallo di versioni. Scegli l’intervallo compatibile con la tua versione di Minecraft e inserisci lo ZIP nella cartella datapacks del mondo. Poi esegui /reload o riavvia il server.

Sono disponibili datapack per Minecraft dalla versione 1.16 alla 26.3. Ogni cartella contiene il proprio file pack.mcmeta e la struttura delle ricette corretta per quell’intervallo.

## Mod

I JAR delle mod specifiche per versione si trovano in [Mods](Mods). Ogni cartella di versione contiene un JAR per quell’intervallo e il contenuto estratto. Scegli la cartella corrispondente alla tua versione di Minecraft e installa il JAR nella cartella mods del loader appropriato. La mod per Fabric richiede Fabric API. I JAR includono datapack come mod; nei metadati di ciascun JAR sono indicati i loader e le versioni di gioco dichiarati.

## Plugin server

Il codice sorgente del plugin si trova in [Plugin](Plugin). È basato sulla Bukkit API e dichiara il supporto a Folia. Lo stesso build è destinato ai server Bukkit, Spigot, Paper e Folia. È compilato con Spigot API 1.16.5 e bytecode Java 8.

## Stato dei test

Sono state testate tutte le versioni dei datapack presenti in questo repository. Il plugin è stato testato su Bukkit, Spigot, Paper e Folia 26.3. La mod per Fabric è stata testata con Minecraft 1.20.5 e 1.21. Le altre versioni delle mod e combinazioni di loader non sono state testate.

### Compilazione

Installa un JDK e Maven, poi esegui questo comando dalla cartella Plugin:

~~~powershell
mvn package
~~~

Il JAR del plugin viene creato in Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar. Copialo nella cartella plugins del server e riavvia il server.

Per applicare questa regola, usa il datapack oppure il plugin; non è necessario installarli entrambi.

## Licenza

Questo progetto è distribuito con la [licenza MIT](LICENSE).
