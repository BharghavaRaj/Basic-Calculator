package com.techpalle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//It is used to indicates that the class as a configuration class and It is used in conjunction with other Spring annotations, such as @ComponentScan,@Bean, @Import, etc.
@Configuration

//It is used in Spring to specify the packages or classes that should be scanned for Spring components, such as controllers, services, repositories, and other beans.
@ComponentScan({"com.techpalle.controller"})
public class MyConfig {

} 