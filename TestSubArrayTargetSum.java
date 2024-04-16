import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSubArrayTargetSum {
    SubArrayTargetSum subArrayTargetSum;

    @Before
    public void setUp() {
        subArrayTargetSum = new SubArrayTargetSum();
    }

    @Test
    public void testfindSubArrayWithTargetSum() {
        setUp();
        int arr[] = new int[]{1, 2, 6, 2};
        Assert.assertEquals(Boolean.TRUE, subArrayTargetSum.findSubArrayWithTargetSum(arr, 3));
        Assert.assertEquals(Boolean.TRUE, subArrayTargetSum.findSubArrayWithTargetSum(arr, 9));
        Assert.assertEquals(Boolean.FALSE, subArrayTargetSum.findSubArrayWithTargetSum(arr, 4));
    }
}
