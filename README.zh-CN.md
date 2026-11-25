# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

本仓库提供 DiamondSMP 的下界合金合成限制，包含按 Minecraft 版本区分的数据包、适用于不同加载器的模组，以及兼容 Bukkit 的服务器插件。

## 禁用的配方

数据包和插件会禁用下界合金盔甲、斧、剑，以及在相应版本中存在的下界合金长矛的锻造配方。下界合金镐、铲和锄仍可制作。 已存在的下界合金物品以及模组添加的物品均不受影响。

## 数据包

各版本的数据包位于 [Datapacks](Datapacks)。每个版本文件夹都包含数据包文件，以及对应此版本范围的 ZIP 文件。请选择与 Minecraft 版本匹配的版本范围，并将 ZIP 放入世界存档的 datapacks 文件夹。然后执行 /reload 或重启服务器。

数据包覆盖 Minecraft 1.16 至 26.3。每个文件夹都有自己的 pack.mcmeta，以及适用于该版本范围的配方目录结构。

## 模组

各版本的模组 JAR 位于 [Mods](Mods)。每个版本文件夹包含对应此版本范围的 JAR 文件及其解压后的内容。请选择与 Minecraft 版本匹配的文件夹，并将 JAR 安装到相应模组加载器的 mods 文件夹。Fabric 模组需要 Fabric API。JAR 将数据包封装为模组；支持的加载器和游戏版本请查看各 JAR 内的元数据。

## 服务器插件

插件源代码位于 [Plugin](Plugin)。插件面向 Bukkit API，并声明支持 Folia；同一个构建版本旨在用于 Bukkit、Spigot、Paper 和 Folia 服务器。它使用 Spigot API 1.16.5 编译为 Java 8 字节码。

## 测试状态

本仓库中的所有数据包版本均已测试。插件已在 Bukkit、Spigot、Paper 和 Folia 26.3 上测试。Fabric 模组已在 Minecraft 1.16.5（Java 17）、1.17.1、1.18.2、1.19.4、1.20.1、1.20.5、1.21、1.21.11、26.1 和 26.3 上测试。需要 Fabric API。这些测试结果仅适用于 Fabric；其他加载器尚未测试。

### 构建

安装 JDK 和 Maven，然后在 Plugin 文件夹中运行：

~~~powershell
mvn package
~~~

插件 JAR 会生成在 Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar。将其复制到服务器的 plugins 文件夹并重启服务器。

应用此限制时，使用数据包或插件其中之一即可，无需同时安装两者。

## 许可证

本项目采用 [MIT 许可证](LICENSE)。
