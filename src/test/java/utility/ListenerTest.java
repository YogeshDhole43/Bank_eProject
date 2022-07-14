package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends UtilityClass implements  ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
	}
	
	

}
