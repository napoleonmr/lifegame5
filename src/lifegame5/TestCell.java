package lifegame5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCell {
	//Any live cell with fewer than two live neighbours dies,
	//as if by underpopulation.
	@Test
	void test() {
		Cell c = new Cell(true, 1);
		c.tick();
		boolean status = c.getStatus();
		assertFalse(status);		
	}
	
	//Any live cell with two or three live neighbours 
	//lives on to the next generation.
	@Test
	void test1() {
		Cell c = new Cell(true, 2);
		c.tick();
		boolean status = c.getStatus();
		assertTrue(status);		
	}
	
	@Test
	void test2() {
		Cell c = new Cell(true, 3);
		c.tick();
		boolean status = c.getStatus();
		assertTrue(status);		
	}

}
