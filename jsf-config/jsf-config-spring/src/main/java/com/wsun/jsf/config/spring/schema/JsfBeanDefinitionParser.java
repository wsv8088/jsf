package com.wsun.jsf.config.spring.schema;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created by Administrator on 2017/11/3.
 */
@Slf4j
public class JsfBeanDefinitionParser implements BeanDefinitionParser {
    private final Class<?> beanClass;
    private final boolean required;

    public JsfBeanDefinitionParser(Class<?> beanClass, boolean required) {
        this.beanClass = beanClass;
        this.required = required;
    }

    public BeanDefinition parse(Element element, ParserContext parserContext, Class<?> beanClass, boolean required) {
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setLazyInit(false);
        String id = element.getAttribute("id");
        beanDefinition.getPropertyValues().add("id", id);
        return beanDefinition;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        return parse(element, parserContext, beanClass, required);
    }
}
