package raytracing.tracers;

import raytracing.utilities.RGBColor;
import raytracing.utilities.Ray;
import raytracing.utilities.ShadeRec;
import raytracing.worlds.World;

public class MultipleObjects extends Tracer
{
	public MultipleObjects()
	{
	}
	
	public MultipleObjects(World world)
	{
		super(world);
	}
	
	@Override
	public RGBColor traceRay(Ray ray)
	{
		ShadeRec sr = getWorld().hitObjects(ray, null);
		if (sr.hit_an_object) {
			return sr.color;
		} else {
			return getWorld().getBackgroundColor();
		}
	}
}

