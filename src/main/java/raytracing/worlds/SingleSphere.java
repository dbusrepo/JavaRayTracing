package raytracing.worlds;

import raytracing.Main;
import raytracing.cameras.OrthographicCamera;
import raytracing.geometric_objects.Sphere;
import raytracing.tracers.MultipleObjects;
import raytracing.utilities.Constants;
import raytracing.utilities.Point3D;
import raytracing.utilities.ViewPlane;

public class SingleSphere extends World
{
	public SingleSphere(Main rayTracing)
	{
		super(rayTracing);
	}
	
	@Override
	public void build(int hres, int vres)
	{
		camera = new OrthographicCamera();
		viewPlane = new ViewPlane(hres, vres, 1.0f, 1);
		backgroundColor = Constants.BLACK;
		tracer = new MultipleObjects(this);
		
		Sphere sphere = new Sphere();
		sphere.setCenter(new Point3D(0));
		sphere.setRadius(85);
		sphere.setColor(1, 0, 0); // red
		addObject(sphere);
		
	}
}
