package raytracing.worlds;

import raytracing.Main;
import raytracing.cameras.OrthographicCamera;
import raytracing.geometric_objects.Plane;
import raytracing.geometric_objects.Sphere;
import raytracing.utilities.Constants;
import raytracing.utilities.Normal;
import raytracing.utilities.Point3D;
import raytracing.utilities.ViewPlane;

public class MultipleObjects extends World
{
	public MultipleObjects(Main rayTracing)
	{
		super(rayTracing);
	}
	
	@Override
	public void build(int hres, int vres)
	{
		camera = new OrthographicCamera();
		viewPlane = new ViewPlane(hres, vres, 1.0f, 1);
		backgroundColor = Constants.BLACK;
		tracer = new raytracing.tracers.MultipleObjects(this);
		
		Sphere sphere = new Sphere();
		sphere.setCenter(new Point3D(0, -25, 0));
		sphere.setRadius(80);
		sphere.setColor(1, 0, 0); // red
		addObject(sphere);
		
		sphere = new Sphere(new Point3D(0, 30, 0), 60);
		sphere.setColor(1, 1, 0);
		addObject(sphere);
		
		Plane plane = new Plane(new Point3D(0), new Normal(0, 1, 1));
		plane.setColor(0, 0.4f, 0);
		addObject(plane);
	}
}
