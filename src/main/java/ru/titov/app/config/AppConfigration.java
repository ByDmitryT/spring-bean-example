package ru.titov.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.titov.app.bean.ProjectBean;

@Configuration
public class AppConfigration {

    @Bean
    public ProjectBean getProjectBean() {
        return new ProjectBean();
    }

}
