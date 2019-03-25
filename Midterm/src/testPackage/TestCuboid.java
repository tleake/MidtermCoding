package testPackage;


import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;
import org.junit.Test;

import Shape.Cuboid;

public class TestCuboid {
	//Testing for construction through correct depth declaration
	@Test
	public void ConstructionTest() {
		try {
			Cuboid c1 = new Cuboid(1, 2, 3);
			int depth = c1.getDepth();
			assertEquals(depth, 3);
		}catch(Exception e) {
			System.out.println("Construction failed.");
		}
	}
	//Testing Cuboid Getter
	@Test
	public void GetterTest() {
		try {
			Cuboid c2 = new Cuboid(2, 3, 4);
			int depth = c2.getDepth();
			assertEquals(depth, 4);
		}catch(Exception e) {
			System.out.println("Getter method failed.");
		}
	}
	//Testing Cuboid Setter
	@Test
	public void SetterTest() {
		try {
			Cuboid c3 = new Cuboid(3, 4, 5);
			c3.setDepth(10);
			assertEquals(c3.getDepth(), 10);
		}catch(Exception e) {
			System.out.println("Setter method failed.");
		}
	}
	//Testing area computations
	@Test
	public void AreaTest() {
		try {
			Cuboid c4 = new Cuboid(4, 5, 6);
			double area = c4.area();
			assertEquals(area, 148.0, 0);
		}catch(Exception e) {
			System.out.println("Area method returns invalid.");
		}
	}
	//Testing if exception is thrown
	@Test(expected = UnsupportedOperationException.class)
	public void PerimeterTest() throws Exception{
		Cuboid c5 = new Cuboid(5, 6, 7);
		c5.perimeter();
	}
	//Testing if exception is thrown
	@Test(expected = IllegalArgumentException.class)
	public void DepthTest() throws Exception{
		Cuboid c6 = new Cuboid(6, 7, -1);
	}
	//Testing ascending sorting by area
	@Test
	public void SortByAreaTest() {
		try {
			Cuboid c7 = new Cuboid(1, 2, 3);
			Cuboid c8 = new Cuboid(2, 3, 4);
			Cuboid c9 = new Cuboid(3, 4, 5);
			Cuboid c10 = new Cuboid(4, 5, 6);
			Cuboid c = new Cuboid();
			ArrayList<Cuboid> AreaList = new ArrayList<Cuboid>();
			AreaList.add(c7);
			AreaList.add(c8);
			AreaList.add(c9);
			AreaList.add(c10);
			Collections.sort(AreaList, c.new SortByArea());
			assertEquals(AreaList.get(0), c7);
		}catch(Exception e) {
			System.out.println("SortByArea failed to sort.");
		}
	}
	//Testing ascending sorting by volume
	@Test
	public void SortByVolumeTest() {
		try {
			Cuboid c11 = new Cuboid(1, 2, 3);
			Cuboid c12 = new Cuboid(2, 3, 4);
			Cuboid c13 = new Cuboid(3, 4, 5);
			Cuboid c14 = new Cuboid(4, 5, 6);
			Cuboid c = new Cuboid();
			ArrayList<Cuboid> VolumeList = new ArrayList<Cuboid>();
			VolumeList.add(c14);
			VolumeList.add(c12);
			VolumeList.add(c11);
			VolumeList.add(c13);
			Collections.sort(VolumeList, c.new SortByVolume());
			assertEquals(VolumeList.get(0), c11);
		}catch(Exception e) {
			System.out.println("SortByVolume failed to sort.");
		}
	}
}