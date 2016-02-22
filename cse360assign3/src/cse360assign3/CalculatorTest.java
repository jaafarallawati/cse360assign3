package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void CalculatorTest(){
		//fail("Not yet implemented");
		Calculator calc1 = new Calculator();
		assertNotNull(calc1);
		
	}
	
	@Test
	public void getTotalTest(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		assertEquals(10, calc1.getTotal());
	}
	
	@Test
	public void addTest(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		assertEquals(10, calc1.getTotal());
	}
	
	@Test
	public void subtractTest(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.subtract(1);
		assertEquals(9, calc1.getTotal());
	}
	
	@Test
	public void multiplyTest(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.subtract(1);
		calc1.multiply(2);
		assertEquals(18, calc1.getTotal());
	}
	
	@Test
	public void divideTest(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.subtract(1);
		calc1.multiply(2);
		calc1.divide(2);
		assertEquals(9, calc1.getTotal());
	}
	
	@Test
	public void divideTest2(){
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.subtract(1);
		calc1.multiply(2);
		calc1.divide(0);
		assertEquals(0, calc1.getTotal());
	}
	@Test
	public void getHistoryTest(){
		Calculator calc1 = new Calculator();
		/*calc1.add(10);
		calc1.subtract(1);
		calc1.multiply(2);
		calc1.divide(2);
		assertEquals(9, calc1.getTotal());
		assertEquals("0 + 10 - 1 * 2 / 2", calc1.getHistory());
		*/
		assertEquals("", calc1.getHistory());
		
		
	}
	
	

}
