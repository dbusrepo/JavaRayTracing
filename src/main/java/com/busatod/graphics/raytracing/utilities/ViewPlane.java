package com.busatod.graphics.raytracing.utilities;

public class ViewPlane
{
	int   hres;                                       // horizontal image resolution
	int   vres;                                       // vertical image resolution
	float pixelSize;                                  // pixel size
	private float gamma;                              // gamma correction factor
	private float invGamma;                          // the inverse of the gamma correction factor
	
	public ViewPlane(int hres, int vres, float ps, float gamma)
	{
		this.hres = hres;
		this.vres = vres;
		this.pixelSize = ps;
		setGamma(gamma);
	}
	
	public ViewPlane(ViewPlane vp)
	{
		this.hres = vp.hres;
		this.vres = vp.vres;
		this.pixelSize = vp.pixelSize;
		this.gamma = vp.gamma;
		this.invGamma = vp.invGamma;
	}
	
	public float getGamma()
	{
		return gamma;
	}
	
	public void setGamma(float gamma)
	{
		this.gamma = gamma;
		this.invGamma = 1.0f / gamma;
	}
	
	public float getInvGamma()
	{
		return invGamma;
	}
	
	public int getHres()
	{
		return hres;
	}
	
	public void setHres(int hres)
	{
		this.hres = hres;
	}
	
	public int getVres()
	{
		return vres;
	}
	
	public void setVres(int vres)
	{
		this.vres = vres;
	}
	
	public float getPixelSize()
	{
		return pixelSize;
	}
	
	public void setPixelSize(float pixelSize)
	{
		this.pixelSize = pixelSize;
	}
}
