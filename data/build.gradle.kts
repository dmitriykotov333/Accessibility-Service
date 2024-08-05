plugins {
    id("kotdev.android.library")
    id("kotdev.android.hilt")
    id("kotdev.android.test")
}

android {
    namespace = "com.kotdev.abzagency.data"
}

dependencies {
    api(project(":domain"))
    api(project(":database"))
}

