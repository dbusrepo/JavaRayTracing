package raytracing.tracers;

import raytracing.utilities.Constants;
import raytracing.utilities.RGBColor;
import raytracing.utilities.Ray;
import raytracing.worlds.World;

public class Tracer
{
	private World world;
	
	public Tracer()
	{
	}
	
	public Tracer(World world)
	{
		this.world = world;
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public void setWorld(World world)
	{
		this.world = world;
	}
	
	public RGBColor traceRay(Ray ray)
	{
		return Constants.BLACK;
	}
	
	public RGBColor traceRay(Ray ray, int depth)
	{
		return Constants.BLACK;
	}
	
}
