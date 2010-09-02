package javaForms;

import java.util.List;
import javaForms.fields.Field;

interface Form {

	public List<Field> getFields();

	public List<String> getErrors();

	public String isValid();

	public String render();
}