package javaForms.fields;

public class AbstractField implements Field {

	private final static String HTML = "<input name='%s' value='%s'>";
	private String name;
	private Object value;

	public AbstractField(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public Object getValue() {

		return value;
	}

	@Override
	public String render() {
		return String.format(HTML, name, value.toString());
	}

	@Override
	public Object setValue() {

		return name;
	}

}
