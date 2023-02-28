package com.tian;
/**
 * 这个代码是用Spring Boot框架写的，它的作用是让你的应用可以以WAR包的形式部署在Web容器中。
 * ServletInitializer类继承了SpringBootServletInitializer接口，
 * 重写了configure方法，把Application类作为参数传递给SpringApplicationBuilder对象，然后返回这个对象
 * 这样就可以启动Spring Boot应用，并把Servlet，Filter和ServletContextInitializer等Bean绑定到服务器上
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 打成war包
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
