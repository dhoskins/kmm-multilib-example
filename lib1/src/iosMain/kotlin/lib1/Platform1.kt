package lib1

import platform.UIKit.UIDevice

actual class Platform1 actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}