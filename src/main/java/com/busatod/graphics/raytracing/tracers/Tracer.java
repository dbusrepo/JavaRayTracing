package com.busatod.graphics.raytracing.tracers;

import com.busatod.graphics.raytracing.utilities.Constants;
import com.busatod.graphics.raytracing.utilities.RGBColor;
import com.busatod.graphics.raytracing.utilities.Ray;
import com.busatod.graphics.raytracing.worlds.World;

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
	
	public RGBColor trace_ray(Ray ray)
	{
		return Constants.BLACK;
	}
	
	public RGBColor trace_ray(Ray ray, int depth)
	{
		return Constants.BLACK;
	}
	
}
