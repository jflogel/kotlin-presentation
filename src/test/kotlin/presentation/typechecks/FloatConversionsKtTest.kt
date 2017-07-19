package presentation.typechecks

import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class FloatConversionsKtTest {
    @Test
    fun happyPath() {
        assertThat(convertToFloat(5f), `is`(5f))
    }

    @Test
    fun handlesIntegers() {
        assertThat(convertToFloat(3), `is`(3f))
    }

    @Test
    fun handlesStrings() {
        assertThat(convertToFloat("2"), `is`(2f))
    }

    @Test
    fun throwsUpWhenStringInvalid() {
        try {
            convertToFloat("two")
            fail("should've blown up")
        } catch(e: Exception) {
        }
    }

    @Test
    fun throwsUpForUnsupportedType() {
        try {
            convertToFloat(8.toDouble())
            fail("should've blown up")
        } catch(e: Exception) {
        }
    }
}