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
		assertEquals("Vacia", st.floors());
	
	}
	
	@Test
	public void addThreeStackNotEmpty(){
		//Arrange
		Stack st = new Stack();
		
		//Act
		st.add(3);
		
		//Assert
		assertEquals("No Vacia",st.floors());
	}

}
