import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	Triangle t;

	@Before
	public void setUp() throws Exception {
		t = new Triangle(1.0, 1.0, 1.0);
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void Areatest() {
		
		assertTrue(t.getArea() == 0.5);
		assertFalse(t.getArea() == 10);
	}
	@Test
	public void PerimTest(){
		assertTrue(t.getPerimeter()== 3.0);
		assertFalse(t.getPerimeter() == 4.0);
	}

}
