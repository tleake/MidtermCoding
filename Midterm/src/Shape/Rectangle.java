package Shape;
public class Rectangle extends Shape implements Comparable<Rectangle>{
	private int iWidth;
	private int iLength;
	
	public Rectangle() {
	}
	public Rectangle(int width, int length) throws Exception{
		if(width < 0) {
			throw new IllegalArgumentException("Width must be positive.");
		}else if(length < 0) {
			throw new IllegalArgumentException("Length must be positive");
		}else {
			this.iWidth = width;
			this.iLength = length;
		}
	}
	public void setWidth(int width) {
		this.iWidth = width;
	}
	public void setLength(int length) {
		this.iLength = length;
	}
	public int getWidth() {
		return this.iWidth;
	}
	public int getLength() {
		return this.iLength;
	}
	@Override
	public double area() {
		return this.iWidth * this.iLength;
	}
	@Override
	public double perimeter() {
		return 2 * (this.iWidth + this.iLength);
	}
	public int compareTo(Object r) {
		Rectangle rec = (Rectangle) r;
		return (int) (this.area() - rec.area());
	}
}
