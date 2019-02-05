package ru.titov.app.bean;

import ru.titov.app.api.IBean;

public class TaskBean implements IBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
