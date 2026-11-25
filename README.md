# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

This repository contains version-specific implementations of the DiamondSMP Netherite crafting restriction: datapacks, loader mods, and a Bukkit-compatible server plugin. The files and source are organized by Minecraft version in this repository.

## Behavior

The datapacks, mods, and plugin disable crafting recipes for Netherite armor, axes, swords, and Netherite spears in versions that include them. Netherite pickaxes, shovels, and hoes remain craftable.

This project changes recipes only. It does not remove Netherite items already held by players or stored in the world, and it does not affect items added by other mods.

Use only one implementation (datapack, mod, or plugin) for a given world/server to avoid overlapping recipe changes.

## Datapacks

Version-specific datapacks and source files are in [Datapacks](Datapacks). Each `Datapack-<version>` folder contains the pack files and a ZIP named `no_netherite_armor_and_weapons-Datapack-<version>.zip`.

Choose the version range matching the Minecraft version, then place the ZIP—without extracting it—in the world's `datapacks` directory. Run `/reload` or restart the server. The repository contains versions from Minecraft 1.16 through 26.3, with version-appropriate `pack.mcmeta` files and recipe directory layouts.

## Mods

Version-specific mod JARs and their extracted contents are in [Mods](Mods). Install the JAR matching both the Minecraft version and mod loader in the `mods` directory. The Fabric mod requires Fabric API. The JARs package datapacks as mods; check each JAR's metadata for its declared game versions and loader support.

## Server plugin

The plugin source is in [Plugin](Plugin). It targets the Bukkit API and declares Folia support. The same plugin build is intended for Bukkit, Spigot, Paper, and Folia servers. It is compiled against Spigot API 1.16.5 and produces Java 8 bytecode.

To build it, install a JDK and Maven, then run from the `Plugin` directory:

```powershell
mvn package
```

The resulting JAR is created at `Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar`.

## Testing status

All datapack versions published in this repository have been tested.

The Fabric mod has been tested on Minecraft 1.16.5 (Java 17), 1.17.1, 1.18.2, 1.19.4, 1.20.1, 1.20.5, 1.21, 1.21.11, 26.1, and 26.3. Fabric API is required. Other mod-loader versions have not been tested.

The plugin has been tested on Bukkit, Spigot, Paper, and Folia 26.3.

## License

This project is licensed under the [MIT License](LICENSE).
