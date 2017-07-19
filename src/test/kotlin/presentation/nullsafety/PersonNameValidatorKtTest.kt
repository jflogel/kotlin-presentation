package presentation.nullsafety

import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class PersonNameValidatorKtTest {
    @Test
    fun happyPath() {
        assertThat(validateName("John Smith"), `is`(true))
    }

    @Test
    fun handlesNull() {
        assertThat(validateName(null), `is`(false))
    }

    @Test
    fun atLeastThreeCharacters() {
        assertThat(validateName("Aa"), `is`(false))
    }

    @Test
    fun hasValidCharacters() {
        assertThat(validateName("*&(&("), `is`(false))
        assertThat(validateName("Jane Doe-Smith"), `is`(true))
    }
}