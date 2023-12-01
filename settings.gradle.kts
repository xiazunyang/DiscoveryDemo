pluginManagement {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}

rootProject.name = "DiscoveryDemo"

include(
    ":app",
    ":asset:api",
    ":asset:impl",
    ":common:android",
    ":common:java",
    ":sign:api",
    ":sign:impl"
)
