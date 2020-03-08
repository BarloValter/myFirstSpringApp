package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration /*сообщает Spring что данный класс является конфигурационным и содержит определения и зависимости bean-компонентов*/
@EnableWebMvc
@ComponentScan(basePackages = "com.example")/*сообщает Spring где искать компоненты, которыми должен управлять, т.е. классы, помеченные аннотацией @Component или ее производными, такими как @Controller, @Repository, @Service*/
public class WebConfig implements WebMvcConfigurer {

    @Bean /*Бины (bean) — это объекты, которые управляются Spring'ом. Для определения бина используется аннотация @Bean*/
    /*В методе viewResolver() создаем реализацию и определяем где именно искать представления в webapp.
    Поэтому когда в методе контроллера мы устанавливали имя "phones" представление найдется как "WEB-INF/pages/phones.jsp*/
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
