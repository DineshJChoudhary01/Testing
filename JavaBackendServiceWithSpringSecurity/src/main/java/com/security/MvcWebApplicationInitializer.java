package com.security;

import com.calculator.CorsFilter;
import jakarta.servlet.Filter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {
				ApplicationConfiguration.class ,WebAppConfig.class, ViewController.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/BackendForcalculator/*" }; // Set the desired context path
//	}


	@Override
	protected Filter[] getServletFilters() {

		return new Filter[] { new HiddenHttpMethodFilter() };
	}


}
