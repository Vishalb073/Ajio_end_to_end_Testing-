package listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class itestlistners implements ITestListener {

    ExtentSparkReporter htmlReporter;

    ExtentReports reports;

    ExtentTest Test;
    public  void  config(){
        htmlReporter = new ExtentSparkReporter("target:Extent_reports.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

    }
    @Override
    public void onTestStart(ITestResult result) {
        Test = reports.createTest(result.getTestClass().getName());
        Test.log(Status.INFO , "test's started ");
        System.out.println(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Test = reports.createTest(result.getTestClass().getName());
        Test.log(Status.PASS , "test passed successfull !!");
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        config();
        System.out.println(context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName());
    }
}
