plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.google.devtools.ksp")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 21
        targetSdk = 30
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        val release by getting {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(project(":common:java"))
    api("androidx.core:core-ktx:1.6.0")
    api("cn.numeron:discovery.library:1.3.1")
    api("androidx.appcompat:appcompat:1.3.1")
    api("com.google.android.material:material:1.4.0")
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    api("androidx.constraintlayout:constraintlayout:2.1.0")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")

    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

ksp {
    arg("projectName", "common-android")
    arg("rootProjectBuildDir", rootProject.buildDir.absolutePath)
}
