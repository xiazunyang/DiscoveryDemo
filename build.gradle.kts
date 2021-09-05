// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("cn.numeron:discovery.plugin:1.3.1")
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.5.30-1.0.0-beta09")
    }
}

subprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}