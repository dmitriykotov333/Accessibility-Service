import java.net.URI

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Abz.Agency"
include(":app")
include(":core")
include(":core_ui")
include(":database")
include(":service")
include(":data")
include(":domain")
include(":presentation")

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))
 