# Intelirized

> ⚠️ **Early preview — 0.1.0.** Colors, scope mappings, and UI tuning are still in flux. Expect breaking changes between versions and rough edges in less common language scopes. Feedback and issues welcome.

A **light** **Islands**-style theme for JetBrains IDEs based on the classic [Solarized Light](https://ethanschoonover.com/solarized/) palette by Ethan Schoonover.

Tuned for readability:
- Body text contrast **9.16:1** (WCAG AAA)
- Comments at **3.16:1** — recede without disappearing
- Built for the new Islands UI introduced in 2025.12

## Requirements

- JetBrains IDE **2026.1+** (build 261+)
- Currently targets **PhpStorm 2026.1** (see [build.gradle.kts](build.gradle.kts))

## Development

Built with [IntelliJ Platform Gradle Plugin](https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html) 2.14.0.

### Prerequisites

- JDK 21 (e.g. `brew install openjdk@21`)

### Common tasks

```sh
export JAVA_HOME=/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home

# Build the plugin ZIP (output in build/distributions/)
./gradlew buildPlugin

# Run a sandboxed IDE with the plugin installed
./gradlew runIde

# Verify the plugin against the target IDE
./gradlew verifyPlugin
```

## Project structure

```
src/main/resources/
├── META-INF/plugin.xml          # Plugin descriptor
└── themes/
    ├── Intelirized.theme.json   # Theme definition
    └── Intelirized.xml          # Editor color scheme
```

## License

[MIT](LICENSE) © Hubert Tulibacki
