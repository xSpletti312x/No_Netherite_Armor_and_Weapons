# No Netherite Armor and Weapons

[English](README.md) | [Deutsch](README.de.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [日本語](README.ja.md) | [한국어](README.ko.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [简体中文](README.zh-CN.md)

To repo udostępnia ograniczenie wytwarzania przedmiotów z netherytu z DiamondSMP w postaci datapacków dla poszczególnych wersji, modów dla różnych loaderów oraz pluginu serwerowego zgodnego z Bukkit.

## Wyłączone receptury

Datapacki i plugin wyłączają receptury kowalskie dla netherytowej zbroi, toporów, mieczy oraz — w wersjach, w których występuje — netherytowej włóczni. Netherytowe kilofy, łopaty i motyki nadal można wytwarzać.

## Datapacki

Datapacki dla poszczególnych wersji znajdują się w [Datapacks](Datapacks). Każdy folder wersji zawiera pliki datapacka i archiwum ZIP dla danego zakresu wersji. Wybierz zakres zgodny z wersją Minecrafta i umieść ZIP w folderze datapacks swojego świata. Następnie wykonaj /reload lub uruchom ponownie serwer.

Datapacki są dostępne dla Minecrafta od wersji 1.16 do 26.3. Każdy folder zawiera własny plik pack.mcmeta oraz układ folderów receptur odpowiedni dla danego zakresu wersji.

## Mody

JAR-y modów dla poszczególnych wersji znajdują się w [Mods](Mods). Każdy folder wersji zawiera JAR dla danego zakresu oraz jego rozpakowaną zawartość. Wybierz folder zgodny z wersją Minecrafta i zainstaluj JAR w folderze mods odpowiedniego loadera. JAR-y zawierają datapacki opakowane jako mody; deklarowane loadery i wersje gry znajdziesz w metadanych każdego JAR-a.

## Plugin serwerowy

Kod źródłowy pluginu znajduje się w [Plugin](Plugin). Plugin korzysta z Bukkit API i deklaruje obsługę Folia. Ta sama kompilacja jest przeznaczona dla serwerów Bukkit, Spigot, Paper i Folia. Jest kompilowany z użyciem Spigot API 1.16.5 do bajtkodu Java 8.

## Status testów

Wersje modów nie były testowane. Plugin był testowany wyłącznie na Folia 26.3; zgodność z innym oprogramowaniem serwerowym lub innymi wersjami Minecrafta nie została potwierdzona.

### Budowanie

Zainstaluj JDK i Maven, a następnie uruchom to polecenie w folderze Plugin:

~~~powershell
mvn package
~~~

JAR pluginu zostanie utworzony w Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar. Skopiuj go do folderu plugins serwera i uruchom serwer ponownie.

Aby zastosować tę zasadę, użyj datapacka albo pluginu; instalowanie obu jednocześnie nie jest konieczne.

## Licencja

Projekt jest udostępniany na [licencji MIT](LICENSE).
