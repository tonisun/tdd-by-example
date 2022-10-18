package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    private Foo foo;

    @Test
    void getBar() {
        foo = new Foo();
        String result = foo.getBar();
        assertEquals("FooBar", result);
    }
}