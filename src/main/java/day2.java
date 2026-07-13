import org.testng.Assert;
import org.testng.annotations.*;

public class day2 {
    @Test
    public void PersonalLoan4()
    {
        System.out.println("PersonalLoan4");
        Assert.assertTrue(false);
    }
    @AfterClass
    public void PersonalLoan9()
    {
        System.out.println("PersonalLoan9");
    }
    @BeforeMethod
    public void PersonalLoan6()
    {
        System.out.println("PersonalLoan6");
    }
    @BeforeClass
    public void PersonalLoan8()
    {
        System.out.println("PersonalLoan8");
    }
    @AfterMethod
    public void PersonalLoan7()
    {
        System.out.println("PersonalLoan7");
    }
    @Test
    public void PersonalLoan5()
    {
        System.out.println("PersonalLoan5");
    }
    @Test(groups = {"Smoke"})
    public void PersonalLoan11()
    {
        System.out.println("PersonalLoan11");
    }
    @Test(groups = {"Smoke"})
    public void PersonalLoan12()
    {
        System.out.println("PersonalLoan12");
    }
}
