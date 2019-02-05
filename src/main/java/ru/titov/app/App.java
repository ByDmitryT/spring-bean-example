package ru.titov.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.titov.app.bean.MainBean;
import ru.titov.app.bean.ProjectBean;
import ru.titov.app.bean.TaskBean;

public class App {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        final ProjectBean projectBean = context.getBean("getProjectBean", ProjectBean.class);
        final ProjectBean projectBean1 = context.getBean("projectBean", ProjectBean.class);
        final TaskBean taskBean = context.getBean("task1", TaskBean.class);
        final TaskBean taskBean2 = context.getBean("task1", TaskBean.class);
        final TaskBean taskBean3 = context.getBean("task2", TaskBean.class);
        final TaskBean taskBean4 = context.getBean("task2", TaskBean.class);
        final TaskBean taskBean5 = context.getBean("ru.titov.app.bean.TaskBean#0", TaskBean.class);
        for (final String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

}
