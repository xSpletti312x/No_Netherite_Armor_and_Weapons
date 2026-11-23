# No Netherite Armor and Weapons

[English](README.md) | [Deutsch](README.de.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [日本語](README.ja.md) | [한국어](README.ko.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [简体中文](README.zh-CN.md)

Este repositório oferece a restrição de criação de itens de netherita do DiamondSMP em datapacks específicos para cada versão, mods para diferentes loaders e um plugin de servidor compatível com Bukkit.

## O que é desativado

Os datapacks e o plugin desativam as receitas de ferraria da armadura de netherita, dos machados, das espadas e, nas versões em que existe, da lança de netherita. Picaretas, pás e enxadas de netherita continuam podendo ser fabricadas.

## Datapacks

Os datapacks específicos por versão estão em [Datapacks](Datapacks). Cada pasta de versão contém os arquivos do datapack e um ZIP correspondente àquela faixa de versões. Escolha a faixa compatível com sua versão do Minecraft e coloque o ZIP na pasta datapacks do seu mundo. Depois execute /reload ou reinicie o servidor.

Há datapacks para Minecraft da versão 1.16 até a 26.3. Cada pasta inclui seu próprio arquivo pack.mcmeta e a estrutura de receitas adequada àquela faixa de versões.

## Mods

Os JARs dos mods por versão estão em [Mods](Mods). Cada pasta de versão contém um JAR para aquela faixa e o conteúdo extraído dele. Escolha a pasta correspondente à sua versão do Minecraft e instale o JAR na pasta mods do loader apropriado. Os JARs empacotam datapacks como mods; consulte os metadados de cada JAR para ver os loaders e as versões de jogo declarados.

## Plugin de servidor

O código-fonte do plugin está em [Plugin](Plugin). Ele é voltado à API Bukkit e declara suporte ao Folia. O mesmo build é destinado a servidores Bukkit, Spigot, Paper e Folia. A compilação usa Spigot API 1.16.5 e bytecode Java 8.

## Status dos testes

As versões dos mods não foram testadas. O plugin foi testado somente no Folia 26.3; a compatibilidade com outros softwares de servidor ou versões do Minecraft não foi verificada.

### Compilação

Instale um JDK e o Maven e execute este comando na pasta Plugin:

~~~powershell
mvn package
~~~

O JAR do plugin será criado em Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar. Copie-o para a pasta plugins do servidor e reinicie o servidor.

Para aplicar essa regra, use o datapack ou o plugin; não é necessário instalar ambos.

## Licença

Este projeto está licenciado sob a [licença MIT](LICENSE).
