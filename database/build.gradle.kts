plugins {
    id("kotdev.android.library")
    id("kotdev.android.room")
    id("kotdev.android.hilt")
    id("kotdev.android.test")
}

android {
    namespace = "com.kotdev.abzagency.database"
}

dependencies {

    implementation(libs.android.sqlcipher)
    implementation(libs.android.sqlite)
} 
