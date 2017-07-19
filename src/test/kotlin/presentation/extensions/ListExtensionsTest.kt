package presentation.extensions

import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class ListExtensionsTest {
    @Test
    fun doubleIt() {
        assertThat(listOf(3, 5, 6).doubleIt(), `is`(listOf(6, 10, 12)))
    }
}