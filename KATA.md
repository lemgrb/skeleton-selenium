# Kata

Use these steps to recreate this framework as practice.

## Project setup

1. Create new mvn project using `mvn-archetype-quickstart`
2. Set mvn to use latest java LTS version
```xml
    <properties>
        <maven.compiler.source>19</maven.compiler.source>
        <maven.compiler.target>19</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
```
3. Install testng
4. Install selenium-java

## Framework setup

1. Create BaseTest based on this UML diagram
2. Run in at least two browser (using testng xml file): `cross-browser.xml`
3. Run in command line using mvn + surefire: `mvn clean test` (default Chrome browser only)
4. Run by group (aka tag): `regression.xml`
5. Run by class: `mvn test -Dtest="com.lemgrb.DuckDuckGoSearchTest"`