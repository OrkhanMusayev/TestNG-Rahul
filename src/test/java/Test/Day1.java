package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

    @AfterTest
    public void lastExecution(){
        System.out.println("I will execute last");
    }


    @Test // test annotation help us to run our test case
    public void Demo(){ //  this is a test case
        Assert.assertTrue(false); // just for example to fail test in Listeners class
        System.out.println("Hello");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("I am the number 1 from last");
    }

    // we can have multiple test cases in one java class
    @Test
    public void SecondTest(){

        System.out.println("Bye");
    }
}
