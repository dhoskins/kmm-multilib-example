package lib1

actual class Platform1 actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}