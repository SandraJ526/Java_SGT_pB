package lv.sandra;

import lv.sandra.graph.Point2D;
import lv.sandra.graph.Point3D;
import lv.sandra.graph.Point4D;

public class TestInheritence {
	
	public static void main (String[] args) {
		
		Point2D point = new Point2D ();	
		System.out.println(point);
		Point2D pointXy = new Point2D(10, -2);
		System.out.println(pointXy.toString());
		
		pointXy.setX(8);
		pointXy.setY(-6);
		System.out.println(pointXy);
		
		System.out.println("x is: " + pointXy.getX());
		
		Point3D pointXyZ = new Point3D (3, 1, 10);
		System.out.println(pointXyZ);
		
		pointXyZ.setY(-99);
		System.out.println(pointXyZ);
		
		Point4D pointXyZt = new Point4D(5,4,2,2);
		System.out.println(pointXyZt);
		
		System.out.println(pointXyZt.getZ());
	}

	
}
