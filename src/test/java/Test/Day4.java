package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @Parameters({"URL"}) // testng.xml file we past key=url, value = website
    @Test
    public void WebLoginHomeLoan(String username){
        // selenium.
        System.out.println("WebLoginHomePersonalLoan");
        System.out.println(username);

    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarHomeLoan(){

        // Appium
        System.out.println("MobileLoginCarHomeLoan");
    }

    @Test
    public void LoginAPIcarHomeLoan(){

        // Rest API automation
        System.out.println("LoginAPIcarHomeLoan");
    }
}
