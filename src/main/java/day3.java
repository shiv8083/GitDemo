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
        public void MobileLoginCarLoan1(String urlname,String key)
        {
            System.out.println("MobileLoginCarLoan1");
            System.out.println(urlname);
            System.out.println(key);
        }
        @Parameters({"URL","UserName"})
        @Test
        public void MobileLoginCarLoan2(String urlname,String key)
        {
            System.out.println("MobileLoginCarLoan2");
            System.out.println(urlname);
            System.out.println(key);
        }
        @Test(dependsOnMethods = {"WebLoginCarLoan1"})
        public void APILoginCarLoan1()
        {
            System.out.println("APILoginCarLoan1");
        }
        @Test(dependsOnMethods = {"WebLoginCarLoan2"})
        public void APILoginCarLoan2()
        {
            System.out.println("APILoginCarLoan2");
        }
        @Test(enabled = false)
        public void WebSignOutCarLoan1()
        {
            System.out.println("WebSignOutCarLoan1");
        }
        @Test(enabled = false)
        public void WebSignOutCarLoan2()
        {
            System.out.println("WebSignOutCarLoan2");
        }
        @Test(dataProvider = "getData")
        public void MobileSignOutCarLoan1(String username, String password)
        {
            System.out.println("MobileSignOutCarLoan1");
            System.out.println(username);
            System.out.println(password);
        }
        @Test(dataProvider = "getData")
        public void MobileSignOutCarLoan2(String username, String password)
        {
            System.out.println("MobileSignOutCarLoan2");
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
