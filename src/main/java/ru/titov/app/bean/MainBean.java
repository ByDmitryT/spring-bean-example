package ru.titov.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.titov.app.api.IBean;

@Component
public class MainBean {

    @Autowired
    @Qualifier("projectBean")
    private IBean bean;

    @Autowired
    @Qualifier("task1")
    private IBean bean2;

}
