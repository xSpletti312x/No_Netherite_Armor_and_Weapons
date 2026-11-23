# No Netherite Armor and Weapons

[English](README.md) | [Español](README.es.md) | [Français](README.fr.md) | [Italiano](README.it.md) | [Deutsch](README.de.md) | [Polski](README.pl.md) | [Português (Brasil)](README.pt-BR.md) | [Русский](README.ru.md) | [한국어](README.ko.md) | [简体中文](README.zh-CN.md) | [日本語](README.ja.md)

이 저장소는 DiamondSMP의 네더라이트 제작 제한을 버전별 데이터팩, 여러 로더용 모드, Bukkit 호환 서버 플러그인으로 제공합니다.

## 비활성화되는 항목

데이터팩과 플러그인은 네더라이트 방어구, 도끼, 검의 대장장이 제작법과 해당 아이템이 있는 버전의 네더라이트 창 제작법을 비활성화합니다. 네더라이트 곡괭이, 삽, 괭이는 계속 제작할 수 있습니다.

## 데이터팩

버전별 데이터팩은 [Datapacks](Datapacks)에 있습니다. 각 버전 폴더에는 데이터팩 파일과 해당 버전 범위용 ZIP 파일이 들어 있습니다. Minecraft 버전에 맞는 범위를 선택해 ZIP을 월드의 datapacks 폴더에 넣으세요. 그런 다음 /reload를 실행하거나 서버를 다시 시작하세요.

Minecraft 1.16부터 26.3까지의 데이터팩이 제공됩니다. 각 폴더에는 해당 버전 범위에 맞는 pack.mcmeta와 레시피 폴더 구조가 포함되어 있습니다.

## 모드

버전별 모드 JAR은 [Mods](Mods)에 있습니다. 각 버전 폴더에는 해당 범위용 JAR과 압축 해제된 파일이 들어 있습니다. Minecraft 버전에 맞는 폴더를 선택해 해당 모드 로더의 mods 폴더에 JAR을 설치하세요. 이 JAR은 데이터팩을 모드로 패키징한 것입니다. 지원 로더와 게임 버전은 각 JAR의 메타데이터에서 확인하세요.

## 서버 플러그인

플러그인 소스 코드는 [Plugin](Plugin)에 있습니다. Bukkit API를 대상으로 하며 Folia 지원을 선언합니다. Bukkit, Spigot, Paper, Folia 서버용으로 동일한 빌드를 사용할 수 있도록 제작되었습니다. Spigot API 1.16.5를 기준으로 Java 8 바이트코드로 컴파일됩니다.

## 테스트 상태

모드 버전은 테스트되지 않았습니다. 플러그인은 Folia 26.3에서만 테스트되었습니다. 다른 서버 소프트웨어나 Minecraft 버전과의 호환성은 확인되지 않았습니다.

### 빌드

JDK와 Maven을 설치한 뒤 Plugin 폴더에서 다음 명령을 실행하세요.

~~~powershell
mvn package
~~~

플러그인 JAR은 Plugin/target/No_Netherite_Armor_And_Weapons-1.0.0.jar에 생성됩니다. 서버의 plugins 폴더에 복사한 뒤 서버를 재시작하세요.

이 규칙을 적용하려면 데이터팩 또는 플러그인 중 하나를 사용하면 됩니다. 둘 다 설치할 필요는 없습니다.

## 라이선스

이 프로젝트는 [MIT 라이선스](LICENSE)로 배포됩니다.
