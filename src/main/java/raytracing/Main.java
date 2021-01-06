package raytracing;

import java.awt.Color;
import java.awt.Graphics2D;

import base.graphics.app.GraphAppSoftRendering;
import base.graphics.app.Settings;
import raytracing.worlds.SingleSphere;
import raytracing.worlds.World;

public class Main extends GraphAppSoftRendering {
	Settings settings;
	private World world;

	public Main() throws Exception {
		settings = new Settings();
		settings.winWidth = 300;
		settings.winHeight = 300;
		settings.title = "Ray tracing";
		settings.showMenu = true;
		start(settings);
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

	@Override
	public void initApp() {
		initFrameImage();
//		world = new MultipleObjects(this);
		world = new SingleSphere(this);
		world.build(frameImage.getWidth(), frameImage.getHeight());
	}

	@Override
	protected void appDrawImage(Graphics2D g) {
		g.setBackground(Color.BLACK);
		g.clearRect(0, 0, frameImage.getWidth(), frameImage.getHeight());
		world.renderScene();
	}

	public void setPixel(int x, int y, int r, int g, int b) {
		int pos = frameImage.getWidth() * y + x; // *4 implicit
		pixels[pos] = (0xFF << 24) | (r << 16) | (g << 8) | b;
	}

	@Override
	public void updateApp(long elapsedTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finishOffApp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printFinalStatsApp() {
		// TODO Auto-generated method stub

	}

}
