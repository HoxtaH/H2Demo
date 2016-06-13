package com.example;



import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean                                                           //@Bean inverts control for object creation within spring
    ServletRegistrationBean h2servletRegistration(){                    //Aspect Oriented Programming example.  (Objects do not need to be aware of other objects only aspects of other objects)
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");              //H2 is present, However
        return registrationBean;
    }
}

