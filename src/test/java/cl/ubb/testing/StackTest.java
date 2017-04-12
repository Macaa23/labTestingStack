package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void nuevaStackEmpiezaVacia() {
		//Arrange
		Stack st;
		
		//Act
		st = new Stack();
		
		//Assert
		assertEquals(0, st.floors());
	
	}

}
