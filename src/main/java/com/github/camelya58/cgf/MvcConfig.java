package com.github.camelya58.cgf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class); // Use JstlView if JSTL is in classpath
        resolver.setPrefix("/WEB-INF/views/"); // Location of JSP files
        resolver.setSuffix(".jsp"); // Extension of JSP files
        return resolver;
    }

}
