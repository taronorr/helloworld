package org.tkr.app;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
    public void とりあえずJunitを試す() {
		String actual = App.home();
		String expect = "Hello World!";
		Assertions.assertEquals(expect, actual);
    }
}
