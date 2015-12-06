package fz.builder;

public class AnotherBean {

	String name;
	float foo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnotherBean [name=" + name + ", foo=" + foo + "]";
	}

	public float getFoo() {
		return foo;
	}

	public void setFoo(float foo) {
		this.foo = foo;
	}
}
