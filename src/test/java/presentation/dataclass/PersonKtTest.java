package presentation.dataclass;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PersonKtTest {
    @Test
    public void javaCompatibility() {
//        Person person = new Person("John", "Smith", 25);
//        person.getFirstName();
//        person.getLastName();
//        person.getAge();
    }

    @Test
    public void propertyEquality() {
        Person johnSmith = new Person("John", "Smith", 25);
        Person johnClone = johnSmith.copy("John", "Smith", 25);

        assertThat(johnSmith.equals(johnClone), is(true));

        Person olderJohn = johnSmith.copy("John", "Smith", 28);
        assertThat(!johnSmith.equals(olderJohn), is(true));
    }

    @Test
    public void referenceEquality() {
        Person johnSmith = new Person("John", "Smith", 25);
        Person johnClone = johnSmith.copy("John", "Smith", 25);
        Person sameObject = johnSmith;

        assertThat(johnSmith != johnClone, is(true));
        assertThat(johnSmith == sameObject, is(true));
    }

    @Test
    public void destructuring() {
        Person johnSmith = new Person("John", "Smith", 25);
        assertThat(johnSmith.component1(), is("John"));
        assertThat(johnSmith.component2(), is("Smith"));
        assertThat(johnSmith.component3(), is(25));
    }
}