package org.tkr.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import mockit.Mock;
import mockit.MockUp;


public class HomeControllerTest {
	@SuppressWarnings("rawtypes")
	private List<MockUp> mocks = new ArrayList<MockUp>();
	Map<String, String> attribute = new HashMap<String, String>();

	
	private void setUp() {
		@SuppressWarnings("rawtypes")
		MockUp m = new MockUp<Model>() {
			@Mock
			public Model addAttribuaddAttribute(String attributeName, Object attributeValue) {
				attribute.put("attributeName", attributeName);
				attribute.put("attributeValue", attributeValue.toString());
				return new ConcurrentModel();
			};
		};
		mocks.add(m);
	}
	
	@Test
    public void Helloworldが表示できる() {
		String actual = HomeController.home();
		String expect = "Hello World!";
		Assertions.assertEquals(expect, actual);
    }
	
	@Test
    public void 名前が表示できる() {
		Model model = new ConcurrentModel();
		String actual = HomeController.hello(model);
		String expect = "Hello World!";
		Assertions.assertEquals(expect, actual);
    }
}
