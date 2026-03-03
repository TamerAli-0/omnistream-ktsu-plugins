pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "OmniStreamKtsuPlugins"

include(":plugin-api")
include(":ktsu-api")

// Ktsu plugins
include(":plugin-mangadex")
include(":plugin-asurascans")
include(":plugin-mangaplus")
include(":plugin-mangasee")
