package com.techpalle;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//It can tells the spring which is configuration class and what should be the default URL for servlet.
public class MyInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class [] {MyConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}

}
