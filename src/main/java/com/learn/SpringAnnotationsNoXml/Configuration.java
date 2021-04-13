
package com.learn.SpringAnnotationsNoXml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.learn.SpringAnnotationsNoXml")
@PropertySource("classpath:spring_application.properties")
public class Configuration {

}
