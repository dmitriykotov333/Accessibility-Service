plugins {
    id("kotdev.android.library")
}

android {
    namespace = "com.kotdev.abzagency.core"
}

dependencies {
    api(libs.android.coroutine)
    api(libs.android.collections.immutable)
    api(libs.android.lifecycle.viewmodel)
    api(libs.android.viewmodel.savedstate)
}