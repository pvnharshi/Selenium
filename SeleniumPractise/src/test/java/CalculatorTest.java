

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal =new Calculator();
	@BeforeClass
	public static void before_class() {
		System.out.println("print before class executes");
	}
@AfterClass
public static void after_class() {
	System.out.println("print after class executes");
	
}
@Before
public void before_method() {
	System.out.println("print before  executes");	
}
@After
public void after_method() {
	System.out.println("print after executes");
}

	@Test
	public void testAdd1() {
		assertEquals (10,cal.add1(5, 5));
		
	}

	@Test
	public void testSub1() {
		assertEquals (10,cal.add1(5, 5));
		
	}
	@Ignore
	public void testAdd11() {
		assertEquals(15,cal.add1(19, 9));
	}

}
