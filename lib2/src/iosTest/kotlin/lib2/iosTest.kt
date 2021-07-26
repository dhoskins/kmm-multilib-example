package lib2

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting2().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}