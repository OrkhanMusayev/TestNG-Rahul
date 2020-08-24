package Test;

import org.testng.annotations.*;

public class Day3 {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before executing any methods in the class");
    }

    @Parameters({"URL","APIKey/username"}) // testng.xml file we past key=url, value = website
    @Test
    public void WebLoginCarLoan(@Optional  String urlName,String key){
        // selenium.
        System.out.println("WebLoginCarLoan");
        System.out.println(urlName);
        System.out.println(key);
    }

    @BeforeMethod
    public void beforeEvery(){
        System.out.println("I will execute before every test method in day3 class");
    }

    @AfterMethod
    public void afterEvery(){
        System.out.println("I will execute after every test method in day3 class");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After executing all methods in the class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan(){

        // Appium
        System.out.println("MobileLoginCarLoan");
    }

    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("I am number 1");
    }

    @Test(enabled = false) // testNG will skip this test case execution
    public void MobileSignInLoan(){
        // Appium
        System.out.println("Mobile SIGN IN");
    }

    @Test(dataProvider = "getData")     //(timeOut = 4000) // do not fail,wait 4 sec before fail
    public void MobileSignOutCarLoan(String username,String password){
        // Apium
        System.out.println("Mobile SIGN OUT");
        System.out.println(username);
        System.out.println(password);
    }

    //@Test(dependsOnMethods = {"WebLoginCarLoan","MobileSignOutLoan"}) // these 2 testcase run before APIcarLoan
    public void APIcarLoan(){

        // Rest API automation
        System.out.println("APIcarLoan");
    }

    @DataProvider
    public Object[][] getData(){
        // 1st combination - username,password - good credit history = row
        //2nd - username,password - no credit history
        //3rd - fraudulent credit history

        Object[][] data = new Object[3][2]; // here 3(row) is combination,2(col) is total values
        // 3 combination, each combination have 2 value

        // 1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "password";
        // couloums in the row are nothing but values for that particular combination(row)

        // 2nd row
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";

        // 3rd set
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";

        return data;
    }
}
