package com.busatod.graphics.raytracing.tracers;

import com.busatod.graphics.raytracing.utilities.RGBColor;
import com.busatod.graphics.raytracing.utilities.Ray;
import com.busatod.graphics.raytracing.utilities.ShadeRec;
import com.busatod.graphics.raytracing.worlds.World;

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

