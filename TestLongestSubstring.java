import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLongestSubstring {
    LongestSubstring longestSubstring;

    @Before
    public void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    public void testFindLength() {
        setUp();
        Assert.assertEquals(3, longestSubstring.findLength("abc"));
        Assert.assertEquals(3, longestSubstring.findLength("abcabcbc"));
        Assert.assertEquals(3, longestSubstring.findLength("pwwkew"));
        Assert.assertEquals(1, longestSubstring.findLength("bbb"));
        Assert.assertEquals(2, longestSubstring.findLength("ab"));
        Assert.assertEquals(0, longestSubstring.findLength(""));
    }
}
