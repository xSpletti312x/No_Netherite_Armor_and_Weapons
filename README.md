# No Netherite Armor and Weapons

This repository provides the DiamondSMP netherite crafting restriction as both version-specific datapacks and a Bukkit-compatible server plugin.

## What is disabled

The datapacks and plugin disable smithing recipes for netherite armor, axes, swords, and the netherite spear on versions that have it. Netherite pickaxes, shovels, and hoes remain craftable.

## Datapacks

Version-specific datapacks are in [`Datapacks/DiamondSMP`](Datapacks/DiamondSMP). Choose the folder matching your Minecraft version and place that folder (or a ZIP of its contents) in the world's `datapacks` directory. Run `/reload` or restart the server.

The available pack folders cover Minecraft 1.16 through 26.3. Each folder has its own `pack.mcmeta` and the correct recipe directory layout for that version range.

## Server plugin

The plugin source is in [`Plugin`](Plugin). It targets the Bukkit API and declares Folia support, so one build is intended for Bukkit, Spigot, Paper, and Folia servers. It is compiled against Spigot API 1.16.5 with Java 8 bytecode; compatibility across every server release from 1.16 through 26.3 has not yet been verified on a full version matrix.

### Build

Install a JDK and Maven, then run from the `Plugin` directory:

```powershell
mvn package
```

The plugin JAR is created at `Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar`. Copy it into the server's `plugins` directory and restart the server.

Use either the datapack or plugin for this rule; installing both is unnecessary.

## License

This project is licensed under the [MIT License](LICENSE).
