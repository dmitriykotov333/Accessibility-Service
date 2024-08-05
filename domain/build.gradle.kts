plugins {
    id("kotdev.android.library")
}

android {
    namespace = "com.kotdev.abzagency.domain"
}

dependencies {
    implementation(project(":database"))
    implementation(libs.android.coroutine)
}

