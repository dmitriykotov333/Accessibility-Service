plugins {
    id("kotdev.android.library")
    id("kotdev.android.library.compose")
    id("kotdev.core.ui")
    id("kotdev.android.hilt")
}

android {
    namespace = "com.kotdev.abzagency.presentation"
}

dependencies {
    api(project(":core"))
    implementation(project(":data"))
    implementation(libs.android.lottie)
    api(project(":service"))
}

