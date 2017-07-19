package presentation.extensions;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ListExtensionsKtTest {
    @Test
    public void doubleIt() {
        assertThat(ListExtensionsKt.doubleIt(Arrays.asList(1, 4, 7)), is(Arrays.asList(2, 8, 14)));
    }
}