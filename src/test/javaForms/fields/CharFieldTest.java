package test.javaForms.fields;
import javaForms.fields.CharField;
import junit.framework.TestCase;

public class CharFieldTest extends TestCase{
	
	  public static void testRender() {
		  CharField cf = new CharField("fieldname","sometext");
		  assertEquals("<input name='fieldname' value='sometext'>", cf.render());
	  }
}
