package raytracing.geometric_objects;

import raytracing.utilities.Normal;
import raytracing.utilities.Point3D;
import raytracing.utilities.Ray;

public class Plane extends GeometricObject
{
	private static final float EPS = 0.001f;
	
	private final Point3D a;    // point through which plane passes
	private final Normal  n;    // normal to the plane
	
	public Plane(Point3D a, Normal n)
	{
		this.a = a; // save the references...
		this.n = n;
	}
	
	public Plane(Plane p)
	{
		this(new Point3D(p.a), new Normal(p.n)); // copy the fields...
	}
	
	@Override
	public boolean hit(Ray ray, HitPoint hitPoint)
	{
		float t = a.sub(ray.o).dot(n) / (ray.d.dot(n));
		
		if (t > EPS) {
			hitPoint.tmin = t;
			hitPoint.sr.normal = n;
			hitPoint.sr.world_hit_point = ray.o.add(ray.d.scale(t));
			return (true);
		}
		
		return false;
	}
}
