plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.omnistream.ktsu.plugins.mangadex"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.omnistream.ktsu.plugins.mangadex"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    compileOnly(project(":plugin-api"))
    compileOnly(project(":ktsu-api"))
    compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")
}

tasks.register("packagePlugin") {
    dependsOn("assembleRelease")
    doLast {
        val apk = layout.buildDirectory.file("outputs/apk/release/${project.name}-release-unsigned.apk").get().asFile
        val dist = rootProject.layout.projectDirectory.dir("dist").asFile
        dist.mkdirs()
        val omni = File(dist, "${project.name.removePrefix("plugin-")}.omni")
        apk.copyTo(omni, overwrite = true)
        println("Packaged: ${omni.absolutePath}")
    }
}
