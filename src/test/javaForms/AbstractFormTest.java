package test.javaForms;

import java.util.ArrayList;
import java.util.List;
import javaForms.fields.Field;

import junit.framework.TestCase;
import test.javaForms.mock.SomeForm;

public class AbstractFormTest extends TestCase {

	public static void testGetFields() {
		SomeForm sf = new SomeForm();
		List<Field> fields = new ArrayList<Field>();
		fields.add(sf.name);
		fields.add(sf.park);
		fields.add(sf.description);
		assertEquals(fields, sf.getFields());
	}

	public static void testRender() {
		SomeForm sf = new SomeForm();
		assertEquals("<form><input name='name' value=''>"
				+ "<input name='park' value=''>"
				+ "<input name='description' value=''></form>", sf.render());
	}
}
