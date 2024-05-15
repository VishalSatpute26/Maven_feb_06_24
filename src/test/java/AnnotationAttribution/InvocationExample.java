package AnnotationAttribution;

import org.testng.annotations.Test;

public class InvocationExample
{
   @Test(invocationCount = 100)
   public void invocationCountDemo()
   {
       System.out.println("Innovation Count Demo");
   }
}
