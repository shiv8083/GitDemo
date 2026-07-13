import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

        @Test
        public void WebLoginCarLoan1()
        {
            System.out.println("WebLoginCarLoan1");
        }
        @Test
        public void WebLoginCarLoan2()
        {
            System.out.println("WebLoginCarLoan2");
        }
        @Parameters({"URL","UserName"})
        @Test
        public void MobileLoginCarLoan(String urlname,String key)
        {
            System.out.println("MobileLoginCarLoan");
            System.out.println(urlname);
            System.out.println(key);
        }
        @Test(dependsOnMethods = {"WebLoginCarLoan2"})
        public void APILoginCarLoan()
        {
            System.out.println("APILoginCarLoan");
        }
        @Test(enabled = false)
        public void WebSignOutCarLoan()
        {
            System.out.println("WebSignOutCarLoan");
        }
        @Test(dataProvider = "getData")
        public void MobileSignOutCarLoan(String username, String password)
        {
            System.out.println("MobileSignOutCarLoan");
            System.out.println(username);
            System.out.println(password);
        }
        @DataProvider
        public Object[][] getData()
        {
            Object[][] data = new Object[3][2];
            data[0][0] = "Rajat";
            data[0][1] = "Rajat@1234";
            data[1][0]= "Swapnil";
            data[1][1]= "Swapnil@1234";
            data[2][0]= "Shubham";
            data[2][1]= "Shubham@1234";
            return data;
        }
}
