package org.tkr.app;

import static org.junit.Assert.*;

import org.junit.Test;

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
		String actual = App.toString(1);
		String expect = "1";
		assertEquals(expect, actual);
    }
}
