package lib2

actual class Platform2 actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}