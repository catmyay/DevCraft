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
//include(":core:ui") // Общие компоненты UI: стили, темы, кнопки, шрифты
//include(":core:utils") // Утилиты, расширения
//include(":core:di") // DI setup (Koin/Hilt/Dagger) базовый
//include(":core:navigation") // Навигация, если она общая (Cicerone setup)
//include(":core:base") // Базовые классы (BaseFragment, BaseViewModel и т.д.)
//include(":core:network") // Общая настройка Retrofit/OkHttp (если не вынесена в data)


// Data
include(":data:api") // Retrofit, DTO
include(":data:databases") // Room, DAO
include(":data:repository") // Реализация репозиториев
include(":data:model") // data-модели

// Features
include(":features:newsfeed")
include(":features:chatWebSocketGemini")
include(":features:profile")
include(":features:dashboard")
include(":features:settings")
include(":features:media_center")

include(":core")
include(":test")
include(":features")
include(":data")