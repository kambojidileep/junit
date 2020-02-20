package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
    
	public CalculatorTest()
	{
		super();
	}
	public void testFact()
	{
	Calculator cc=new Calculator();
	assertEquals(120,cc.factorial(5));
}
}
