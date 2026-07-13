import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    @Test
    public void WebLoginHomeLoan()
    {
        System.out.println("WebLoginHomeLoan");
    }
    @Parameters({"URL"})
    @Test
    public void MobileLoginHomeLoan(String urlname)
    {
        System.out.println("MobileLoginHomeLoan");
        System.out.println(urlname);
    }
    @Test
    public void APILoginHomeLoan()
    {
        System.out.println("APILoginHomeLoan");
    }
    @Test
    public void WebSignOutHomeLoan()
    {
        System.out.println("WebSignOutHomeLoan");
    }
    @Test
    public void MobileSignOutHomeLoan()
    {
        System.out.println("MobileSignOutHomeLoan");
    }
    @Test
    public void APISignOutHomeLoan()
    {
        System.out.println("APISignOutHomeLoan");
    }
}
