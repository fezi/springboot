package fz.builder;

import java.util.List;

public class MyBean {

	AnotherBean anotherBean;
	String anotherName;
	double f;
	boolean is;
	String name;
	Integer wrapperType;
	List<Boolean> bools;

	public MyBean() {
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public String getAnotherName() {
		return anotherName;
	}

	public List<Boolean> getBools() {
		return bools;
	}

	public double getF() {
		return f;
	}

	public String getName() {
		return name;
	}

	public Integer getWrapperType() {
		return wrapperType;
	}

	public boolean isIs() {
		return is;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}

	public void setBools(List<Boolean> bools) {
		this.bools = bools;
	}

	public void setF(double f) {
		this.f = f;
	}

	public void setIs(boolean is) {
		this.is = is;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWrapperType(Integer wrapperType) {
		this.wrapperType = wrapperType;
	}

	@Override
	public String toString() {
		return "MyBean [anotherBean=" + anotherBean + ", anotherName=" + anotherName + ", f=" + f + ", is=" + is + ", name=" + name
				+ ", wrapperType=" + wrapperType + ", bools=" + bools + "]";
	}

}
