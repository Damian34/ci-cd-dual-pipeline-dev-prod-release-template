# ci-cd-dual-pipeline-dev-prod-release-template

This repository contains template pipelines for versioning, using the following configuration files:

### update-version-dev
- **01:** Versioning with tags and developer input for version (major.minor.patch), e.g. `0.0.1` in `pom.xml`.
- **02:** Versioning with Git CI only (no tags) and developer input for version (major.minor.patch), e.g. `0.0.1` in `pom.xml`.
- **03:** Versioning with tags, no input required, automatically increments PATCH version.
- **04:** Versioning with Git CI only (no tags), no input required, automatically increments PATCH version.

### update-version-prod
- **01:** Versioning with tags.
- **02:** Versioning with Git CI only (no tags).

### SonarCloud Integration

This project includes pre-configured SonarCloud integration for code quality analysis. To set up SonarCloud:

1. Go to [SonarCloud](https://sonarcloud.io) and connect your repository
2. Disable `Automatic Analysis` in `Analysis Method` settings
3. Generate token at [SonarCloud/security](https://sonarcloud.io/account/security) and save as secret to repository
4. Add required plugins to your `pom.xml`:
```xml
<plugins>
    <plugin>
        <groupId>org.sonarsource.scanner.maven</groupId>
        <artifactId>sonar-maven-plugin</artifactId>
        <version>3.10.0.2594</version>
    </plugin>
    <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.11</version>
    </plugin>
</plugins>
```
