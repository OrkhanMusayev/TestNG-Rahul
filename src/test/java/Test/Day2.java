package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @Test(groups = {"Smoke"})
    public void Ploan(){
        System.out.println("Good");
    }

    @BeforeTest
    public void preRequest(){
        System.out.println("I will execute first");
    }
}
