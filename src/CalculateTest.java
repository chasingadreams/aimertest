

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

    @Test
    public void testAdd() 
    {
        System.out.println("this is testAdd()...");  
        int result = Calculate.add(2, 3);
        assertEquals("加法有问题", 5, result);  
    }

    @Test
    public void testSubstract()
    {
        System.out.println("this is testSubstract()...");  
        int result = Calculate.substract(12, 2);
        assertEquals("减法有问题", 10, result); 
    }

    @Test
    public void testMultiply() 
    {
        int result = Calculate.multiply(2, 3);  
        assertEquals("乘法有问题", 6, result);  
    }

    @Test
    public void testDivide() 
    {
        int result = Calculate.divide(6,2);  
        assertEquals("除法有问题", 3, result);  
    }
}
