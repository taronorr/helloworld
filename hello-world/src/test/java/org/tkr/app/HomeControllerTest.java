package org.tkr.app;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HomeControllerTest 
{
	@Test
    public void とりあえずJunitを試す() {
		String actual = HomeController.home();
		String expect = "Hello World!";
		Assertions.assertEquals(expect, actual);
    }
}
