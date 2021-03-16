import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTestTest {
    @Test
    public void test() {

        assertEquals("amaM", StringPracticeHw.getStrReverse("Mama").toString());
        assertEquals("54321", StringPracticeHw.getStrReverse("12345").toString());
        assertEquals("777", StringPracticeHw.getStrReverse("777").toString());
        assertEquals("", StringPracticeHw.getStrReverse("").toString());
        assertEquals("amaM", StringPracticeHw.getStrReverse("Papa").toString());
        assertEquals("0000", StringPracticeHw.getStrReverse("1111").toString());


        assertEquals(2, StringPracticeHw.getCountWords("Two beers or not two beers", "beer"));
        assertEquals(0, StringPracticeHw.getCountWords("Two beers or not two beers", "vodka"));
        assertEquals(0, StringPracticeHw.getCountWords("Two beers or not two beers", ""));
        assertEquals(0, StringPracticeHw.getCountWords("", "beer"));
        assertEquals(-1, JUnitTest.searchStr("", ""));
        assertEquals(-1, JUnitTest.searchStr("Two beers or not two beers", ""));
        assertEquals(-1, JUnitTest.searchStr("", "beer"));

    }
}