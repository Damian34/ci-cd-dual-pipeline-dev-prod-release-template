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
