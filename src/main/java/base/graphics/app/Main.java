package base.graphics.app;

public class Main extends GraphicsAppSoftRendering {

	public Main() {
		Settings settings = new Settings();
		settings.title = "Java graphics app";
		settings.showMenu = true;
		start(settings);
	}

	public static void main(String[] args) {
		new Main();
	}
}
