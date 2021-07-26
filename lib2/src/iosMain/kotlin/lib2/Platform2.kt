package lib2

import platform.UIKit.UIDevice

actual class Platform2 actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}