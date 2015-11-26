package com.prototype.merchant;

import org.hsqldb.server.Servlet;
import org.hsqldb.server.WebServer;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by david.hong on 24/11/2015.
 */
@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new Servlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
