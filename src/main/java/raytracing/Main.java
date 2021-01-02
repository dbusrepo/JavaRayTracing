package raytracing;

import java.awt.Color;
import java.awt.Graphics2D;

import base.graphics.app.GraphicsAppSoftRendering;
import base.graphics.app.Settings;
import raytracing.worlds.SingleSphere;
import raytracing.worlds.World;

public class Main extends GraphicsAppSoftRendering {
	Settings settings;
	private World world;

	public Main() {
		settings = new Settings();
		settings.width = 300;
		settings.height = 300;
		settings.title = "Ray tracing";
		settings.showMenu = true;
		start(settings);
	}

	@Override
	protected void appInit() {
		initFrameImage();
//		world = new MultipleObjects(this);
		world = new SingleSphere(this);
		world.build(frameImage.getWidth(), frameImage.getHeight());
	}

	@Override
	protected void appUpdate(long elapsedTime) {
	}

	@Override
	protected void appDrawImage(Graphics2D g) {
		g.setBackground(Color.BLACK);
		g.clearRect(0, 0, frameImage.getWidth(), frameImage.getHeight());
		world.renderScene();
	}

	@Override
	protected void appFinishOff() {
	}

	@Override
	protected void appPrintFinalStats() {
	}

	public void setPixel(int x, int y, int r, int g, int b) {
		int pos = frameImage.getWidth() * y + x; // *4 implicit
		pixels[pos] = (0xFF << 24) | (r << 16) | (g << 8) | b;
	}

	public static void main(String[] args) {
		new Main();
	}
}
