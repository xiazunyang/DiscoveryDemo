/*dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/jcenter")
    }
}*/

rootProject.name = "DiscoveryDemo"

include(":app")
include(":sign", ":sign:api", ":sign:impl")
include(":asset", ":asset:api", ":asset:impl")
include(":common", ":common:java", ":common:android")
