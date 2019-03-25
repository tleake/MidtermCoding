package testPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import Shape.Rectangle;


public class TestRectangle {
	//Testing construction through correct width declaration
	@Test
	public void ConstructionTest2() {
		try {
			Rectangle r1 = new Rectangle(1, 2);
			int width = r1.getWidth();
			assertEquals(width, 1);
		}catch(Exception e) {
			System.out.println("Construction failed.");
		}
	}
	//Testing Rectangle length getter
	@Test
	public void GetterTest2() {
		try {
			Rectangle r2 = new Rectangle(2, 3);
			int length = r2.getLength();
			assertEquals(length, 3);
		}catch(Exception e) {
			System.out.println("Getter method failed.");
		}
	}
	//Testing Rectangle width setter
	@Test
	public void SetterTest2() {
		try {
			Rectangle r3 = new Rectangle(3, 4);
			r3.setWidth(10);
			assertEquals(r3.getWidth(), 10);
		}catch(Exception e) {
			System.out.println("Setter method failed.");
		}
	}
	//Testing area computations
	@Test
	public void AreaTest2() {
		try {
			Rectangle r4 = new Rectangle(4, 5);
			double area = r4.area();
			assertEquals(area, 20.0, 0);
		}catch(Exception e) {
			System.out.println("Area method returns invalid.");
		}
	}
	//Testing perimeter computations
	@Test
	public void PerimeterTest2(){
		try {
			Rectangle r5 = new Rectangle(5, 6);
			double perimeter = r5.perimeter();
			assertEquals(perimeter, 22, 0);
		}catch(Exception e) {
			System.out.println("Perimeter method returns invalid");
		}
	}
	//Testing ascending sorting by area
	@Test
	public void SortRectangleTest() {
		try {
			Rectangle r6 = new Rectangle(1, 2);
			Rectangle r7 = new Rectangle(2, 3);
			Rectangle r8 = new Rectangle(3, 4);
			Rectangle r9 = new Rectangle(4, 5);
			ArrayList<Rectangle> RectangleList = new ArrayList<Rectangle>();
			RectangleList.add(r6);
			RectangleList.add(r7);
			RectangleList.add(r8);
			RectangleList.add(r9);
			Collections.sort(RectangleList);
			assertEquals(RectangleList.get(0), r6);
		}catch(Exception e) {
			System.out.println("SortByArea failed to sort.");
		}
	}
	//Testing if exception is thrown
	@Test(expected = IllegalArgumentException.class)
	public void ExceptionTest2() throws Exception{
		Rectangle r10 = new Rectangle(-5, 6);
	}
}
