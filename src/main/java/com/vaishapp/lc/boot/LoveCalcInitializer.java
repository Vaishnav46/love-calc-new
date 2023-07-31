package com.vaishapp.lc.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.vaishapp.lc.config.LoveCalcConfig;

public class LoveCalcInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
//		//when using xml
//		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
//		applicationContext.setConfigLocation("classpath:mvc-demo.xml");
		
		//when using java based config
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(LoveCalcConfig.class);
		System.out.println("Load on startup Please");
		
		//create dispatcher servlet and add config in it
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		
		//register dispatcher servlet with servlet context
		
		ServletRegistration.Dynamic myServlet =  servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myServlet.setLoadOnStartup(1);
		myServlet.addMapping("/mywebsite.com/*","/");
		
		 
		
		
	}

}
