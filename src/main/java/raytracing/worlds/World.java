package raytracing.worlds;

import raytracing.Main;
import raytracing.cameras.Camera;
import raytracing.geometric_objects.GeometricObject;
import raytracing.tracers.Tracer;
import raytracing.utilities.*;

import java.util.ArrayList;
import java.util.List;

public abstract class World
{
	protected Main            rayTracing;
	protected Camera                camera;
	protected ViewPlane             viewPlane;
	protected RGBColor              backgroundColor;
	protected Tracer                tracer;
	protected List<GeometricObject> objects = new ArrayList<>();
	
	public World(Main rayTracing)
	{
		this.rayTracing = rayTracing;
	}
	
	public RGBColor getBackgroundColor()
	{
		return backgroundColor;
	}
	
	public void setBackgroundColor(RGBColor backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}
	
	public ViewPlane getViewPlane()
	{
		return viewPlane;
	}
	
	public Camera getCamera()
	{
		return camera;
	}
	
	public Tracer getTracer()
	{
		return tracer;
	}
	
	public void addObject(GeometricObject object)
	{
		objects.add(object);
	}
	
	public ShadeRec hitObjects(Ray ray, Float tmin_) // tmin_ = kHugeValue
	{
		ShadeRec sr = new ShadeRec(this);
		GeometricObject.HitPoint hitPoint = new GeometricObject.HitPoint(sr);
		
		float tmin = tmin_ != null ? tmin_ : Constants.INF;
		
		for (GeometricObject obj : objects) {
			if (obj.hit(ray, hitPoint) && (hitPoint.tmin < tmin)) {
				sr.hit_an_object = true;
				tmin = hitPoint.tmin;
				sr.color = obj.getColor();
			}
		}
		
		return sr;
	}
	
	public abstract void build(int hres, int vres);
	
	public void renderScene()
	{
		camera.renderScene(this);
	}
	
	public void displayPixel(int row, int col, RGBColor pixelColor)
	{
		//have to start from max y coordinate to convert to screen coordinates
		int x = col;
		int y = viewPlane.getVres() - row - 1;
		int r = (int) (pixelColor.r * 255);
		int g = (int) (pixelColor.g * 255);
		int b = (int) (pixelColor.b * 255);
		rayTracing.setPixel(x, y, r, g, b);
	}
}
