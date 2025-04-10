pluginManagement {
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
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "DevCraft"
include(":app")

// Core
include(":core:core-ui")
include(":core:core-utils")
include(":core:core-di")

// Data
include(":data:data-api")
include(":data:data-db")
include(":data:data-repository")
include(":data:model")

// Features
include(":features:newsfeed")
include(":features:chat")
include(":features:profile")
include(":features:dashboard")
include(":features:settings")
include(":features:media_center")