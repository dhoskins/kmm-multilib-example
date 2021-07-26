package lib1

import lib2.Greeting2

class Greeting1 {
    fun greeting(): String {
        val greeting2 = Greeting2()
        return "Lib1: Hello, ${Platform1().platform}! Also, ${greeting2.greeting()}"
    }
}
