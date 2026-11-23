# No Netherite Armor and Weapons

[English](README.md) | [Deutsch](README.de.md) | [Español](README.es.md) | [Français](README.fr.md) | [日本語](README.ja.md) | [简体中文](README.zh-CN.md)

このリポジトリでは、DiamondSMP のネザライト装備のクラフト制限を、Minecraft のバージョン別データパック、各種ローダー用 Mod、Bukkit 互換サーバープラグインとして提供しています。

## 無効になるレシピ

データパックとプラグインは、ネザライト防具、斧、剣、および存在するバージョンではネザライトの槍の鍛冶レシピを無効にします。ネザライトのツルハシ、シャベル、クワは引き続き作成できます。

## データパック

バージョン別データパックは [Datapacks](Datapacks) にあります。各バージョンのフォルダーには、データパック本体とそのバージョン範囲に対応する ZIP ファイルが入っています。Minecraft のバージョンに合う範囲を選び、ZIP をワールドの datapacks フォルダーに入れてください。その後 /reload を実行するか、サーバーを再起動します。

Minecraft 1.16 から 26.3 までのデータパックがあります。各フォルダーには専用の pack.mcmeta と、そのバージョン範囲に合ったレシピのフォルダー構成が含まれています。

## Mod

バージョン別 Mod の JAR は [Mods](Mods) にあります。各バージョンのフォルダーには、その範囲に対応する JAR と展開済みファイルが入っています。Minecraft のバージョンに合ったフォルダーを選び、対応する Mod ローダーの mods フォルダーに JAR を入れてください。これらの JAR はデータパックを Mod としてまとめたものです。対応ローダーとゲームバージョンは各 JAR のメタデータを確認してください。

## サーバープラグイン

プラグインのソースコードは [Plugin](Plugin) にあります。Bukkit API を対象とし、Folia 対応を宣言しています。Bukkit、Spigot、Paper、Folia サーバー向けに同じビルドを使用する想定です。Spigot API 1.16.5 を使って Java 8 バイトコードとしてコンパイルされています。

## テスト状況

各バージョンの Mod はテストされていません。プラグインは Folia 26.3 でのみテスト済みです。それ以外のサーバーソフトウェアや Minecraft バージョンとの互換性は確認されていません。

### ビルド

JDK と Maven をインストールし、Plugin フォルダーで次のコマンドを実行します。

~~~powershell
mvn package
~~~

プラグイン JAR は Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar に作成されます。サーバーの plugins フォルダーにコピーして、サーバーを再起動してください。

この制限を適用するには、データパックかプラグインのどちらかを使用してください。両方を同時に導入する必要はありません。

## ライセンス

このプロジェクトは [MIT ライセンス](LICENSE) のもとで公開されています。
