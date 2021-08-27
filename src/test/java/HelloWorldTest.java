import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloFern () {
        HelloWorld helloWorld = new HelloWorld();
        String actualResult = helloWorld.greeting("fern");
        assertEquals("Hello fern", actualResult);
    }
}
