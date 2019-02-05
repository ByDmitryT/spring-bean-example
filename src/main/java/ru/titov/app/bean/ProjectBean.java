package ru.titov.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.titov.app.annotation.RandomUUID;
import ru.titov.app.api.IBean;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProjectBean implements IBean {

    @Value("project desc")
    private String description;

    @RandomUUID
    private String id;

}
