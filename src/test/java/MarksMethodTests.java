import org.junit.Assert;
import org.junit.Test;

public class MarksMethodTests {
    @Test
    public void When_MarkLessThan36_Expect_ResultIs2() {
        Assert.assertEquals("2", MarksCalculate.getMarkResult(2));
    }

    @Test
    public void When_MarkLessThan0_Expect_ResultIsWrong() {
        Assert.assertEquals("no mark result", MarksCalculate.getMarkResult(-1));
    }

    @Test
    public void When_MarkIs35_Expect_ResultIs2() {
        Assert.assertEquals("2", MarksCalculate.getMarkResult(35));
    }

    @Test
    public void When_MarkLessThan56_Expect_ResultIs3() {
        Assert.assertEquals("3", MarksCalculate.getMarkResult(36));
    }

    @Test
    public void When_MarkIs56_Expect_ResultIs3() {
        Assert.assertEquals("3", MarksCalculate.getMarkResult(56));
    }

    @Test
    public void When_MarkLessThan71_Expect_ResultIs4() {
        Assert.assertEquals("4", MarksCalculate.getMarkResult(57));
    }

    @Test
    public void When_MarkIs71_Expect_ResultIs4() {
        Assert.assertEquals("4", MarksCalculate.getMarkResult(71));
    }

    @Test
    public void When_MarkLessThan100_Expect_ResultIs5() {
        Assert.assertEquals("5", MarksCalculate.getMarkResult(72));
    }

    @Test
    public void When_MarkMoreThan100_Expect_ResultIsWrong() {
        Assert.assertEquals("no mark result", MarksCalculate.getMarkResult(101));
    }

    @Test
    public void When_MarkIs100_Expect_ResultIs5() {
        Assert.assertEquals("5", MarksCalculate.getMarkResult(100));
    }

    @Test
    public void When_MarkIs_Null() {
        Integer a = null;
        Assert.assertEquals("2", MarksCalculate.getMarkResult(a));
    }


}

