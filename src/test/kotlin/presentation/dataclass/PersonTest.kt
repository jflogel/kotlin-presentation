package presentation.dataclass

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class PersonTest {
    @Test
    fun propertyOnlyEquality() {
        val johnSmith = Person("John", "Smith", 25)
        val johnClone = johnSmith.copy()

        assertThat(johnSmith == johnClone, `is`(true))

        val olderJohn = johnSmith.copy(age = 28)
        assertThat(johnSmith != olderJohn, `is`(true))
    }

    @Test
    fun referenceEquality() {
        val johnSmith = Person("John", "Smith", 25)
        val personClone = johnSmith.copy()
        val sameObject = johnSmith

        assertThat(johnSmith !== personClone, `is`(true))
        assertThat(johnSmith === sameObject, `is`(true))
    }

    @Test
    fun deconstruction() {
        val (firstName, lastName, age) = Person("John", "Smith", 25)

        assertThat(firstName, `is`("John"))
        assertThat(lastName, `is`("Smith"))
        assertThat(age, `is`(25))

        val (firstName1) = Person("John", "Smith", 25)

        assertThat(firstName1, `is`("John"))
    }
}