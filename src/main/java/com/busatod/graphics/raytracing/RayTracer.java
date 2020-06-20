package com.busatod.graphics.raytracing;

import main.java.com.busatod.graphics.app.GraphicsApplication;
import main.java.com.busatod.graphics.app.Settings;

public class RayTracer extends GraphicsApplication {

	public static void main(String[] args) {
		//		System.out.println("Ray Tracing!!");
		new RayTracer();
	}

	public RayTracer() {
		Settings settings = new Settings();
		settings.title = "Ray Tracing!!";
		start(settings);
	}

	@Override
	protected void appInit() {

	}

	@Override
	protected void appUpdate(long elapsedTime) {

	}

	@Override
	protected void appFinishOff() {

	}

	@Override
	protected void appPrintFinalStats() {

	}
}

