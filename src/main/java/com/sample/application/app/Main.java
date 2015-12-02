package com.sample.application.app;

import org.apache.catalina.LifecycleException;

import com.sample.application.container.TomcatEmbeddedRunner;

public class Main {
	public static void main(final String[] args) throws LifecycleException {
			System.out.println("### STARTING EMBEDDED TOMCAT CONTAINER");
			new TomcatEmbeddedRunner().startServer();
	}
}
