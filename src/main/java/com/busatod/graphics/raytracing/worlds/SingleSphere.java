package com.busatod.graphics.raytracing.worlds;

import com.busatod.graphics.raytracing.RayTracing;
import com.busatod.graphics.raytracing.cameras.OrthographicCamera;
import com.busatod.graphics.raytracing.geometric_objects.Sphere;
import com.busatod.graphics.raytracing.tracers.MultipleObjects;
import com.busatod.graphics.raytracing.utilities.Constants;
import com.busatod.graphics.raytracing.utilities.Point3D;
import com.busatod.graphics.raytracing.utilities.ViewPlane;

public class SingleSphere extends World
{
	public SingleSphere(RayTracing rayTracing)
	{
		super(rayTracing);
	}
	
	@Override
	public void build(int hres, int vres)
	{
		camera = new OrthographicCamera();
		viewPlane = new ViewPlane(hres, vres, 1, 1);
		backgroundColor = Constants.BLACK;
		tracer = new MultipleObjects(this);
		
		Sphere sphere = new Sphere();
		sphere.setCenter(new Point3D(0));
		sphere.setRadius(85);
		sphere.setColor(1, 0, 0); // red
		addObject(sphere);
		
	}
}
