package com.himanshu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.himanshu")
public class HimanshuConfig extends WebMvcConfigurerAdapter
{
  @Bean
  public InternalResourceViewResolver viewResolver()
  {
	  InternalResourceViewResolver vr = new InternalResourceViewResolver();
	  vr.setPrefix("/WEB-INF/");
	  vr.setSuffix(".jsp");
	  
	  return vr;
  }
  
  @Bean
  public ResourceBundleMessageSource messageSource() {

      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
      source.setBasenames("resources/messages");
      source.setUseCodeAsDefaultMessage(true);

      return source;
  }
}
