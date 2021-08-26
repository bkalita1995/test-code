package com.demo1.mymodule;

import com.demo1.servlet.MyServlet;
import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class MyModule extends ServletModule{
	
	@Override
	protected void configureServlets() {
		serve("/").with(MyServlet.class);
	}

}
