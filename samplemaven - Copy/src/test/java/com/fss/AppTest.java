package com.fss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class AppTest 
{
    
    @Test
   public void testsum()
   {
           
            App app = new App();
            int a = 10;
            int b = 20;
            int expected=30;
           int Actual= a+b;
            System.out.println("Sum is : "+(Actual));
            assertEquals(expected,Actual);
    }
}
