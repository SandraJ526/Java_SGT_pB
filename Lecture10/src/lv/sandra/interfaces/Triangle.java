package lv.sandra.interfaces;

public class Triangle implements Shape {

	private int base;
	private int height;
	private String color;

	public Triangle(int b, int h) {
		this.base = b;
		this.height = h;
	}
	
	public Triangle() {
		this.color = "red";
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	@Override
	public double getArea() {

		return 0.5 * base * height;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}
