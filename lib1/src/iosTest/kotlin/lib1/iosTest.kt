package lib1

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting1().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}