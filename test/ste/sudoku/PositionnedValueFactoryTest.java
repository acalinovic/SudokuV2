package ste.sudoku;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import junit.framework.TestCase;

public class PositionnedValueFactoryTest extends TestCase {
	

	public void testBuild_withRegularArgs_returnsPositionnedValue(){
		PositionnedValueFactory positionnedValueFactory = new PositionnedValueFactory();
		PositionnedValue positionnedValue = positionnedValueFactory.build("2 3 5");
		assertEquals(2, positionnedValue.getX());
		assertEquals(3, positionnedValue.getY());
		assertEquals(Value.FIVE, positionnedValue.getValue());
	}
	
	public void testBuild_withNull_returnsNull(){
		PositionnedValueFactory positionnedValueFactory = new PositionnedValueFactory();
		PositionnedValue positionnedValue = positionnedValueFactory.build(null);
		assertEquals(null, positionnedValue);
	}
	
	public void testBuild_withNullPosition_returnsNull(){
		PositionnedValueFactory positionnedValueFactory = new PositionnedValueFactory();
		PositionnedValue positionnedValue = positionnedValueFactory.build("2 6");
		assertEquals(null, positionnedValue);
	}

}
