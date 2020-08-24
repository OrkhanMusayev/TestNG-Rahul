package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    // ITestListener interface.
    // I need to use this for implement Listener to my framework
    // we use implements keyword to call interface
    // Must to do where Listeners class is located,we do in testng.xml file


    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // when test success pass it will located here
       // System.out.println("I successfully executed Listeners Pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // if test fail it will located here. Take a screenshot code
        // response if API is failed
        //System.out.println("I successfully executed Listeners Pass code");
        // if test successfully run it never be here
        // here located all faille test cases
        System.out.println("I failed executed Listeners Pass code " + result.getName());
        // result.getName() - to show which test case is failed

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
