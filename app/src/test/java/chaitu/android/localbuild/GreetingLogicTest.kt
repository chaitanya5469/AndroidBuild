package chaitu.android.localbuild

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class GreetingLogicTest {

    @Test
    fun `valid name returns greeting`() {
        val result = GreetingLogic.buildGreeting("Android")
        assertEquals("Hello Android!", result)
    }

    @Test
    fun `blank name throws exception`() {
        assertThrows(IllegalArgumentException::class.java) {
            GreetingLogic.buildGreeting("")
        }
    }
}
