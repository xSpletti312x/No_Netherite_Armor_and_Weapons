# Minecraft Datapack – No Netherite Armor and Weapons

This datapack modifies/overrides the smithing table recipes (`netherite_axe_smithing.json`, `netherite_boots_smithing.json`, `netherite_chestplate_smithing.json`, `netherite_helmet_smithing.json`, `netherite_leggings_smithing.json`, and `netherite_sword_smithing.json`) for Netherite gear.

## Compatibility
* **Minecraft Java Edition:** Down to **1.16** (compatible with versions from 1.16 onward, depending on the `data/minecraft/recipe/` folder naming and recipe format).
* *Note:* Minecraft versions before 1.21 used the plural folder `recipes/` instead of `recipe/`, and 1.20+ introduced smithing templates—ensure the folder path and JSON structure match your target version if needed.

## Installation
1. Download the datapack `.zip` archive (`no_netherite_armor_and_weapons 26.3.zip`).
2. Open your Minecraft world folder (`saves/<WorldName>/datapacks/`).
3. Place the `.zip` file inside (do not extract it).
4. Join the world or run `/reload` in-game.

## Structure
```text
├── pack.mcmeta
└── data/
    └── minecraft/
        └── recipe/
            ├── netherite_axe_smithing.json
            ├── netherite_boots_smithing.json
            ├── netherite_chestplate_smithing.json
            ├── netherite_helmet_smithing.json
            ├── netherite_leggings_smithing.json
            └── netherite_sword_smithing.json
```

## License
This project is licensed under the [MIT License](LICENSE).
