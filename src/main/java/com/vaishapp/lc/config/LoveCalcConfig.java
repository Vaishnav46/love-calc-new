package com.vaishapp.lc.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.vaishapp.lc.formatters.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.vaishapp.lc")
@PropertySource("classpath:email.properties")
public class LoveCalcConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	Logger logger = Logger.getLogger(LoveCalcConfig.class.getName());

	// bean for view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	// registering formatter - custom for phone
	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside addFormatter method....");
		registry.addFormatter(new PhoneNumberFormatter());
	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

		logger.info("fetching the info for email config :");
		logger.info(env.getProperty("mail.host"));
		logger.info(env.getProperty("mail.username"));
		logger.info(env.getProperty("mail.password"));
		logger.info(env.getProperty("mail.port"));

		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntProperty("mail.port"));

		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		mailProperties.put("mail.smtp.ssl.protocols", "TLSv1.2");

		javaMailSenderImpl.setJavaMailProperties(mailProperties);

		return javaMailSenderImpl;

	}

	// bean for using properties file
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("messages");
		return resourceBundleMessageSource;
	}

	// bean fro validator
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean validatorBean = new LocalValidatorFactoryBean();
		validatorBean.setValidationMessageSource(messageSource());
		return validatorBean;
	}

	// like registering formatter
	@Override
	public Validator getValidator() {
		return validator();
	}

	// helper method

	int getIntProperty(String key) {

		String property = env.getProperty(key);

		return Integer.parseInt(property);
	}

}
