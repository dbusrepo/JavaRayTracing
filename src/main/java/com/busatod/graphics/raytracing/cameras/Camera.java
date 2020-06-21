package com.busatod.graphics.raytracing.cameras;

import com.busatod.graphics.raytracing.utilities.Point3D;
import com.busatod.graphics.raytracing.worlds.World;

public abstract class Camera
{
	protected Point3D eye;
	protected Point3D lookAt;
	
	public Camera(Point3D eye, Point3D lookAt)
	{
		this.eye = eye;
		this.lookAt = lookAt;
	}
	
	public abstract void renderScene(World w);
}
