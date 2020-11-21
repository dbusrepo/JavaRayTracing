package raytracing;

import com.busatod.graphics.app.GraphicsApplication;
import com.busatod.graphics.app.Settings;

import raytracing.worlds.SingleSphere;
import raytracing.worlds.World;

public class Main extends GraphicsApplication
{
	Settings settings;
	private World world;
	
	public Main()
	{
		settings = new Settings();
		// set the physical dimensions of the window
		settings.width = 300;
		settings.height = 300;
		settings.title = "Ray tracing";
		start(settings);
	}
	
	@Override
	protected void appInit()
	{
//		world = new MultipleObjects(this);
		world = new SingleSphere(this);
		world.build(settings.width, settings.height);
	}
	
	@Override
	protected void appUpdate(long elapsedTime)
	{
	
	}
	
	@Override
	protected void appDraw()
	{
		drawBackground();
		world.renderScene();
	}
	
	@Override
	protected void appFinishOff()
	{
	}
	
	@Override
	protected void appPrintFinalStats()
	{
	}
	
	public void setPixel(int x, int y, int r, int g, int b)
	{
		int pos = settings.width * y + x; // *4 implicit
		pixels[pos] = (0xFF << 24) | (r << 16) | (g << 8) | b;
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
}

