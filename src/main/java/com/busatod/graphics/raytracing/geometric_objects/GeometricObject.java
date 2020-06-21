package com.busatod.graphics.raytracing.geometric_objects;

import com.busatod.graphics.raytracing.utilities.RGBColor;
import com.busatod.graphics.raytracing.utilities.Ray;
import com.busatod.graphics.raytracing.utilities.ShadeRec;

public abstract class GeometricObject
{
	public static class HitPoint
	{
		public float    tmin;
		public ShadeRec sr;
		
		public HitPoint(ShadeRec sr)
		{
			this.sr = sr;
		}
	}
	
	protected RGBColor color;    // only used for Bare Bones ray tracing
	
	public RGBColor getColor()
	{
		return color;
	}
	
	public void setColor(RGBColor color)
	{
		this.color = color;
	}
	
	public void setColor(float r, float g, float b)
	{
		setColor(new RGBColor(r, g, b));
	}
	
	public abstract boolean hit(Ray ray, HitPoint hitPoint);
	
}

