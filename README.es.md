# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

Este repositorio ofrece la restricción de fabricación de netherita de DiamondSMP mediante datapacks específicos para cada versión, mods para distintos loaders y un plugin de servidor compatible con Bukkit.

## Qué se desactiva

Los datapacks y el plugin desactivan las recetas de herrería de la armadura de netherita, las hachas, las espadas y, en las versiones que la incluyen, la lanza de netherita. Los picos, las palas y las azadas de netherita siguen pudiéndose fabricar. Los objetos de netherita que ya están en los inventarios o en el mundo, así como los objetos añadidos por mods, no se ven afectados.

## Datapacks

Los datapacks por versión están en [Datapacks](Datapacks). Cada carpeta de versión contiene los archivos del datapack y un ZIP correspondiente a ese rango de versiones. Elige el rango que coincida con tu versión de Minecraft y coloca el ZIP en la carpeta datapacks de tu mundo. Después ejecuta /reload o reinicia el servidor.

Hay datapacks para Minecraft desde la versión 1.16 hasta la 26.3. Cada carpeta incluye su propio archivo pack.mcmeta y la estructura de recetas adecuada para ese rango de versiones.

## Mods

Los JAR de los mods por versión están en [Mods](Mods). Cada carpeta de versión contiene un JAR para ese rango y su contenido extraído. Elige la carpeta que coincida con tu versión de Minecraft e instala el JAR en la carpeta mods del loader correspondiente. El mod para Fabric requiere Fabric API. Los JAR empaquetan datapacks como mods; consulta sus metadatos para ver los loaders y las versiones de juego declarados.

## Plugin de servidor

El código fuente del plugin está en [Plugin](Plugin). Está dirigido a la API de Bukkit y declara compatibilidad con Folia. Se prevé un mismo build para servidores Bukkit, Spigot, Paper y Folia. Se compila contra Spigot API 1.16.5 con bytecode de Java 8.

## Estado de las pruebas

Se han probado todas las versiones de datapacks incluidas en este repositorio. El plugin se ha probado en Bukkit, Spigot, Paper y Folia 26.3. El mod para Fabric se ha probado con Minecraft 1.16.5 (Java 17), 1.17.1, 1.18.2, 1.19.4, 1.20.1, 1.20.5, 1.21, 1.21.11, 26.1 y 26.3. Se requiere Fabric API. Estos resultados corresponden a Fabric; no se han probado otros loaders.

### Compilación

Instala un JDK y Maven, y ejecuta este comando desde la carpeta Plugin:

~~~powershell
mvn package
~~~

El JAR del plugin se genera en Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar. Cópialo a la carpeta plugins del servidor y reinicia el servidor.

Para aplicar esta regla, usa el datapack o el plugin; no es necesario instalar ambos.

## Licencia

Este proyecto está publicado bajo la [licencia MIT](LICENSE).
