import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {
    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue () {
        Range range = new Range ("[1,5]");
        boolean actualResult = range.isStartWithInclusive();
        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithBracketShouldBeFalse () {
        Range range = new Range ("(1,5]");
        boolean actualResult = range.isStartWithInclusive();
        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShoulbe1 () {
        Range range = new Range ("[1,5]");
        int actualResult = range.getStartInput();
        assertEquals(1, actualResult);
    }

    @Test
    public void isEndWithInclusiveWithKampooShouldBeTrue () {
        Range range = new Range ("[1,5]");
        boolean actualResult = range.isEndWithInclusive();
        assertTrue(actualResult);
    }

    @Test
    public void isEndWithInclusiveWithBracketShouldBeFalse () {
        Range range = new Range ("[1,5)");
        boolean actualResult = range.isEndWithInclusive();
        assertFalse(actualResult);
    }

}
