package ru.titov.app.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import ru.titov.app.annotation.RandomUUID;

import java.lang.reflect.Field;
import java.util.UUID;

@Component
public class InjectRandomUUIDBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
        for (final Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(RandomUUID.class)) {
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, UUID.randomUUID().toString());
            }
        }
        return bean;
    }

}
