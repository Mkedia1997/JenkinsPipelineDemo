import static org.junit.Assert.*;

import org.junit.Test;

public class RunnerTest {
	@Test 
	public void add() {
		Runner v= new Runner(45,6);
		assertEquals(v.add(),51);
	}
	@Test 
	public void subtract() {
		Runner v= new Runner(40,6);
		assertEquals(v.subtract(),34);
	}
	@Test 
	public void multiply() {
		Runner v= new Runner(5,6);
		assertEquals(v.multiply(),30);
	}
	@Test 
	public void divide() {
		Runner v= new Runner(45,6);
		assertEquals(v.divide(),7);
	}
	
	
	
	
	
	
	
}
