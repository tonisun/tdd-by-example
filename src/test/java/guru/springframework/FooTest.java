package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toni Zeidler on 2022-10-18.
 *
 */
class FooTest {

    private Foo foo;

    @Test
    void getBar() {
        foo = new Foo();
        String result = foo.getBar();
        assertEquals("FooBar", result);
    }
}