import org.testng.annotations.*;

public class day1 {
    @AfterSuite
    public void PersonalLoan0()
    {
        System.out.println("PersonalLoan0");
    }
    @AfterTest
    public void PersonalLoan2()
    {
        System.out.println("PersonalLoan2");
    }
    @BeforeTest
    public void PersonalLoan1()
    {
        System.out.println("PersonalLoan1");
    }
    @BeforeSuite
    public void PersonalLoan3()
    {
        System.out.println("PersonalLoan3");
    }
    @Test(groups = {"Smoke"})
    public void PersonalLoan10()
    {
        System.out.println("PersonalLoan10");
    }

}
