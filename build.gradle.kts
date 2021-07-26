plugins {
    id("com.android.library") apply false
    kotlin("multiplatform") version Kotlin.version apply false
    kotlin("native.cocoapods") version Kotlin.version apply false
    id("kotlin-android-extensions") apply false
}
group = "twolibs"

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}
