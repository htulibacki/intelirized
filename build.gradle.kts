plugins {
    id("org.jetbrains.intellij.platform") version "2.14.0"
}

group = "com.intelirized"
version = "0.1.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        phpstorm("2026.1")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "261"
            untilBuild = provider { null }
        }
    }
}

tasks.runIde {
    jvmArgs("-Didea.is.internal=true", "-Didea.ui.debug.mode=true")
}
