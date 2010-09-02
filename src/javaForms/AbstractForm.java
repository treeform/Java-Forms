package javaForms;

import java.util.ArrayList;
import java.util.List;

import javaForms.fields.Field;

public class AbstractForm implements Form {

	public static final String HTML_HEADER = "<form %s>";
	public static final String HTML_FOOTER = "</form>";

	private String action;
	private String method;
	private String name;

	public AbstractForm() {
		super();
	}

	public AbstractForm(String name) {
		super();
		this.name = name;
	}

	public AbstractForm(String name, String method) {
		super();
		this.method = method;
		this.name = name;
	}

	public AbstractForm(String name, String method, String action) {
		super();
		this.action = action;
		this.method = method;
		this.name = name;
	}

	@Override
	public List<String> getErrors() {
		return null;
	}

	@Override
	public String isValid() {
		return null;
	}

	@Override
	public String render() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format(HTML_HEADER, ""));
		for (Field field : getFields()) {
			sb.append(field.render());
		}
		sb.append(HTML_FOOTER);
		return sb.toString();
	}

	@Override
	public List<Field> getFields() {
		ArrayList<Field> list = new ArrayList<Field>();
		try {
			Class cls = this.getClass();
			java.lang.reflect.Field[] fieldlist = cls.getDeclaredFields();
			for (int i = 0; i < fieldlist.length; i++) {
				java.lang.reflect.Field fld = fieldlist[i];
				try {
					list.add((Field) fld.get(this));
				} catch (ClassCastException cce) {
					// this is normal
					continue;
				}
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
		return list;
	}

}
