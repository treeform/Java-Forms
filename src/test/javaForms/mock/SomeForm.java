package test.javaForms.mock;

import javaForms.AbstractForm;
import javaForms.fields.CharField;

public class SomeForm extends AbstractForm {
	public CharField name = new CharField("name", "");
	public CharField park = new CharField("park", "");
	public CharField description = new CharField("description", "");
}