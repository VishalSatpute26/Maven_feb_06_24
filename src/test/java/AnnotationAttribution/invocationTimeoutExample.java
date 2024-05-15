package AnnotationAttribution;

import org.testng.annotations.Test;

public class invocationTimeoutExample
{
    @Test(invocationCount = 1000, invocationTimeOut = 1)
        public void invocationCountDemo()
        {
            System.out.println("Innovation Count Demo");
        }
}

