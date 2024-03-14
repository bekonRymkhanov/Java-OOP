package lab1;

public class Temperature {
	private double value;
	private char degree;
	public Temperature() {
		this.value=0;
		this.degree='C';
	}
	public Temperature(double value) {
		this.value=value;
		this.degree='C';
	}
	public Temperature(char degree) {
		this.value=0;
		this.degree=degree;
	}
	public Temperature(double value,char degree) {
		this.value=value;
		this.degree=degree;
	}
	public double returnFaren() {
		if(degree=='C') {
			return (value*9/5)+32;
		}else {
			return value;
		}
	}
	public double returnCelcius() {
		if(degree=='C') {
			return value;
		}else {
			return 5*(value-32)/9;
		}
	}
	public char returnDegree() {
		return this.degree;
	}
	public void setValue(double value) {
		this.value=value;
	}
	public void setDegree(char degree) {
		this.degree=degree;
	}
	public void setBoth(double value,char degree) {
		this.value=value;
		this.degree=degree;
	}
}
