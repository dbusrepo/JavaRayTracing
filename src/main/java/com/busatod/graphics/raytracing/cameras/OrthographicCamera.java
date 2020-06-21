package com.busatod.graphics.raytracing.cameras;

import com.busatod.graphics.raytracing.tracers.Tracer;
import com.busatod.graphics.raytracing.utilities.*;
import com.busatod.graphics.raytracing.worlds.World;

public class OrthographicCamera extends Camera
{
	public OrthographicCamera()
	{
		super(new Point3D(0, 0, 1), new Point3D(0, 0, -1));
	}
	
	@Override
	public void renderScene(World w)
	{
		float zw = 100.0f; // hardwired in
		Ray ray = new Ray(new Point3D(0), new Vector3D(0, 0, -1));
		ViewPlane vp = w.getViewPlane();
		int ps = vp.getPixelSize();
		int hres = vp.getHres();
		int vres = vp.getVres();
		Point3D o = new Point3D();
		Tracer tracer = w.getTracer();
		
		for (int r = 0; r != vres; ++r) {
			for (int c = 0; c != hres; ++c) {
				float x = ps * (c - 0.5f * (hres - 1));
				float y = ps * (r - 0.5f * (vres - 1));
				o.x = x;
				o.y = y;
				o.z = zw;
				ray.o = o;
				RGBColor pixelColor = tracer.traceRay(ray);
				w.displayPixel(r, c, pixelColor);
			}
		}
	}
	
}
