# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

Ce dépôt propose la restriction de fabrication de Netherite de DiamondSMP sous forme de datapacks adaptés à chaque version, de mods pour différents loaders et d’un plugin serveur compatible avec Bukkit.

## Éléments désactivés

Les datapacks et le plugin désactivent les recettes de forge de l’armure en Netherite, des haches, des épées et, dans les versions où il existe, de la lance en Netherite. Les pioches, pelles et houes en Netherite restent fabricables.

## Datapacks

Les datapacks spécifiques à chaque version se trouvent dans [Datapacks](Datapacks). Chaque dossier de version contient les fichiers du datapack et une archive ZIP correspondant à cette plage de versions. Choisissez la plage de versions correspondant à votre version de Minecraft et placez l’archive dans le dossier datapacks de votre monde. Exécutez /reload ou redémarrez le serveur.

Les versions disponibles vont de Minecraft 1.16 à 26.3. Chaque dossier contient son propre fichier pack.mcmeta et l’arborescence de recettes adaptée à cette plage de versions.

## Mods

Les fichiers JAR des mods spécifiques à chaque version se trouvent dans [Mods](Mods). Chaque dossier de version contient un JAR correspondant à cette plage de versions ainsi que son contenu extrait. Choisissez le dossier correspondant à votre version de Minecraft et installez le JAR dans le dossier mods du loader concerné. Ces JAR intègrent des datapacks sous forme de mods ; les loaders et versions du jeu pris en charge sont indiqués dans les métadonnées de chaque JAR.

## Plugin serveur

Le code source du plugin se trouve dans [Plugin](Plugin). Il cible l’API Bukkit et déclare la prise en charge de Folia. Un même build est prévu pour les serveurs Bukkit, Spigot, Paper et Folia. Il est compilé avec l’API Spigot 1.16.5 et produit du bytecode Java 8.

## État des tests

Les versions des mods n’ont pas été testées. Le plugin a uniquement été testé sur Folia 26.3 ; sa compatibilité avec les autres logiciels serveur ou versions de Minecraft n’a pas été vérifiée.

### Compilation

Installez un JDK et Maven, puis exécutez cette commande depuis le dossier Plugin :

~~~powershell
mvn package
~~~

Le JAR du plugin est créé dans Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar. Copiez-le dans le dossier plugins du serveur, puis redémarrez celui-ci.

Pour appliquer cette règle, utilisez le datapack ou le plugin ; les deux ne sont pas nécessaires simultanément.

## Licence

Ce projet est distribué sous la [licence MIT](LICENSE).
