plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
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
}

dependencies {


        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.11.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        // Glide
        implementation ("com.github.bumptech.glide:glide:4.14.2")
        annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")
        // thư viện room
                implementation ("androidx.room:room-runtime:2.4.0")
                annotationProcessor ("androidx.room:room-compiler:2.4.0")

//        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
//        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
//        implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")
//        implementation ("io.reactivex.rxjava3:rxjava:3.0.0")
//        implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    //bradge
    implementation ("com.nex3z:notification-badge:1.0.4")



}

