plugins {
    id("kotdev.android.library")
    id("kotdev.android.hilt")
}

android {
    namespace = "com.kotdev.abzagency.service"
}

dependencies {
    implementation(project(":data"))
    implementation(project(":core"))
}

