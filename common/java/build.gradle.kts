import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("kotlin")
}

group = "cn.numeron"
version = "0.0.1"

kotlin {
    compilerOptions {
        version = JavaVersion.VERSION_11
    }
}

dependencies {
}