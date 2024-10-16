plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

}

android {
    namespace = "com.example.strengthennumbers"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.strengthennumbers"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
    sourceSets {
        getByName("main") {
            res {
                srcDirs("src/main/res", "src/main/res/images")
            }
        }
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    //Dots Indicators
    implementation(libs.viewpagerdotsindicator)
    //Otp View

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}