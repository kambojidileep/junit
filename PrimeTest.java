package junit;
import java.util.*;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	private Integer inputNumber;
	private Boolean expectedResult;
	private Prime prime;
	
	
	@Before
	public void initialize()
	{
		prime=new Prime();
	}
	public PrimeTest(Integer inputNumber,boolean expectedresult)
	{
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers()
	{
		return Arrays.asList(new Object[][]
				{{2,true},{6,false},{19,true},{22,false},{23,true}});
	}
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized /nmber is:"+inputNumber);
		assertEquals(expectedResult,prime.validate(inputNumber));
	}

}
