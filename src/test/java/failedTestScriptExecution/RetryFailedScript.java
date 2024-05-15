package failedTestScriptExecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedScript implements IRetryAnalyzer
{
public static  int Retry_MIN=0;
public static final int Retry_MAX=3;
    @Override
    public boolean retry(ITestResult iTestResult)
    {
        if (Retry_MIN < Retry_MAX)
        {
            Retry_MIN++;
            return true;

        }
        return false;
    }
}
