package Shape;
import java.util.Comparator;
import java.io.*;


public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid() {
	}
	
	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception{
		super(iWidth, iLength);
		if(iDepth < 0) {
			throw new IllegalArgumentException("Depth must be positive.");
		}else {
			this.iDepth = iDepth;
		}
	}
	public void setDepth(int depth) {
		this.iDepth = depth;
	}
	public int getDepth() {
		return this.iDepth;
	}
	public double volume() {
		return getLength() * getWidth() * this.iDepth;
	}
	@Override
	public double area() {
		return (2 * iDepth * getWidth()) + (2 * iDepth * getLength()) + (2 * getLength() * getWidth());
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter is invalid in this context.");
	}
	@Override
	public int compareTo(Object one) {
		Cuboid x = (Cuboid) one;
		return Double.compare(this.area(), x.area());
	}
	public class SortByArea implements Comparator<Cuboid>{
		public SortByArea() {
		}
		public int compare(Cuboid x1, Cuboid x2) {
			return x1.compareTo(x2);
		}
	}
	public class SortByVolume implements Comparator<Cuboid>{
		public SortByVolume(){
		}
		public int compare(Cuboid x1, Cuboid x2) {
			return Double.compare(x1.volume(), x2.volume());
		}
	}
}

