package com.busatod.graphics.raytracing.utilities;

public class Ray
{
	public Point3D  o; // origin
	public Vector3D d; // direction
	
	public Ray(Point3D origin, Vector3D direction)
	{
		this.o = origin;
		this.d = direction;
	}
	
	public Ray(Ray ray)
	{
		this.o = new Point3D(ray.o);
		this.d = new Vector3D(ray.d);
	}
}
